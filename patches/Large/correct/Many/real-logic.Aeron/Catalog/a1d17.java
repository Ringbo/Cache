diff --git a/aeron-archive/src/main/java/io/aeron/archive/Catalog.java b/aeron-archive/src/main/java/io/aeron/archive/Catalog.java
index 5edf5ba..c7b5aa8 100644
--- a/aeron-archive/src/main/java/io/aeron/archive/Catalog.java
+++ b/aeron-archive/src/main/java/io/aeron/archive/Catalog.java
@@ -436,7 +436,7 @@
 
                 if (sessionId == descriptorDecoder.sessionId() &&
                     streamId == descriptorDecoder.streamId() &&
-                    descriptorDecoder.strippedChannel().contains(channel))
+                    descriptorDecoder.originalChannel().contains(channel))
                 {
                     return recordingId;
                 }
