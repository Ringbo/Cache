diff --git a/demo/src/main/java/com/google/android/exoplayer2/demo/EventLogger.java b/demo/src/main/java/com/google/android/exoplayer2/demo/EventLogger.java
index 81effe1..5ad28f9 100644
--- a/demo/src/main/java/com/google/android/exoplayer2/demo/EventLogger.java
+++ b/demo/src/main/java/com/google/android/exoplayer2/demo/EventLogger.java
@@ -371,7 +371,7 @@
       } else if (entry instanceof CommentFrame) {
         CommentFrame commentFrame = (CommentFrame) entry;
         Log.d(TAG, prefix + String.format("%s: language=%s description=%s", commentFrame.id,
-            commentFrame.language, commentFrame.description, commentFrame.text));
+            commentFrame.language, commentFrame.description));
       } else if (entry instanceof Id3Frame) {
         Id3Frame id3Frame = (Id3Frame) entry;
         Log.d(TAG, prefix + String.format("%s", id3Frame.id));
