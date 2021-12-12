diff --git a/graphics/java/android/renderscript/Matrix3f.java b/graphics/java/android/renderscript/Matrix3f.java
index 0bad7e0..5e9a7ca 100644
--- a/graphics/java/android/renderscript/Matrix3f.java
+++ b/graphics/java/android/renderscript/Matrix3f.java
@@ -140,7 +140,7 @@
         mMat[4] = y*y*nc +  c;
         mMat[7] =  yz*nc - xs;
         mMat[2] =  zx*nc - ys;
-        mMat[6] =  yz*nc + xs;
+        mMat[5] =  yz*nc + xs;
         mMat[8] = z*z*nc +  c;
     }
 
