diff --git a/aeron-archiver/src/main/java/io/aeron/archiver/client/ArchiveProxy.java b/aeron-archiver/src/main/java/io/aeron/archiver/client/ArchiveProxy.java
index 400ef64..f64c5f9 100644
--- a/aeron-archiver/src/main/java/io/aeron/archiver/client/ArchiveProxy.java
+++ b/aeron-archiver/src/main/java/io/aeron/archiver/client/ArchiveProxy.java
@@ -329,7 +329,7 @@
             recordingDescriptorDecoder.joinTimestamp(),
             recordingDescriptorDecoder.endTimestamp(),
             recordingDescriptorDecoder.joinPosition(),
-            recordingDescriptorDecoder.endTimestamp(),
+            recordingDescriptorDecoder.endPosition(),
             recordingDescriptorDecoder.initialTermId(),
             recordingDescriptorDecoder.termBufferLength(),
             recordingDescriptorDecoder.mtuLength(),
