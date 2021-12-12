diff --git a/presto-main/src/main/java/com/facebook/presto/operator/ExchangeOperator.java b/presto-main/src/main/java/com/facebook/presto/operator/ExchangeOperator.java
index 0cbbb78..9ea9c8d 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/ExchangeOperator.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/ExchangeOperator.java
@@ -185,7 +185,7 @@
 
             int neededPages = maxBufferedPages - bufferedPages;
             int clientCount = (int) ((1.0 * neededPages / expectedPagesPerRequest) * concurrentRequestMultiplier);
-            clientCount = Math.min(clientCount, 1);
+            clientCount = Math.max(clientCount, 1);
 
             int pendingClients = allClients.size() - queuedClients.size() - completedClients.size();
             clientCount -= pendingClients;
