diff --git a/aeron-archive/src/main/java/io/aeron/archive/ListRecordingsForUriSession.java b/aeron-archive/src/main/java/io/aeron/archive/ListRecordingsForUriSession.java
index acef5cd..bca03f9 100644
--- a/aeron-archive/src/main/java/io/aeron/archive/ListRecordingsForUriSession.java
+++ b/aeron-archive/src/main/java/io/aeron/archive/ListRecordingsForUriSession.java
@@ -72,7 +72,7 @@
 
             if (Catalog.isValidDescriptor(descriptorBuffer) &&
                 decoder.streamId() == streamId &&
-                decoder.strippedChannel().contains(channel))
+                decoder.originalChannel().contains(channel))
             {
                 final int bytesSent = controlSession.sendDescriptor(correlationId, descriptorBuffer, proxy);
                 if (bytesSent == 0)
