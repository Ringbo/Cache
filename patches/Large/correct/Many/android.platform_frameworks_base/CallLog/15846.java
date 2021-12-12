diff --git a/core/java/android/provider/CallLog.java b/core/java/android/provider/CallLog.java
index 47cfa7d..8db99a5 100644
--- a/core/java/android/provider/CallLog.java
+++ b/core/java/android/provider/CallLog.java
@@ -510,9 +510,10 @@
                 for (int i = 0; i < count; i++) {
                     final UserInfo user = users.get(i);
                     final UserHandle userHandle = user.getUserHandle();
-                    if (userManager.isUserRunning(userHandle) &&
-                            !userManager.hasUserRestriction(UserManager.DISALLOW_OUTGOING_CALLS,
-                                    userHandle)) {
+                    if (userManager.isUserRunning(userHandle)
+                            && !userManager.hasUserRestriction(UserManager.DISALLOW_OUTGOING_CALLS,
+                                    userHandle)
+                            && !user.isManagedProfile()) {
                         Uri uri = addEntryAndRemoveExpiredEntries(context,
                                 ContentProvider.maybeAddUserId(CONTENT_URI, user.id), values);
                         if (user.id == currentUserId) {
