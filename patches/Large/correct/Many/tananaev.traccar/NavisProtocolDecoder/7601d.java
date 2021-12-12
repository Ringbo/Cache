diff --git a/src/org/traccar/protocol/NavisProtocolDecoder.java b/src/org/traccar/protocol/NavisProtocolDecoder.java
index 1e47455..1b19539 100644
--- a/src/org/traccar/protocol/NavisProtocolDecoder.java
+++ b/src/org/traccar/protocol/NavisProtocolDecoder.java
@@ -163,7 +163,7 @@
                 position.set(Position.PREFIX_IN + 5, BitUtil.between(input, 4, 7));
                 position.set(Position.PREFIX_IN + 6, BitUtil.between(input, 7, 10));
                 position.set(Position.PREFIX_IN + 7, BitUtil.between(input, 10, 12));
-                position.set(Position.PREFIX_IN + 5, BitUtil.between(input, 12, 14));
+                position.set(Position.PREFIX_IN + 8, BitUtil.between(input, 12, 14));
             }
         } else if (isFormat(format, F50, F51, F52, F60)) {
             short input = buf.readUnsignedByte();
