diff --git a/src/org/traccar/database/PermissionsManager.java b/src/org/traccar/database/PermissionsManager.java
index f34fecb..683f54c 100644
--- a/src/org/traccar/database/PermissionsManager.java
+++ b/src/org/traccar/database/PermissionsManager.java
@@ -75,7 +75,7 @@
     }
     
     public void checkDevice(long userId, long deviceId) throws SecurityException {
-        if (getNotNull(userId).contains(deviceId)) {
+        if (!getNotNull(userId).contains(deviceId)) {
             throw new SecurityException("Device access denied");
         }
     }
