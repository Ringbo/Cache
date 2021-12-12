diff --git a/src/org/traccar/protocol/NavisProtocolDecoder.java b/src/org/traccar/protocol/NavisProtocolDecoder.java
index c91ad3f..6476d3d 100644
--- a/src/org/traccar/protocol/NavisProtocolDecoder.java
+++ b/src/org/traccar/protocol/NavisProtocolDecoder.java
@@ -195,7 +195,7 @@
             if (isFormat(format, F60)) {
                 position.setLatitude(buf.readIntLE() / 600000.0);
                 position.setLongitude(buf.readIntLE() / 600000.0);
-                position.setAltitude(buf.readIntLE() * 0.01);
+                position.setAltitude(buf.readIntLE() * 0.1);
             } else {
                 position.setLatitude(buf.readFloatLE() / Math.PI * 180);
                 position.setLongitude(buf.readFloatLE() / Math.PI * 180);
