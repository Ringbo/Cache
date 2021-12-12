diff --git a/services/java/com/android/server/LocationManagerService.java b/services/java/com/android/server/LocationManagerService.java
index b162c6b..016a664 100644
--- a/services/java/com/android/server/LocationManagerService.java
+++ b/services/java/com/android/server/LocationManagerService.java
@@ -1795,7 +1795,7 @@
             boolean receiverDead = false;
 
             int receiverUserId = UserHandle.getUserId(receiver.mUid);
-            if (receiverUserId != mCurrentUserId) {
+            if (receiverUserId != mCurrentUserId && !isUidALocationProvider(receiver.mUid)) {
                 if (D) {
                     Log.d(TAG, "skipping loc update for background user " + receiverUserId +
                             " (current user: " + mCurrentUserId + ", app: " +
