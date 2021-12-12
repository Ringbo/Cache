diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index 22fd508..e4998e11 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -2531,7 +2531,7 @@
         if (!TextUtils.isEmpty(inputMethodId)) {
             intent.putExtra(Settings.EXTRA_INPUT_METHOD_ID, inputMethodId);
         }
-        mContext.startActivity(intent);
+        mContext.startActivityAsUser(intent, null, UserHandle.CURRENT);
     }
 
     private void showConfigureInputMethods() {
@@ -2539,7 +2539,7 @@
         intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                 | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
                 | Intent.FLAG_ACTIVITY_CLEAR_TOP);
-        mContext.startActivity(intent);
+        mContext.startActivityAsUser(intent, null, UserHandle.CURRENT);
     }
 
     private boolean isScreenLocked() {
