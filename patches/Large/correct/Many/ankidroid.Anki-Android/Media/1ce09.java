diff --git a/src/com/ichi2/libanki/Media.java b/src/com/ichi2/libanki/Media.java
index 10f828b..3618286 100644
--- a/src/com/ichi2/libanki/Media.java
+++ b/src/com/ichi2/libanki/Media.java
@@ -202,9 +202,11 @@
     }
 
 
-    // TODO: This might be needed since some SD cards can be formatted as FAT32
+    // TODO: Assume we are on FAT32 for every sync until we can find a reliable way to detect
+    // the file system type. This will trigger a media scan on every sync attempt even on devices
+    // that didn't need it, so it makes syncing a little slower.
     public boolean _isFAT32() {
-        return false;
+        return true;
     }
 
 
