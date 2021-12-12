diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java
index 5145de6..a90d76b 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/miband/MiBandSupport.java
@@ -820,7 +820,7 @@
 
                     byte[] alarmMessage = new byte[]{
                             MiBandService.COMMAND_SET_TIMER,
-                            (byte)(3-iteration),
+                            (byte)(2-iteration),
                             (byte) 1,
                             calBytes[0],
                             calBytes[1],
