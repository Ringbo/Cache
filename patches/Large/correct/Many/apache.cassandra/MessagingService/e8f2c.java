diff --git a/src/java/org/apache/cassandra/net/MessagingService.java b/src/java/org/apache/cassandra/net/MessagingService.java
index c65c44c..1ad0e7c 100644
--- a/src/java/org/apache/cassandra/net/MessagingService.java
+++ b/src/java/org/apache/cassandra/net/MessagingService.java
@@ -920,7 +920,7 @@
     {
         List<String> logs = getDroppedMessagesLogs();
         for (String log : logs)
-            logger.error(log);
+            logger.info(log);
 
         if (logs.size() > 0)
             StatusLogger.log();
