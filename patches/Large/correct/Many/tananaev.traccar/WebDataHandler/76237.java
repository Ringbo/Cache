diff --git a/src/org/traccar/WebDataHandler.java b/src/org/traccar/WebDataHandler.java
index 332fc52..f40d49a 100644
--- a/src/org/traccar/WebDataHandler.java
+++ b/src/org/traccar/WebDataHandler.java
@@ -101,8 +101,8 @@
                 .replace("{protocol}", String.valueOf(position.getProtocol()))
                 .replace("{deviceTime}", String.valueOf(position.getDeviceTime().getTime()))
                 .replace("{fixTime}", String.valueOf(position.getFixTime().getTime()))
-                .replace("{valid}", String.valueOf(position.getLatitude()))
-                .replace("{latitude}", String.valueOf(position.getValid()))
+                .replace("{valid}", String.valueOf(position.getValid()))
+                .replace("{latitude}", String.valueOf(position.getLatitude()))
                 .replace("{longitude}", String.valueOf(position.getLongitude()))
                 .replace("{altitude}", String.valueOf(position.getAltitude()))
                 .replace("{speed}", String.valueOf(position.getSpeed()))
