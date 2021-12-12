diff --git a/library/src/main/java/com/google/android/exoplayer/hls/parser/DataSourceExtractorInput.java b/library/src/main/java/com/google/android/exoplayer/hls/parser/DataSourceExtractorInput.java
index f951bea..5e23f98 100644
--- a/library/src/main/java/com/google/android/exoplayer/hls/parser/DataSourceExtractorInput.java
+++ b/library/src/main/java/com/google/android/exoplayer/hls/parser/DataSourceExtractorInput.java
@@ -82,15 +82,15 @@
       if (Thread.interrupted()) {
         throw new InterruptedException();
       }
-      int bytesRead = dataSource.read(SCRATCH_SPACE, 0, remaining);
+      int bytesRead = dataSource.read(SCRATCH_SPACE, 0, Math.min(SCRATCH_SPACE.length, remaining));
       if (bytesRead == -1) {
         isEnded = true;
-        return true;
+        return false;
       }
       remaining -= bytesRead;
     }
     position += length;
-    return false;
+    return true;
   }
 
   @Override
