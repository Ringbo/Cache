diff --git a/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java b/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java
index 07e2e77..f612620 100644
--- a/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java
+++ b/WordPress/src/main/java/org/wordpress/android/push/GCMMessageService.java
@@ -767,10 +767,10 @@
             Bundle authPNBundle = tmpMap.remove(AUTH_PUSH_NOTIFICATION_ID);
             if (authPNBundle != null) {
                 handlePushAuth(context, authPNBundle);
-                if (ACTIVE_NOTIFICATIONS_MAP.size() > 0 && noteType.equals(PUSH_TYPE_PUSH_AUTH)) {
+                if (tmpMap.size() > 0 && noteType.equals(PUSH_TYPE_PUSH_AUTH)) {
                     // get the data for the next notification in map for re-build
                     // because otherwise we would be keeping the PUSH_AUTH type note in `data`
-                    data = ACTIVE_NOTIFICATIONS_MAP.values().iterator().next();
+                    data = tmpMap.values().iterator().next();
                 } else if (noteType.equals(PUSH_TYPE_PUSH_AUTH)) {
                     // only note is the 2fa note, just return
                     return;
