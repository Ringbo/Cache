diff --git a/aeron-archive/src/test/java/io/aeron/archive/workloads/ArchiveRecordingLoadTest.java b/aeron-archive/src/test/java/io/aeron/archive/workloads/ArchiveRecordingLoadTest.java
index c79129c..d047066 100644
--- a/aeron-archive/src/test/java/io/aeron/archive/workloads/ArchiveRecordingLoadTest.java
+++ b/aeron-archive/src/test/java/io/aeron/archive/workloads/ArchiveRecordingLoadTest.java
@@ -141,7 +141,7 @@
                 startDrainingSubscriber(aeron, PUBLISH_URI, PUBLISH_STREAM_ID);
                 aeronArchive.startRecording(PUBLISH_URI, PUBLISH_STREAM_ID, SourceLocation.LOCAL);
 
-                long start;
+                final long start;
                 try (ExclusivePublication publication = aeron.addExclusivePublication(PUBLISH_URI, PUBLISH_STREAM_ID))
                 {
                     awaitConnected(publication);
