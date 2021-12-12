diff --git a/src/org/traccar/protocol/GranitProtocolDecoder.java b/src/org/traccar/protocol/GranitProtocolDecoder.java
index 9e618ef..7432961 100644
--- a/src/org/traccar/protocol/GranitProtocolDecoder.java
+++ b/src/org/traccar/protocol/GranitProtocolDecoder.java
@@ -85,7 +85,7 @@
         double latitude = latDegrees + latMinutes / 60000.0;
         double longitude = lonDegrees + lonMinutes / 60000.0;
         if (!BitUtil.check(flags, 4)) {
-            latitude = -latDegrees;
+            latitude = -latitude;
         }
         if (!BitUtil.check(flags, 5)) {
             longitude = -longitude;
