diff --git a/services/core/java/com/android/server/wm/WindowManagerService.java b/services/core/java/com/android/server/wm/WindowManagerService.java
index ebec172..3644506 100644
--- a/services/core/java/com/android/server/wm/WindowManagerService.java
+++ b/services/core/java/com/android/server/wm/WindowManagerService.java
@@ -6380,10 +6380,9 @@
             }
         }
 
-        // Copy the screenshot bitmap to another buffer so that the gralloc backed
-        // bitmap will not have a long lifetime. Gralloc memory can be pinned or
-        // duplicated and might have a higher cost than a skia backed buffer.
-        Bitmap ret = bm.copy(bm.getConfig(),true);
+        // Create a copy of the screenshot that is immutable and backed in ashmem.
+        // This greatly reduces the overhead of passing the bitmap between processes.
+        Bitmap ret = bm.createAshmemBitmap();
         bm.recycle();
         return ret;
     }
