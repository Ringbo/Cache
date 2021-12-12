diff --git a/src/org/traccar/protocol/Gt06ProtocolDecoder.java b/src/org/traccar/protocol/Gt06ProtocolDecoder.java
index a0ff5a0..4b9aaed 100644
--- a/src/org/traccar/protocol/Gt06ProtocolDecoder.java
+++ b/src/org/traccar/protocol/Gt06ProtocolDecoder.java
@@ -39,7 +39,7 @@
         
         if (serverManager != null) {
             Properties p = getServerManager().getProperties();
-            if (p.contains("gt06.timezone")) {
+            if (p.containsKey("gt06.timezone")) {
                 timeZone.setRawOffset(
                         Integer.valueOf(p.getProperty("gt06.timezone")) * 1000);
             }
@@ -130,7 +130,7 @@
             
         }
 
-        else if (deviceId != null && (
+        else if (/*deviceId != null && */(
                  type == MSG_GPS ||
                  type == MSG_GPS_LBS ||
                  type == MSG_GPS_LBS_STATUS ||
