diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
index 0a2d7cd..eff90ef 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
@@ -1706,7 +1706,7 @@
         buf.put(APPLICATIONMESSAGE_ACK);
         buf.put(id);
         buf.putLong(uuid.getMostSignificantBits());
-        buf.putLong(uuid.getMostSignificantBits());
+        buf.putLong(uuid.getLeastSignificantBits());
 
         return buf.array();
     }
