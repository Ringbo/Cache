diff --git a/modules/core/src/main/java/org/apache/ignite/logger/java/JavaLogger.java b/modules/core/src/main/java/org/apache/ignite/logger/java/JavaLogger.java
index a6c132d..cbbf849 100644
--- a/modules/core/src/main/java/org/apache/ignite/logger/java/JavaLogger.java
+++ b/modules/core/src/main/java/org/apache/ignite/logger/java/JavaLogger.java
@@ -151,7 +151,7 @@
         final URL cfgUrl = U.resolveIgniteUrl(DFLT_CONFIG_PATH);
 
         if (cfgUrl == null) {
-            error("Failed to resolve default logging config file: " + DFLT_CONFIG_PATH);
+            warning("Failed to resolve default logging config file: " + DFLT_CONFIG_PATH);
 
             return;
         }
