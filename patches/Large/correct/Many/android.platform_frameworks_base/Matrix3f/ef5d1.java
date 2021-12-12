diff --git a/graphics/java/android/renderscript/Matrix3f.java b/graphics/java/android/renderscript/Matrix3f.java
index 66f2c81..0bad7e0 100644
--- a/graphics/java/android/renderscript/Matrix3f.java
+++ b/graphics/java/android/renderscript/Matrix3f.java
@@ -138,7 +138,7 @@
         mMat[6] =  zx*nc + ys;
         mMat[1] =  xy*nc + zs;
         mMat[4] = y*y*nc +  c;
-        mMat[9] =  yz*nc - xs;
+        mMat[7] =  yz*nc - xs;
         mMat[2] =  zx*nc - ys;
         mMat[6] =  yz*nc + xs;
         mMat[8] = z*z*nc +  c;
