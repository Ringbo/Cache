diff --git a/src/main/java/org/redisson/connection/SentinelConnectionManager.java b/src/main/java/org/redisson/connection/SentinelConnectionManager.java
index 5e9c0c6..934e6c2 100755
--- a/src/main/java/org/redisson/connection/SentinelConnectionManager.java
+++ b/src/main/java/org/redisson/connection/SentinelConnectionManager.java
@@ -127,7 +127,7 @@
         }
 
         for (Future<RedisPubSubConnection> future : connectionFutures) {
-            future.syncUninterruptibly();
+            future.awaitUninterruptibly();
         }
     }
 
