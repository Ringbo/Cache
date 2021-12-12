diff --git a/library/src/main/java/com/google/android/exoplayer2/upstream/Loader.java b/library/src/main/java/com/google/android/exoplayer2/upstream/Loader.java
index c9173d3..bca90dd 100644
--- a/library/src/main/java/com/google/android/exoplayer2/upstream/Loader.java
+++ b/library/src/main/java/com/google/android/exoplayer2/upstream/Loader.java
@@ -334,7 +334,7 @@
         return;
       }
       if (msg.what == MSG_START) {
-        submitToExecutor();
+        execute();
         return;
       }
       if (msg.what == MSG_FATAL_ERROR) {
