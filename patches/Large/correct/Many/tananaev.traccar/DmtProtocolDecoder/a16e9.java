diff --git a/src/org/traccar/protocol/DmtProtocolDecoder.java b/src/org/traccar/protocol/DmtProtocolDecoder.java
index de51cce..39462a4 100644
--- a/src/org/traccar/protocol/DmtProtocolDecoder.java
+++ b/src/org/traccar/protocol/DmtProtocolDecoder.java
@@ -117,7 +117,7 @@
                         position.setFixTime(new Date(1356998400000L + buf.readUnsignedInt() * 1000));
                         position.setLatitude(buf.readInt() * 0.0000001);
                         position.setLongitude(buf.readInt() * 0.0000001);
-                        position.setLongitude(buf.readShort());
+                        position.setAltitude(buf.readShort());
                         position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedShort()));
 
                         buf.readUnsignedByte(); // speed accuracy
