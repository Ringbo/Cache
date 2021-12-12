diff --git a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
index 999261d..04f525e 100644
--- a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
@@ -162,7 +162,7 @@
         // PIN CODE request ;  best location is to decide, let's try this first
         if (getIntent().getAction() != null && getIntent().getAction().equals(Intent.ACTION_MAIN) && savedInstanceState == null) {
             requestPinCode();
-        } else if (getIntent().getAction() == null) {
+        } else if (getIntent().getAction() == null && savedInstanceState == null) {
             requestPinCode();
         }
 
