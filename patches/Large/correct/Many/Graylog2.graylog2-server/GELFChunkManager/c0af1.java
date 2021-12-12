diff --git a/graylog2-inputs/src/main/java/org/graylog2/inputs/gelf/gelf/GELFChunkManager.java b/graylog2-inputs/src/main/java/org/graylog2/inputs/gelf/gelf/GELFChunkManager.java
index 817b7dc..ddc356f 100644
--- a/graylog2-inputs/src/main/java/org/graylog2/inputs/gelf/gelf/GELFChunkManager.java
+++ b/graylog2-inputs/src/main/java/org/graylog2/inputs/gelf/gelf/GELFChunkManager.java
@@ -79,7 +79,7 @@
                         continue;
                     }
 
-                    // Not oudated. Maybe complete?
+                    // Not outdated. Maybe complete?
                     if (isComplete(messageId)) {
                         // We got a complete message! Re-assemble and insert to GELFProcessor.
                         LOG.debug("Message <{}> seems to be complete. Handling now.", messageId);
@@ -182,7 +182,7 @@
             chunks.get(chunk.getId()).put(chunk.getSequenceNumber(), chunk);
         } else {
             // First chunk of message.
-            Map<Integer, GELFMessageChunk> c = Maps.newHashMap();
+            Map<Integer, GELFMessageChunk> c = Maps.newTreeMap();
             c.put(chunk.getSequenceNumber(), chunk);
             chunks.put(chunk.getId(), c);
         }
