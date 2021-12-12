diff --git a/src/com/owncloud/android/ui/activity/BaseActivity.java b/src/com/owncloud/android/ui/activity/BaseActivity.java
index a7c4cb8..8d652d0 100644
--- a/src/com/owncloud/android/ui/activity/BaseActivity.java
+++ b/src/com/owncloud/android/ui/activity/BaseActivity.java
@@ -257,7 +257,7 @@
                 Log_OC.e(TAG, "Account creation callback with null bundle");
             }
             if (mMandatoryCreation && !accountWasSet) {
-                moveTaskToBack(true);
+                finish();
             }
         }
     }
