diff --git a/src/com/owncloud/android/ui/activity/FileActivity.java b/src/com/owncloud/android/ui/activity/FileActivity.java
index 4b32a7d..449716c 100644
--- a/src/com/owncloud/android/ui/activity/FileActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileActivity.java
@@ -482,7 +482,7 @@
         if (frag != null) {
             Log_OC.d(TAG, "dismiss loading dialog");
             LoadingDialog loading = (LoadingDialog) frag;
-            loading.dismiss();
+            loading.dismissAllowingStateLoss();
         }
     }
 
