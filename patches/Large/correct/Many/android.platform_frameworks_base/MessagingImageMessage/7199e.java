diff --git a/core/java/com/android/internal/widget/MessagingImageMessage.java b/core/java/com/android/internal/widget/MessagingImageMessage.java
index d5ebf9c..961f90a 100644
--- a/core/java/com/android/internal/widget/MessagingImageMessage.java
+++ b/core/java/com/android/internal/widget/MessagingImageMessage.java
@@ -101,7 +101,7 @@
             e.printStackTrace();
             return false;
         }
-        int intrinsicHeight = mDrawable.getIntrinsicHeight();
+        int intrinsicHeight = drawable.getIntrinsicHeight();
         if (intrinsicHeight == 0) {
             Log.w(TAG, "Drawable with 0 intrinsic height was returned");
             return false;
