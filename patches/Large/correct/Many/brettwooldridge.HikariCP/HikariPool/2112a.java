diff --git a/src/main/java/com/zaxxer/hikari/HikariPool.java b/src/main/java/com/zaxxer/hikari/HikariPool.java
index bd338a4..ed93125 100644
--- a/src/main/java/com/zaxxer/hikari/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/HikariPool.java
@@ -340,7 +340,7 @@
             try
             {
                 // Speculative increment of totalConnections with expectation of success
-                if (totalConnections.incrementAndGet() > configuration.getMaximumPoolSize())
+                if (retries == 0 && totalConnections.incrementAndGet() > configuration.getMaximumPoolSize())
                 {
                     totalConnections.decrementAndGet();
                     break;
