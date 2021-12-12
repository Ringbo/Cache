diff --git a/src/main/java/pl/droidsonroids/gif/GifViewSavedState.java b/src/main/java/pl/droidsonroids/gif/GifViewSavedState.java
index d858cea..7d2e188 100644
--- a/src/main/java/pl/droidsonroids/gif/GifViewSavedState.java
+++ b/src/main/java/pl/droidsonroids/gif/GifViewSavedState.java
@@ -54,7 +54,7 @@
     };
 
     void setPosition(Drawable drawable, int i) {
-        if (drawable instanceof GifDrawable && mPositions[i] >= 0) {
+        if (drawable instanceof GifDrawable && mPositions[i] > 0) {
             ((GifDrawable) drawable).seekTo(mPositions[i]);
         }
     }
