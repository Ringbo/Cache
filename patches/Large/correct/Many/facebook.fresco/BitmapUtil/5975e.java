diff --git a/imagepipeline-base/src/main/java/com/facebook/imageutils/BitmapUtil.java b/imagepipeline-base/src/main/java/com/facebook/imageutils/BitmapUtil.java
index 12b1a0f..7a3cb4e 100644
--- a/imagepipeline-base/src/main/java/com/facebook/imageutils/BitmapUtil.java
+++ b/imagepipeline-base/src/main/java/com/facebook/imageutils/BitmapUtil.java
@@ -67,8 +67,8 @@
       return bitmap.getByteCount();
     }
 
-    // Estimate for earlier platforms.
-    return bitmap.getWidth() * bitmap.getRowBytes();
+    // Estimate for earlier platforms. Same code as getByteCount() for Honeycomb.
+    return bitmap.getRowBytes() * bitmap.getHeight();
   }
 
   /**
