diff --git a/src/java/org/apache/cassandra/net/MessagingService.java b/src/java/org/apache/cassandra/net/MessagingService.java
index e5be891..4f6aaf5 100644
--- a/src/java/org/apache/cassandra/net/MessagingService.java
+++ b/src/java/org/apache/cassandra/net/MessagingService.java
@@ -521,7 +521,7 @@
 
         for (DebuggableThreadPoolExecutor e : streamExecutors.values())
         {
-            if (e.awaitTermination(24, TimeUnit.HOURS))
+            if (!e.awaitTermination(24, TimeUnit.HOURS))
                 logger_.error("Stream took more than 24H to complete; skipping");
         }
     }
