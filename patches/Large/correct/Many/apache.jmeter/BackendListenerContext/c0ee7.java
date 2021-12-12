diff --git a/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java b/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java
index df8a563..464018f 100644
--- a/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java
+++ b/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java
@@ -45,7 +45,7 @@
      */
 
     /** Logging */
-    private static final Logger log = LoggingManager.getLoggerForClass();
+    private static final Logger LOGGER = LoggingManager.getLoggerForClass();
 
     /**
      * Map containing the initialization parameters for the BackendListenerClient.
@@ -164,7 +164,7 @@
         try {
             return Integer.decode(params.get(name)).intValue();
         } catch (NumberFormatException e) {
-            log.warn("Value for parameter '" + name + "' not an integer: '" + params.get(name) + "'.  Using default: '"
+            LOGGER.warn("Value for parameter '" + name + "' not an integer: '" + params.get(name) + "'.  Using default: '"
                     + defaultValue + "'.", e);
             return defaultValue;
         }
@@ -216,7 +216,7 @@
         try {
             return Long.decode(params.get(name)).longValue();
         } catch (NumberFormatException e) {
-            log.warn("Value for parameter '" + name + "' not a long: '" + params.get(name) + "'.  Using default: '"
+            LOGGER.warn("Value for parameter '" + name + "' not a long: '" + params.get(name) + "'.  Using default: '"
                     + defaultValue + "'.", e);
             return defaultValue;
         }
@@ -232,6 +232,6 @@
         if (params == null || !params.containsKey(name)) {
             return defaultValue;
         }
-        return Boolean.valueOf(params.get(name));
+        return Boolean.parseBoolean(params.get(name));
     }
 }
