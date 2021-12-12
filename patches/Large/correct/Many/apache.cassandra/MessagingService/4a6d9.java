diff --git a/src/java/org/apache/cassandra/net/MessagingService.java b/src/java/org/apache/cassandra/net/MessagingService.java
index 2fd72cf..0fea181 100644
--- a/src/java/org/apache/cassandra/net/MessagingService.java
+++ b/src/java/org/apache/cassandra/net/MessagingService.java
@@ -644,7 +644,7 @@
 
         for (DebuggableThreadPoolExecutor e : streamExecutors.values())
         {
-            if (e.awaitTermination(24, TimeUnit.HOURS))
+            if (!e.awaitTermination(24, TimeUnit.HOURS))
                 logger.error("Stream took more than 24H to complete; skipping");
         }
     }
