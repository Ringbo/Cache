diff --git a/src/org/traccar/database/DeviceManager.java b/src/org/traccar/database/DeviceManager.java
index 68e2e82..f2a2dd5 100644
--- a/src/org/traccar/database/DeviceManager.java
+++ b/src/org/traccar/database/DeviceManager.java
@@ -190,7 +190,7 @@
     }
 
     public Collection<Device> getManagedDevices(long userId) throws SQLException {
-        Collection<Device> devices = new ArrayList<>();
+        Collection<Device> devices = new HashSet<>();
         devices.addAll(getDevices(userId));
         for (long managedUserId : Context.getPermissionsManager().getUserPermissions(userId)) {
             devices.addAll(getDevices(managedUserId));
