diff --git a/src/com/owncloud/android/ui/activity/ConflictsResolveActivity.java b/src/com/owncloud/android/ui/activity/ConflictsResolveActivity.java
index 7c342f0..d91f928 100644
--- a/src/com/owncloud/android/ui/activity/ConflictsResolveActivity.java
+++ b/src/com/owncloud/android/ui/activity/ConflictsResolveActivity.java
@@ -72,7 +72,7 @@
                 finish();
                 return;
             default:
-                Log_OC.wtf(TAG, "Unhandled conflict decision " + decision);
+                Log_OC.e(TAG, "Unhandled conflict decision " + decision);
                 return;
         }
 
