diff --git a/extensions/ui/org.eclipse.smarthome.ui.classic/src/main/java/org/eclipse/smarthome/ui/classic/internal/WebAppConfig.java b/extensions/ui/org.eclipse.smarthome.ui.classic/src/main/java/org/eclipse/smarthome/ui/classic/internal/WebAppConfig.java
index fd6c4c3..6a6005d 100644
--- a/extensions/ui/org.eclipse.smarthome.ui.classic/src/main/java/org/eclipse/smarthome/ui/classic/internal/WebAppConfig.java
+++ b/extensions/ui/org.eclipse.smarthome.ui.classic/src/main/java/org/eclipse/smarthome/ui/classic/internal/WebAppConfig.java
@@ -29,7 +29,7 @@
     public void applyConfig(Map<String, Object> configProps) {
         String configIconType = (String) configProps.get("iconType");
         String configDefaultSitemap = (String) configProps.get("defaultSitemap");
-        String configHtmlCacheDisabled = configProps.get("disableHtmlCache").toString();
+        Object configHtmlCacheDisabled = configProps.get("disableHtmlCache");
 
         if (configDefaultSitemap == null) {
             configDefaultSitemap = DEFAULT_SITEMAP;
@@ -41,7 +41,7 @@
             configIconType = DEFAULT_ICON_TYPE;
         }
 
-        if ("true".equalsIgnoreCase(configHtmlCacheDisabled)) {
+        if (configHtmlCacheDisabled != null && "true".equalsIgnoreCase(configHtmlCacheDisabled.toString())) {
             htmlCacheDisabled = true;
         }
 
