diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMHA.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMHA.java
index 47c053c..000f4a4 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMHA.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/test/java/org/apache/hadoop/yarn/server/resourcemanager/TestRMHA.java
@@ -465,8 +465,7 @@
 
     MemoryRMStateStore memStore = new MemoryRMStateStore() {
       @Override
-      public synchronized void updateApplicationState(
-          ApplicationStateData appState) {
+      public void updateApplicationState(ApplicationStateData appState) {
         notifyStoreOperationFailed(new StoreFencedException());
       }
     };
