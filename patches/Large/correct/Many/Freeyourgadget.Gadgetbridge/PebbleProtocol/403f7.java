diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
index 2f6f923..d79f3d9 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
@@ -1876,7 +1876,7 @@
                 int timestamp = buf.getInt();
                 int log_tag = buf.getInt();
                 byte item_type = buf.get();
-                short item_size = buf.get();
+                short item_size = buf.getShort();
                 LOG.info("DATALOG OPENSESSION. id=" + (id & 0xff) + ", App UUID=" + uuid.toString() + ", log_tag=" + log_tag + ", item_type=" + item_type + ", itemSize=" + item_size);
                 if (!mDatalogSessions.containsKey(id)) {
                     if (uuid.equals(UUID_ZERO) && log_tag == 81) {
