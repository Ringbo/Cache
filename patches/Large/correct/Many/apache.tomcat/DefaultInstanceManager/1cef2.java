diff --git a/java/org/apache/catalina/core/DefaultInstanceManager.java b/java/org/apache/catalina/core/DefaultInstanceManager.java
index 8fcae13..db97feb 100644
--- a/java/org/apache/catalina/core/DefaultInstanceManager.java
+++ b/java/org/apache/catalina/core/DefaultInstanceManager.java
@@ -88,19 +88,16 @@
         privileged = catalinaContext.getPrivileged();
         this.containerClassLoader = containerClassLoader;
         ignoreAnnotations = catalinaContext.getIgnoreAnnotations();
-        StringManager sm = StringManager.getManager(Constants.Package);
+        Log log = catalinaContext.getLogger();
         restrictedServlets = loadProperties(
                 "org/apache/catalina/core/RestrictedServlets.properties",
-                sm.getString("defaultInstanceManager.restrictedServletsResource"),
-                catalinaContext.getLogger());
+                "defaultInstanceManager.restrictedServletsResource", log);
         restrictedListeners = loadProperties(
                 "org/apache/catalina/core/RestrictedListeners.properties",
-                sm.getString("defaultInstanceManager.restrictedListenersResources"),
-                catalinaContext.getLogger());
+                "defaultInstanceManager.restrictedListenersResource", log);
         restrictedFilters = loadProperties(
                 "org/apache/catalina/core/RestrictedFilters.properties",
-                sm.getString("defaultInstanceManager.restrictedFiltersResource"),
-                catalinaContext.getLogger());
+                "defaultInstanceManager.restrictedFiltersResource", log);
         this.context = context;
         this.injectionMap = injectionMap;
         this.postConstructMethods = catalinaContext.findPostConstructMethods();
@@ -624,17 +621,17 @@
         }
     }
 
-    private static Properties loadProperties(String resourceName, String errorString, Log log) {
+    private static Properties loadProperties(String resourceName, String messageKey, Log log) {
         Properties result = new Properties();
         ClassLoader cl = DefaultInstanceManager.class.getClassLoader();
         try (InputStream is = cl.getResourceAsStream(resourceName)) {
             if (is ==null) {
-                log.error(errorString);
+                log.error(sm.getString(messageKey, resourceName));
             } else {
                 result.load(is);
             }
         } catch (IOException ioe) {
-            log.error(errorString, ioe);
+            log.error(sm.getString(messageKey, resourceName), ioe);
         }
         return result;
     }
