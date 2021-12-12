diff --git a/java/org/apache/catalina/core/DefaultInstanceManager.java b/java/org/apache/catalina/core/DefaultInstanceManager.java
index d019c38..0d3e265 100644
--- a/java/org/apache/catalina/core/DefaultInstanceManager.java
+++ b/java/org/apache/catalina/core/DefaultInstanceManager.java
@@ -88,7 +88,7 @@
                     this.getClass().getClassLoader().getResourceAsStream
                             ("org/apache/catalina/core/RestrictedListeners.properties");
             if (is != null) {
-                restrictedFilters.load(is);
+                restrictedListeners.load(is);
             } else {
                 catalinaContext.getLogger().error(sm.getString("defaultInstanceManager.restrictedListenersResources"));
             }
