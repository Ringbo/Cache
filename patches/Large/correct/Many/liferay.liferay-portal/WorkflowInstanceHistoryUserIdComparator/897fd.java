diff --git a/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryUserIdComparator.java b/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryUserIdComparator.java
index a18f207..de99fba 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryUserIdComparator.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryUserIdComparator.java
@@ -58,7 +58,7 @@
 
 		if (value == 0) {
 			Long historyId1 = history1.getHistoryEntryId();
-			Long historyId2 = history2.getWorkflowInstanceId();
+			Long historyId2 = history2.getHistoryEntryId();
 
 			value = historyId1.compareTo(historyId2);
 		}
