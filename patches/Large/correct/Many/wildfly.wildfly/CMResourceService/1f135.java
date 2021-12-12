diff --git a/transactions/src/main/java/org/jboss/as/txn/service/CMResourceService.java b/transactions/src/main/java/org/jboss/as/txn/service/CMResourceService.java
index 1d0b2ea..cb9e5f2 100644
--- a/transactions/src/main/java/org/jboss/as/txn/service/CMResourceService.java
+++ b/transactions/src/main/java/org/jboss/as/txn/service/CMResourceService.java
@@ -82,7 +82,7 @@
     public void stop(StopContext context) {
         jtaEnvironmentBean.getValue().getCommitMarkableResourceJNDINames().remove(jndiName);
         jtaEnvironmentBean.getValue().getCommitMarkableResourceTableNameMap().remove(tableName);
-        jtaEnvironmentBean.getValue().getPerformImmediateCleanupOfCommitMarkableResourceBranchesMap().remove(immediateCleanup);
+        jtaEnvironmentBean.getValue().getPerformImmediateCleanupOfCommitMarkableResourceBranchesMap().remove(jndiName);
         jtaEnvironmentBean.getValue().getCommitMarkableResourceRecordDeleteBatchSizeMap().remove(jndiName);
 
     }
