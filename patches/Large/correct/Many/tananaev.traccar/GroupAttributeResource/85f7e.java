diff --git a/src/org/traccar/api/resource/GroupAttributeResource.java b/src/org/traccar/api/resource/GroupAttributeResource.java
index 84b876d..d8b8b58 100644
--- a/src/org/traccar/api/resource/GroupAttributeResource.java
+++ b/src/org/traccar/api/resource/GroupAttributeResource.java
@@ -49,7 +49,7 @@
     public Response remove(GroupAttribute entity) throws SQLException {
         Context.getPermissionsManager().checkReadonly(getUserId());
         Context.getPermissionsManager().checkGroup(getUserId(), entity.getGroupId());
-        Context.getPermissionsManager().checkGeofence(getUserId(), entity.getAttributeId());
+        Context.getPermissionsManager().checkAttribute(getUserId(), entity.getAttributeId());
         Context.getDataManager().unlinkGroupAttribute(entity.getGroupId(), entity.getAttributeId());
         Context.getAttributesManager().refresh();
         return Response.noContent().build();
