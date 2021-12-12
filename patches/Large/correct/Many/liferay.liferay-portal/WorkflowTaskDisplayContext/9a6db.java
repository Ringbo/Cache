diff --git a/modules/apps/workflow/workflow-task-web/src/main/java/com/liferay/workflow/task/web/display/context/WorkflowTaskDisplayContext.java b/modules/apps/workflow/workflow-task-web/src/main/java/com/liferay/workflow/task/web/display/context/WorkflowTaskDisplayContext.java
index 4a7c0b3..a09bc7d 100644
--- a/modules/apps/workflow/workflow-task-web/src/main/java/com/liferay/workflow/task/web/display/context/WorkflowTaskDisplayContext.java
+++ b/modules/apps/workflow/workflow-task-web/src/main/java/com/liferay/workflow/task/web/display/context/WorkflowTaskDisplayContext.java
@@ -313,24 +313,24 @@
 			total = WorkflowTaskManagerUtil.searchCount(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(), searchTerms.getName(),
-				searchTerms.getType(), null, null, null, false, true,
-				searchTerms.isAndOperator());
+				searchTerms.getKeywords(), searchTerms.getType(), null, null,
+				null, false, true, searchTerms.isAndOperator());
 
 			searchContainer.setTotal(total);
 
 			results = WorkflowTaskManagerUtil.search(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(), searchTerms.getName(),
-				searchTerms.getType(), null, null, null, false, true,
-				searchTerms.isAndOperator(), searchContainer.getStart(),
-				searchContainer.getEnd(),
+				searchTerms.getKeywords(), searchTerms.getType(), null, null,
+				null, false, true, searchTerms.isAndOperator(),
+				searchContainer.getStart(), searchContainer.getEnd(),
 				searchContainer.getOrderByComparator());
 		}
 		else {
 			total = WorkflowTaskManagerUtil.searchCount(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(),
-				searchTerms.getKeywords(),
+				searchTerms.getKeywords(), searchTerms.getKeywords(),
 				WorkflowHandlerUtil.getSearchableAssetTypes(), false, true);
 
 			searchContainer.setTotal(total);
@@ -338,7 +338,7 @@
 			results = WorkflowTaskManagerUtil.search(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(),
-				searchTerms.getKeywords(),
+				searchTerms.getKeywords(), searchTerms.getKeywords(),
 				WorkflowHandlerUtil.getSearchableAssetTypes(), false, true,
 				searchContainer.getStart(), searchContainer.getEnd(),
 				searchContainer.getOrderByComparator());
@@ -911,24 +911,24 @@
 			total = WorkflowTaskManagerUtil.searchCount(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(), searchTerms.getName(),
-				searchTerms.getType(), null, null, null, false, false,
-				searchTerms.isAndOperator());
+				searchTerms.getKeywords(), searchTerms.getType(), null, null,
+				null, false, false, searchTerms.isAndOperator());
 
 			searchContainer.setTotal(total);
 
 			results = WorkflowTaskManagerUtil.search(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(), searchTerms.getName(),
-				searchTerms.getType(), null, null, null, completedTasks, false,
-				searchTerms.isAndOperator(), searchContainer.getStart(),
-				searchContainer.getEnd(),
+				searchTerms.getKeywords(), searchTerms.getType(), null, null,
+				null, completedTasks, false, searchTerms.isAndOperator(),
+				searchContainer.getStart(), searchContainer.getEnd(),
 				searchContainer.getOrderByComparator());
 		}
 		else {
 			total = WorkflowTaskManagerUtil.searchCount(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(),
-				searchTerms.getKeywords(),
+				searchTerms.getKeywords(), searchTerms.getKeywords(),
 				WorkflowHandlerUtil.getSearchableAssetTypes(), completedTasks,
 				false);
 
@@ -937,7 +937,7 @@
 			results = WorkflowTaskManagerUtil.search(
 				_workflowTaskRequestHelper.getCompanyId(),
 				_workflowTaskRequestHelper.getUserId(),
-				searchTerms.getKeywords(),
+				searchTerms.getKeywords(), searchTerms.getKeywords(),
 				WorkflowHandlerUtil.getSearchableAssetTypes(), completedTasks,
 				false, searchContainer.getStart(), searchContainer.getEnd(),
 				searchContainer.getOrderByComparator());
