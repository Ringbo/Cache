diff --git a/services/core/java/com/android/server/policy/GlobalActions.java b/services/core/java/com/android/server/policy/GlobalActions.java
index 5948d3c..3eae7fc 100644
--- a/services/core/java/com/android/server/policy/GlobalActions.java
+++ b/services/core/java/com/android/server/policy/GlobalActions.java
@@ -383,13 +383,11 @@
             // Add a little delay before executing, to give the
             // dialog a chance to go away before it takes a
             // screenshot.
-            // TODO: remove once screenshots are handled by Shell (instead of dumpstate)
             mHandler.postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     try {
-                        // Take a "heavy" bugreport: it's more user friendly, but causes more
-                        // interference.
+                        // Take an "interactive" bugreport.
                         ActivityManagerNative.getDefault().requestBugReport(true);
                     } catch (RemoteException e) {
                     }
@@ -405,11 +403,11 @@
                 return false;
             }
             try {
-                // Take a "light" bugreport, with less interference.
+                // Take a "full" bugreport.
                 ActivityManagerNative.getDefault().requestBugReport(false);
             } catch (RemoteException e) {
             }
-            return true;
+            return false;
         }
 
         public boolean showDuringKeyguard() {
