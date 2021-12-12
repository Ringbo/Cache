diff --git a/src/org/traccar/protocol/Gt06ProtocolDecoder.java b/src/org/traccar/protocol/Gt06ProtocolDecoder.java
index 93f2eee..97bd970 100644
--- a/src/org/traccar/protocol/Gt06ProtocolDecoder.java
+++ b/src/org/traccar/protocol/Gt06ProtocolDecoder.java
@@ -28,16 +28,10 @@
 import org.traccar.helper.Log;
 import org.traccar.model.Position;
 
-/**
- * T55 tracker protocol decoder
- */
 public class Gt06ProtocolDecoder extends BaseProtocolDecoder {
 
     private Long deviceId;
 
-    /**
-     * Initialize
-     */
     public Gt06ProtocolDecoder(ServerManager serverManager) {
         super(serverManager);
     }
@@ -145,7 +139,7 @@
             position.setCourse((double) (union & 0x03FF));
             position.setValid((union & 0x1000) != 0);
             if ((union & 0x0400) == 0) latitude = -latitude;
-            if ((union & 0x0800) == 0) longitude = -longitude;
+            if ((union & 0x0800) != 0) longitude = -longitude;
 
             position.setLatitude(latitude);
             position.setLongitude(longitude);
