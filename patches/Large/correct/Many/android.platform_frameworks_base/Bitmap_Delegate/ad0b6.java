diff --git a/tools/layoutlib/bridge/src/android/graphics/Bitmap_Delegate.java b/tools/layoutlib/bridge/src/android/graphics/Bitmap_Delegate.java
index 1823702..fe201c1 100644
--- a/tools/layoutlib/bridge/src/android/graphics/Bitmap_Delegate.java
+++ b/tools/layoutlib/bridge/src/android/graphics/Bitmap_Delegate.java
@@ -364,6 +364,6 @@
         int nativeInt = sManager.addDelegate(delegate);
 
         // and create/return a new Bitmap with it
-        return new Bitmap(nativeInt, isMutable, null /*ninePatchChunk*/, density);
+        return new Bitmap(nativeInt, null /* buffer */, isMutable, null /*ninePatchChunk*/, density);
     }
 }
