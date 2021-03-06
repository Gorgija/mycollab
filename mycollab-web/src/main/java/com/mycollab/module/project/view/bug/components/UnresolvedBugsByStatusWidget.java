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
package com.mycollab.module.project.view.bug.components;

import com.mycollab.common.domain.GroupItem;
import com.mycollab.db.arguments.SetSearchField;
import com.mycollab.eventmanager.EventBusFactory;
import com.mycollab.module.project.event.BugEvent;
import com.mycollab.module.project.i18n.BugI18nEnum;
import com.mycollab.module.project.i18n.OptionI18nEnum;
import com.mycollab.module.project.i18n.OptionI18nEnum.BugStatus;
import com.mycollab.module.project.view.bug.IStatusSummaryChartWidget;
import com.mycollab.module.tracker.domain.criteria.BugSearchCriteria;
import com.mycollab.module.tracker.service.BugService;
import com.mycollab.spring.AppContextUtil;
import com.mycollab.vaadin.UserUIContext;
import com.mycollab.vaadin.mvp.ViewManager;
import com.mycollab.vaadin.web.ui.ButtonI18nComp;
import com.mycollab.vaadin.web.ui.DepotWithChart;
import com.mycollab.vaadin.web.ui.ProgressBarIndicator;
import com.mycollab.vaadin.web.ui.WebUIConstants;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import org.vaadin.viritin.button.MButton;
import org.vaadin.viritin.layouts.MHorizontalLayout;

import java.util.List;

/**
 * @author MyCollab Ltd
 * @since 5.2.0
 */
public class UnresolvedBugsByStatusWidget extends DepotWithChart {
    private BugSearchCriteria searchCriteria;
    private int totalCount;
    private List<GroupItem> groupItems;

    public void setSearchCriteria(final BugSearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;

        BugService bugService = AppContextUtil.getSpringBean(BugService.class);
        totalCount = bugService.getTotalCount(searchCriteria);
        this.setTitle(UserUIContext.getMessage(BugI18nEnum.WIDGET_UNRESOLVED_BY_STATUS_TITLE) + " (" + totalCount + ")");
        groupItems = bugService.getStatusSummary(searchCriteria);
        displayPlainMode();
    }

    @Override
    protected void displayChartMode() {
        bodyContent.removeAllComponents();
        IStatusSummaryChartWidget statusSummaryChartWidget = ViewManager.getCacheComponent(IStatusSummaryChartWidget.class);
        statusSummaryChartWidget.displayChart(searchCriteria);
        bodyContent.addComponent(statusSummaryChartWidget);
    }

    @Override
    protected void displayPlainMode() {
        bodyContent.removeAllComponents();
        BugStatusClickListener listener = new BugStatusClickListener();
        if (!groupItems.isEmpty()) {
            for (BugStatus status : OptionI18nEnum.bug_statuses) {
                boolean isFound = false;
                for (GroupItem item : groupItems) {
                    if (status.name().equals(item.getGroupid())) {
                        isFound = true;
                        MHorizontalLayout statusLayout = new MHorizontalLayout().withFullWidth();
                        statusLayout.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
                        MButton statusLink = new ButtonI18nComp(status.name(), status, listener)
                                .withIcon(FontAwesome.FLAG).withStyleName(WebUIConstants.BUTTON_LINK).withWidth("110px");

                        ProgressBarIndicator indicator = new ProgressBarIndicator(totalCount, totalCount - item.getValue().intValue(), false);
                        indicator.setWidth("100%");
                        statusLayout.with(statusLink, indicator).expand(indicator);
                        bodyContent.addComponent(statusLayout);
                    }
                }

                if (!isFound && !status.name().equals(BugStatus.Resolved.name()) &&
                        !status.name().equals(BugStatus.Verified.name())) {
                    MHorizontalLayout statusLayout = new MHorizontalLayout().withFullWidth();
                    statusLayout.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
                    Button statusLink = new ButtonI18nComp(status.name(), status, listener);
                    statusLink.setWidth("110px");
                    statusLink.setIcon(FontAwesome.FLAG);
                    statusLink.setStyleName(WebUIConstants.BUTTON_LINK);
                    ProgressBarIndicator indicator = new ProgressBarIndicator(totalCount, totalCount, false);
                    indicator.setWidth("100%");
                    statusLayout.with(statusLink, indicator).expand(indicator);
                    bodyContent.addComponent(statusLayout);
                }
            }
        }
    }

    private class BugStatusClickListener implements Button.ClickListener {
        private static final long serialVersionUID = 1L;

        @Override
        public void buttonClick(final Button.ClickEvent event) {
            String key = ((ButtonI18nComp) event.getButton()).getKey();
            searchCriteria.setStatuses(new SetSearchField<>(key));
            EventBusFactory.getInstance().post(new BugEvent.SearchRequest(this, searchCriteria));
        }
    }
}
