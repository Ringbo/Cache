diff --git a/src/com/owncloud/android/ui/activity/ShareActivity.java b/src/com/owncloud/android/ui/activity/ShareActivity.java
index ceb8509..b08c6f1 100644
--- a/src/com/owncloud/android/ui/activity/ShareActivity.java
+++ b/src/com/owncloud/android/ui/activity/ShareActivity.java
@@ -117,7 +117,7 @@
             );
 
         } else {
-            Log_OC.wtf(TAG, "Unexpected intent " + intent.toString());
+            Log_OC.e(TAG, "Unexpected intent " + intent.toString());
         }
     }
 
