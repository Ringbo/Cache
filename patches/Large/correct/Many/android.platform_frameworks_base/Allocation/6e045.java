diff --git a/graphics/java/android/renderscript/Allocation.java b/graphics/java/android/renderscript/Allocation.java
index 74cdf80..3dcfe88 100644
--- a/graphics/java/android/renderscript/Allocation.java
+++ b/graphics/java/android/renderscript/Allocation.java
@@ -212,7 +212,7 @@
         for (int ct=0; ct < d.length; ct++) {
             i[ct] = d[ct].getID();
         }
-        copy1DRangeFrom(0, mType.getCount(), i);
+        copy1DRangeFromUnchecked(0, mType.getCount(), i);
     }
 
     private void validateBitmapFormat(Bitmap b) {
