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
package com.mycollab.module.project.event

import com.mycollab.events.ApplicationEvent
import com.mycollab.module.tracker.domain.SimpleBug
import com.mycollab.module.tracker.domain.criteria.BugSearchCriteria

/**
  * @author MyCollab Ltd.
  * @since 5.0.3
  */
object BugEvent {

  class GotoAdd(source: AnyRef, data: AnyRef) extends ApplicationEvent(source, data) {}

  class GotoEdit(source: AnyRef, data: AnyRef) extends ApplicationEvent(source, data) {}

  class GotoList(source: AnyRef, data: BugSearchCriteria) extends ApplicationEvent(source, data) {}

  class GotoRead(source: AnyRef, data: AnyRef) extends ApplicationEvent(source, data) {}

  class GotoKanbanView(source: AnyRef, data: AnyRef) extends ApplicationEvent(source, data) {}

  class SearchRequest(source: AnyRef, data: BugSearchCriteria) extends ApplicationEvent(source, data) {}

  class NewBugAdded(source: AnyRef, data: Integer) extends ApplicationEvent(source, data) {}

  class BugChanged(source: AnyRef, data: Integer) extends ApplicationEvent(source, data) {}

}
