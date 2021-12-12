diff --git a/src/org/traccar/protocol/TlvProtocol.java b/src/org/traccar/protocol/TlvProtocol.java
index ddc8d2a..bfe597e 100644
--- a/src/org/traccar/protocol/TlvProtocol.java
+++ b/src/org/traccar/protocol/TlvProtocol.java
@@ -33,7 +33,7 @@
         serverList.add(new TrackerServer(false, getName()) {
             @Override
             protected void addProtocolHandlers(PipelineBuilder pipeline) {
-                pipeline.addLast("frameDecoder", new CharacterDelimiterFrameDecoder('\0'));
+                pipeline.addLast("frameDecoder", new CharacterDelimiterFrameDecoder(1024, '\0'));
                 pipeline.addLast("objectDecoder", new TlvProtocolDecoder(TlvProtocol.this));
             }
         });
