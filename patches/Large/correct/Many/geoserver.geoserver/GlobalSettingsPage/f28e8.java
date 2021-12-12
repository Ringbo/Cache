diff --git a/src/web/core/src/main/java/org/geoserver/web/admin/GlobalSettingsPage.java b/src/web/core/src/main/java/org/geoserver/web/admin/GlobalSettingsPage.java
index 0a36db8..006343b 100644
--- a/src/web/core/src/main/java/org/geoserver/web/admin/GlobalSettingsPage.java
+++ b/src/web/core/src/main/java/org/geoserver/web/admin/GlobalSettingsPage.java
@@ -110,7 +110,7 @@
         ListView extensions = SettingsPluginPanelInfo.createExtensions("extensions", settingsModel, getGeoServerApplication());
         form.add(extensions);
 
-        Button submit = new Button("submit", new StringResourceModel("submit", this, null)) {
+        Button submit = new Button("submit") {
             @Override
             public void onSubmit() {
                 GeoServer gs = getGeoServer();
