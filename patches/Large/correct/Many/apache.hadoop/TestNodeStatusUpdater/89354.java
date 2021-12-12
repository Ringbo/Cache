diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/test/java/org/apache/hadoop/yarn/server/nodemanager/TestNodeStatusUpdater.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/test/java/org/apache/hadoop/yarn/server/nodemanager/TestNodeStatusUpdater.java
index 977cb76..59a4563 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/test/java/org/apache/hadoop/yarn/server/nodemanager/TestNodeStatusUpdater.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-nodemanager/src/test/java/org/apache/hadoop/yarn/server/nodemanager/TestNodeStatusUpdater.java
@@ -1524,13 +1524,13 @@
       long t = System.currentTimeMillis();
       long duration = t - waitStartTime;
       boolean waitTimeValid = (duration >= nmRmConnectionWaitMs) &&
-          (duration < (connectionWaitMs + delta));
+          (duration < (nmRmConnectionWaitMs + delta));
 
       if(!waitTimeValid) {
         // throw exception if NM doesn't retry long enough
         throw new Exception("NM should have tried re-connecting to RM during " +
-          "period of at least " + connectionWaitMs + " ms, but " +
-          "stopped retrying within " + (connectionWaitMs + delta) +
+          "period of at least " + nmRmConnectionWaitMs + " ms, but " +
+          "stopped retrying within " + (nmRmConnectionWaitMs + delta) +
           " ms: " + e, e);
       }
     }
