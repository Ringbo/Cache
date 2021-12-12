diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 9d9b5b8..2c8ba22 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -3529,7 +3529,8 @@
         
         for (int i=mMainStack.mHistory.size()-1; i>=0; i--) {
             ActivityRecord r = (ActivityRecord)mMainStack.mHistory.get(i);
-            if ((r.info.flags&ActivityInfo.FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS) != 0) {
+            if ((r.info.flags&ActivityInfo.FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS) != 0
+                    && (r.intent.getFlags()&Intent.FLAG_ACTIVITY_CLOSE_SYSTEM_DIALOGS) == 0) {
                 r.stack.finishActivityLocked(r, i,
                         Activity.RESULT_CANCELED, null, "close-sys");
             }
