diff --git a/src/web/core/src/main/java/org/geoserver/web/services/BaseServiceAdminPage.java b/src/web/core/src/main/java/org/geoserver/web/services/BaseServiceAdminPage.java
index fe5ae85..b2ad80f 100644
--- a/src/web/core/src/main/java/org/geoserver/web/services/BaseServiceAdminPage.java
+++ b/src/web/core/src/main/java/org/geoserver/web/services/BaseServiceAdminPage.java
@@ -146,7 +146,7 @@
         };
         form.add(submit);
 
-        Button cancel = new Button( "cancel", new StringResourceModel( "cancel", (Component)null, null) ) {
+        Button cancel = new Button( "cancel" ) {
             public void onSubmit() {
                 doReturn();
             }
