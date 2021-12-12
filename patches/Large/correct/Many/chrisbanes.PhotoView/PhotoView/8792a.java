diff --git a/library/src/main/java/uk/co/senab/photoview/PhotoView.java b/library/src/main/java/uk/co/senab/photoview/PhotoView.java
index 18a7d44..044276e 100755
--- a/library/src/main/java/uk/co/senab/photoview/PhotoView.java
+++ b/library/src/main/java/uk/co/senab/photoview/PhotoView.java
@@ -84,7 +84,7 @@
 
     @Override
     public Matrix getDisplayMatrix() {
-        return mAttacher.getDrawMatrix();
+        return mAttacher.getDisplayMatrix();
     }
 
     @Override
