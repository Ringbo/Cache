diff --git a/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryCreateDateComparator.java b/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryCreateDateComparator.java
index 809c3eb..72fb5e57 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryCreateDateComparator.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/workflow/comparator/WorkflowInstanceHistoryCreateDateComparator.java
@@ -61,7 +61,7 @@
 
 		if (value != 0) {
 			Long historyId1 = history1.getHistoryEntryId();
-			Long historyId2 = history2.getWorkflowInstanceId();
+			Long historyId2 = history2.getHistoryEntryId();
 
 			value = historyId1.compareTo(historyId2);
 		}
