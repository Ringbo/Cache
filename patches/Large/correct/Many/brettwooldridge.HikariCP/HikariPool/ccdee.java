diff --git a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
index 8d0bf25..0faad17 100644
--- a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
@@ -258,7 +258,7 @@
                softEvictConnections();
                abortActiveConnections(assassinExecutor);
             }
-            while (getTotalConnections() > 0 && elapsedTimeMs(start) < TimeUnit.SECONDS.toNanos(5));
+            while (getTotalConnections() > 0 && elapsedTimeMs(start) < TimeUnit.SECONDS.toMillis(5));
          } finally {
             assassinExecutor.shutdown();
             assassinExecutor.awaitTermination(5L, TimeUnit.SECONDS);
