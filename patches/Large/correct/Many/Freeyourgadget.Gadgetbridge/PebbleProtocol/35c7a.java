diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
index 247eb3b..fadec9b 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleProtocol.java
@@ -513,7 +513,7 @@
         }
 
         int replies_length = -1;
-        if (cannedReplies != null) {
+        if (cannedReplies != null && cannedReplies.length > 0) {
             actions_count++;
             for (String reply : cannedReplies) {
                 replies_length += reply.getBytes().length + 1;
@@ -774,7 +774,7 @@
         }
 
         int replies_length = -1;
-        if (cannedReplies != null) {
+        if (cannedReplies != null && cannedReplies.length > 0) {
             actions_count++;
             for (String reply : cannedReplies) {
                 replies_length += reply.getBytes().length + 1;
