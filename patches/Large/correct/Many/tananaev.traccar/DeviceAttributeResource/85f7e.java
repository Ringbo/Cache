diff --git a/src/org/traccar/api/resource/DeviceAttributeResource.java b/src/org/traccar/api/resource/DeviceAttributeResource.java
index 8d80c92..82d17bc 100644
--- a/src/org/traccar/api/resource/DeviceAttributeResource.java
+++ b/src/org/traccar/api/resource/DeviceAttributeResource.java
@@ -49,7 +49,7 @@
     public Response remove(DeviceAttribute entity) throws SQLException {
         Context.getPermissionsManager().checkReadonly(getUserId());
         Context.getPermissionsManager().checkDevice(getUserId(), entity.getDeviceId());
-        Context.getPermissionsManager().checkGeofence(getUserId(), entity.getAttributeId());
+        Context.getPermissionsManager().checkAttribute(getUserId(), entity.getAttributeId());
         Context.getDataManager().unlinkDeviceAttribute(entity.getDeviceId(), entity.getAttributeId());
         Context.getAttributesManager().refresh();
         return Response.noContent().build();
