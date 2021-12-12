diff --git a/src/com/owncloud/android/ui/preview/PreviewImageFragment.java b/src/com/owncloud/android/ui/preview/PreviewImageFragment.java
index b6f3682..e61e335 100644
--- a/src/com/owncloud/android/ui/preview/PreviewImageFragment.java
+++ b/src/com/owncloud/android/ui/preview/PreviewImageFragment.java
@@ -476,7 +476,7 @@
 
         @Override
         protected void onCancelled(LoadImage result) {
-            if (result.bitmap != null) {
+            if (result != null && result.bitmap != null) {
                 result.bitmap.recycle();
             }
         }
