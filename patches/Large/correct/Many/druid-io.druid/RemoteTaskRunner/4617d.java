diff --git a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java
index a823e0c..32c5bed 100644
--- a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java
+++ b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java
@@ -691,7 +691,7 @@
           {
             int retVal = -Ints.compare(zkWorker.getCurrCapacityUsed(), zkWorker2.getCurrCapacityUsed());
             if (retVal == 0) {
-              retVal = zkWorker.getWorker().getHost().compareTo(zkWorker.getWorker().getHost());
+              retVal = zkWorker.getWorker().getHost().compareTo(zkWorker2.getWorker().getHost());
             }
 
             return retVal;
