diff --git a/core/src/main/java/com/zaxxer/hikari/HikariConfig.java b/core/src/main/java/com/zaxxer/hikari/HikariConfig.java
index f14946b..5bafd77 100644
--- a/core/src/main/java/com/zaxxer/hikari/HikariConfig.java
+++ b/core/src/main/java/com/zaxxer/hikari/HikariConfig.java
@@ -403,7 +403,7 @@
             logger.error("idleTimeout cannot be negative.");
             throw new IllegalStateException("idleTimeout cannot be negative.");
         }
-        else if (idleTimeout < 30000)
+        else if (idleTimeout < 30000 && idleTimeout != 0)
         {
             logger.warn("idleTimeout is less than 30000ms, did you specify the wrong time unit?  Using default instead.");
             idleTimeout = IDLE_TIMEOUT;
@@ -438,7 +438,7 @@
             logger.error("maxLifetime cannot be negative.");
             throw new IllegalStateException("maxLifetime cannot be negative.");
         }
-        else if (maxLifetime < 120000)
+        else if (maxLifetime < 120000 && maxLifetime != 0)
         {
             logger.warn("maxLifetime is less than 120000ms, did you specify the wrong time unit?  Using default instead.");
             maxLifetime = MAX_LIFETIME;
