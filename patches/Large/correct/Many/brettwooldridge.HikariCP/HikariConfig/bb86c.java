diff --git a/src/main/java/com/zaxxer/hikari/HikariConfig.java b/src/main/java/com/zaxxer/hikari/HikariConfig.java
index 459a506..030ac24 100644
--- a/src/main/java/com/zaxxer/hikari/HikariConfig.java
+++ b/src/main/java/com/zaxxer/hikari/HikariConfig.java
@@ -769,7 +769,7 @@
             LOGGER.error("{} - cannot use driverClassName and dataSourceClassName together.", poolName);
             // NOTE: This exception text is referenced by a Spring Boot FailureAnalyzer, it should not be
             // changed without first notifying the Spring Boot developers.
-            throw new IllegalArgumentException("cannot use driverClassName and dataSourceClassName together.");
+            throw new IllegalStateException("cannot use driverClassName and dataSourceClassName together.");
          }
          else if (jdbcUrl != null) {
             LOGGER.warn("{} - using dataSourceClassName and ignoring jdbcUrl.", poolName);
