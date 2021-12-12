diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index b11dc11..3ec51e3 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -17144,7 +17144,7 @@
                 // but historically it has not been protected and apps may be using it
                 // to poke their own app widget.  So, instead of making it protected,
                 // just limit it to the caller.
-                if (callerApp == null) {
+                if (callerPackage == null) {
                     String msg = "Permission Denial: not allowed to send broadcast "
                             + action + " from unknown caller.";
                     Slog.w(TAG, msg);
@@ -17153,17 +17153,17 @@
                     // They are good enough to send to an explicit component...  verify
                     // it is being sent to the calling app.
                     if (!intent.getComponent().getPackageName().equals(
-                            callerApp.info.packageName)) {
+                            callerPackage)) {
                         String msg = "Permission Denial: not allowed to send broadcast "
                                 + action + " to "
                                 + intent.getComponent().getPackageName() + " from "
-                                + callerApp.info.packageName;
+                                + callerPackage;
                         Slog.w(TAG, msg);
                         throw new SecurityException(msg);
                     }
                 } else {
                     // Limit broadcast to their own package.
-                    intent.setPackage(callerApp.info.packageName);
+                    intent.setPackage(callerPackage);
                 }
             }
         }
