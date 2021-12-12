diff --git a/src/extension/wps/web-wps/src/main/java/org/geoserver/wps/web/WPSAccessRulePage.java b/src/extension/wps/web-wps/src/main/java/org/geoserver/wps/web/WPSAccessRulePage.java
index 33fae29..63092a7 100644
--- a/src/extension/wps/web-wps/src/main/java/org/geoserver/wps/web/WPSAccessRulePage.java
+++ b/src/extension/wps/web-wps/src/main/java/org/geoserver/wps/web/WPSAccessRulePage.java
@@ -172,7 +172,7 @@
         };
         form.add(submit);
 
-        Button cancel = new Button( "cancel", new StringResourceModel( "cancel", (Component)null, null) ) {
+        Button cancel = new Button( "cancel" ) {
             public void onSubmit() {
                 doReturn();
             }
