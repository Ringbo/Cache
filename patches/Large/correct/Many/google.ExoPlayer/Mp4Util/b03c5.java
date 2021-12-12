diff --git a/library/src/main/java/com/google/android/exoplayer/mp4/Mp4Util.java b/library/src/main/java/com/google/android/exoplayer/mp4/Mp4Util.java
index 7b744df..e593858 100644
--- a/library/src/main/java/com/google/android/exoplayer/mp4/Mp4Util.java
+++ b/library/src/main/java/com/google/android/exoplayer/mp4/Mp4Util.java
@@ -161,7 +161,7 @@
       }
     }
 
-    int limit = endOffset - 2;
+    int limit = endOffset - 1;
     // We're looking for the NAL unit start code prefix 0x000001, followed by a byte that matches
     // the specified type. The value of i tracks the index of the third byte in the four bytes
     // being examined.
