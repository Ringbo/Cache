diff --git a/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java b/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java
index 8c8f4c3..931dcd7 100644
--- a/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java
+++ b/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoViewAttacher.java
@@ -851,7 +851,7 @@
                 final int newY = mScroller.getCurrY();
 
                 mSuppMatrix.postTranslate(mCurrentX - newX, mCurrentY - newY);
-                setImageViewMatrix(getDrawMatrix());
+                checkAndDisplayMatrix();
 
                 mCurrentX = newX;
                 mCurrentY = newY;
