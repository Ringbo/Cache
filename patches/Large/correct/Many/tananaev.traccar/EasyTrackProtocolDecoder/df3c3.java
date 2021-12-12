diff --git a/src/org/traccar/protocol/EasyTrackProtocolDecoder.java b/src/org/traccar/protocol/EasyTrackProtocolDecoder.java
index 16ced37..efc69ec 100644
--- a/src/org/traccar/protocol/EasyTrackProtocolDecoder.java
+++ b/src/org/traccar/protocol/EasyTrackProtocolDecoder.java
@@ -55,25 +55,25 @@
             .compile();
 
     private String decodeAlarm(long status) {
-        if ((status & 0x02000000) > 0) {
+        if ((status & 0x02000000) != 0) {
             return Position.ALARM_GEOFENCE_ENTER;
         }
-        if ((status & 0x04000000) > 0) {
+        if ((status & 0x04000000) != 0) {
             return Position.ALARM_GEOFENCE_EXIT;
         }
-        if ((status & 0x08000000) > 0) {
+        if ((status & 0x08000000) != 0) {
             return Position.ALARM_LOW_BATTERY;
         }
-        if ((status & 0x20000000) > 0) {
+        if ((status & 0x20000000) != 0) {
             return Position.ALARM_VIBRATION;
         }
-        if ((status & 0x80000000) > 0) {
+        if ((status & 0x80000000) != 0) {
             return Position.ALARM_OVERSPEED;
         }
-        if ((status & 0x00010000) > 0) {
+        if ((status & 0x00010000) != 0) {
             return Position.ALARM_SOS;
         }
-        if ((status & 0x00040000) > 0) {
+        if ((status & 0x00040000) != 0) {
             return Position.ALARM_POWER_CUT;
         }
         return null;
