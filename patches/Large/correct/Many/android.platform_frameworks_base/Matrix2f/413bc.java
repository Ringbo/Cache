diff --git a/graphics/java/android/renderscript/Matrix2f.java b/graphics/java/android/renderscript/Matrix2f.java
index 78ff97b..acc5bd8 100644
--- a/graphics/java/android/renderscript/Matrix2f.java
+++ b/graphics/java/android/renderscript/Matrix2f.java
@@ -42,7 +42,7 @@
     *                  floats long
     */
     public Matrix2f(float[] dataArray) {
-        mMat = new float[2];
+        mMat = new float[4];
         System.arraycopy(dataArray, 0, mMat, 0, mMat.length);
     }
 
