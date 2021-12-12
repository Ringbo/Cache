diff --git a/services/core/java/com/android/server/tv/TvInputManagerService.java b/services/core/java/com/android/server/tv/TvInputManagerService.java
index e9896e4..d5dcdc3 100644
--- a/services/core/java/com/android/server/tv/TvInputManagerService.java
+++ b/services/core/java/com/android/server/tv/TvInputManagerService.java
@@ -931,7 +931,7 @@
             final long identity = Binder.clearCallingIdentity();
             try {
                 synchronized (mLock) {
-                    UserState userState = getUserStateLocked(callingUid);
+                    UserState userState = getUserStateLocked(resolvedUserId);
                     if (sessionToken == userState.mainSessionToken) {
                         return;
                     }
