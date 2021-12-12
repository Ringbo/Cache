diff --git a/services/print/java/com/android/server/print/PrintManagerService.java b/services/print/java/com/android/server/print/PrintManagerService.java
index e8620ed..83a125d 100644
--- a/services/print/java/com/android/server/print/PrintManagerService.java
+++ b/services/print/java/com/android/server/print/PrintManagerService.java
@@ -718,7 +718,8 @@
         }
 
         private boolean isPrintingEnabled() {
-            return !mUserManager.hasUserRestriction(UserManager.DISALLOW_PRINTING);
+            return !mUserManager.hasUserRestriction(UserManager.DISALLOW_PRINTING,
+                    Binder.getCallingUserHandle());
         }
 
         private void dump(@NonNull DualDumpOutputStream dumpStream,
