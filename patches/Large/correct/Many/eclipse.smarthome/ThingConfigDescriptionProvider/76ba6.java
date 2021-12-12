diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingConfigDescriptionProvider.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingConfigDescriptionProvider.java
index 134ae14..4be28fa 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingConfigDescriptionProvider.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingConfigDescriptionProvider.java
@@ -64,7 +64,7 @@
     @Override
     public ConfigDescription getConfigDescription(URI uri, Locale locale) {
         // If this is not a concrete thing, then return
-        if ("thing".equals(uri.getScheme()) == false) {
+        if (uri == null || "thing".equals(uri.getScheme()) == false) {
             return null;
         }
 
