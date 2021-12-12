diff --git a/src/web/core/src/main/java/org/geoserver/web/admin/JAIPage.java b/src/web/core/src/main/java/org/geoserver/web/admin/JAIPage.java
index 43b0f0c..51f254a 100644
--- a/src/web/core/src/main/java/org/geoserver/web/admin/JAIPage.java
+++ b/src/web/core/src/main/java/org/geoserver/web/admin/JAIPage.java
@@ -86,7 +86,7 @@
         }
         form.add(jaiExtPanel);
 
-        Button submit = new Button("submit", new StringResourceModel("submit", this, null)) {
+        Button submit = new Button("submit") {
             private static final long serialVersionUID = -2842881187264147131L;
             @Override
             public void onSubmit() {
