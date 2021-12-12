diff --git a/lib/src/main/java/com/google/samples/apps/iosched/fcm/MyInstanceIDService.java b/lib/src/main/java/com/google/samples/apps/iosched/fcm/MyInstanceIDService.java
index c257bed..f67924a 100644
--- a/lib/src/main/java/com/google/samples/apps/iosched/fcm/MyInstanceIDService.java
+++ b/lib/src/main/java/com/google/samples/apps/iosched/fcm/MyInstanceIDService.java
@@ -45,7 +45,7 @@
                 AccountUtils.getActiveAccountId(this) : null;
 
         // Unregister on server.
-        ServerUtilities.unregister(this, ServerUtilities.getDeviceId(this), fcmKey);
+        ServerUtilities.unregister(this, ServerUtilities.getDeviceId(this));
 
         // Register for a new InstanceID token. This token is sent to the server to be paired with
         // the current user's FCM key.
