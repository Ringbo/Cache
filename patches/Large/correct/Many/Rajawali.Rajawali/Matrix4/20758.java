diff --git a/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java b/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java
index b7a1f69..78b3e6e 100644
--- a/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java
+++ b/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java
@@ -414,7 +414,7 @@
     @NonNull
     public Matrix4 multiply(@NonNull Matrix4 matrix) {
         System.arraycopy(m, 0, mTmp, 0, 16);
-        Matrix.multiplyMM(m, 0, matrix.getDoubleValues(), 0, mTmp, 0);
+        Matrix.multiplyMM(m, 0, mTmp, 0, matrix.getDoubleValues(), 0);
         return this;
     }
 
@@ -431,7 +431,7 @@
     @NonNull
     public Matrix4 leftMultiply(@NonNull Matrix4 matrix) {
         System.arraycopy(m, 0, mTmp, 0, 16);
-        Matrix.multiplyMM(m, 0, mTmp, 0, matrix.getDoubleValues(), 0);
+        Matrix.multiplyMM(m, 0, matrix.getDoubleValues(), 0, mTmp, 0);
         return this;
     }
 
