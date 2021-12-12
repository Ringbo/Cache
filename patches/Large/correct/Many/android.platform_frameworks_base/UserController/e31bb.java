diff --git a/services/core/java/com/android/server/am/UserController.java b/services/core/java/com/android/server/am/UserController.java
index 7b0c714..d54e264 100644
--- a/services/core/java/com/android/server/am/UserController.java
+++ b/services/core/java/com/android/server/am/UserController.java
@@ -743,7 +743,7 @@
             mInjector.stackSupervisorRemoveUser(userId);
             // Remove the user if it is ephemeral.
             if (getUserInfo(userId).isEphemeral()) {
-                mInjector.getUserManager().removeUser(userId);
+                mInjector.getUserManager().removeUserEvenWhenDisallowed(userId);
             }
             // Evict the user's credential encryption key.
             try {
