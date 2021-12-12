diff --git a/libs/rs/java/Film/src/com/android/film/FilmView.java b/libs/rs/java/Film/src/com/android/film/FilmView.java
index e40784c..4a201fd 100644
--- a/libs/rs/java/Film/src/com/android/film/FilmView.java
+++ b/libs/rs/java/Film/src/com/android/film/FilmView.java
@@ -52,7 +52,7 @@
     public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
         super.surfaceChanged(holder, format, w, h);
         if (mRS == null) {
-            mRS = createRenderScript(false);
+            mRS = createRenderScript(true);
             mRS.contextSetSurface(w, h, holder.getSurface());
             mRender = new FilmRS();
             mRender.init(mRS, getResources(), w, h);
