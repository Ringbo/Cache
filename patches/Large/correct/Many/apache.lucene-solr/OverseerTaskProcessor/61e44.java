diff --git a/solr/core/src/java/org/apache/solr/cloud/OverseerTaskProcessor.java b/solr/core/src/java/org/apache/solr/cloud/OverseerTaskProcessor.java
index 3b53a54..d5557e8 100644
--- a/solr/core/src/java/org/apache/solr/cloud/OverseerTaskProcessor.java
+++ b/solr/core/src/java/org/apache/solr/cloud/OverseerTaskProcessor.java
@@ -345,7 +345,7 @@
     synchronized (completedTasks) {
       for (String id : completedTasks.keySet()) {
         workQueue.remove(completedTasks.get(id));
-        synchronized (runningTasks) {
+        synchronized (runningZKTasks) {
           runningZKTasks.remove(id);
         }
       }
