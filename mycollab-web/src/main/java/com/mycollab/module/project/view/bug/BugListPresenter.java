/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.project.view.bug;

import com.mycollab.db.persistence.service.ISearchableService;
import com.mycollab.module.project.CurrentProjectVariables;
import com.mycollab.module.project.ProjectRolePermissionCollections;
import com.mycollab.module.project.view.ProjectBreadcrumb;
import com.mycollab.module.project.view.ProjectGenericListPresenter;
import com.mycollab.module.tracker.domain.SimpleBug;
import com.mycollab.module.tracker.domain.criteria.BugSearchCriteria;
import com.mycollab.module.tracker.service.BugService;
import com.mycollab.spring.AppContextUtil;
import com.mycollab.vaadin.events.SearchHandler;
import com.mycollab.vaadin.mvp.*;
import com.mycollab.vaadin.ui.NotificationUtil;
import com.vaadin.ui.ComponentContainer;

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
@LoadPolicy(scope = ViewScope.PROTOTYPE)
public class BugListPresenter extends ProjectGenericListPresenter<BugListView, BugSearchCriteria, SimpleBug>
        implements ListCommand<BugSearchCriteria> {
    private static final long serialVersionUID = 1L;
    private BugService bugService;

    public BugListPresenter() {
        super(BugListView.class);
        bugService = AppContextUtil.getSpringBean(BugService.class);
    }

    @Override
    protected void viewAttached() {
        view.getSearchHandlers().addSearchHandler(criteria -> doSearch(criteria));
    }

    @Override
    protected void onGo(ComponentContainer container, ScreenData<?> data) {
        if (CurrentProjectVariables.canRead(ProjectRolePermissionCollections.BUGS)) {
            BugContainer trackerContainer = (BugContainer) container;
            trackerContainer.removeAllComponents();
            trackerContainer.addComponent(view);
            String query = (data != null && data.getParams() instanceof String) ? (String) data.getParams() : "";
            view.displayView(query);

            ProjectBreadcrumb breadcrumb = ViewManager.getCacheComponent(ProjectBreadcrumb.class);
            breadcrumb.gotoBugList(query);
        } else {
            NotificationUtil.showMessagePermissionAlert();
        }
    }

    @Override
    public void doSearch(BugSearchCriteria searchCriteria) {
        view.queryBug(searchCriteria);
    }

    @Override
    public ISearchableService<BugSearchCriteria> getSearchService() {
        return bugService;
    }

    @Override
    protected void deleteSelectedItems() {
        throw new UnsupportedOperationException("This presenter doesn't support this operation");
    }
}
