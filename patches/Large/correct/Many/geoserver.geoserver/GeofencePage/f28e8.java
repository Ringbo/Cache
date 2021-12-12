diff --git a/src/community/geofence/src/main/java/org/geoserver/geofence/web/GeofencePage.java b/src/community/geofence/src/main/java/org/geoserver/geofence/web/GeofencePage.java
index 5652eb9..1c7ba452 100644
--- a/src/community/geofence/src/main/java/org/geoserver/geofence/web/GeofencePage.java
+++ b/src/community/geofence/src/main/java/org/geoserver/geofence/web/GeofencePage.java
@@ -145,8 +145,7 @@
         form.add(new TextField<String>("acceptedRoles", new PropertyModel<String>(
                 configModel, "acceptedRoles")));
 
-        Button submit = new Button("submit", new StringResourceModel("submit",
-                this, null)) {
+        Button submit = new Button("submit") {
             private static final long serialVersionUID = 1L;
 
             @Override
