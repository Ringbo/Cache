diff --git a/graphics/java/android/graphics/Bitmap.java b/graphics/java/android/graphics/Bitmap.java
index ac2a88a..1fdc1f5 100644
--- a/graphics/java/android/graphics/Bitmap.java
+++ b/graphics/java/android/graphics/Bitmap.java
@@ -133,7 +133,7 @@
             nativeSize += getByteCount();
         }
         NativeAllocationRegistry registry = new NativeAllocationRegistry(
-            nativeGetNativeFinalizer(), nativeSize);
+            Bitmap.class.getClassLoader(), nativeGetNativeFinalizer(), nativeSize);
         registry.registerNativeAllocation(this, nativeBitmap);
     }
 
