diff --git a/app/src/main/java/com/hippo/ehviewer/cache/AnyCache.java b/app/src/main/java/com/hippo/ehviewer/cache/AnyCache.java
index 12e9642..d23d8b9 100644
--- a/app/src/main/java/com/hippo/ehviewer/cache/AnyCache.java
+++ b/app/src/main/java/com/hippo/ehviewer/cache/AnyCache.java
@@ -221,7 +221,7 @@
                     }
                 }
                 if (mDiskCache != null) {
-                    mDiskCache.put(key, value);
+                    mDiskCache.put(diskKey, value);
                     return true;
                 } else {
                     return false;
