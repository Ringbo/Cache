diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitbip/AmazfitBipService.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitbip/AmazfitBipService.java
index 6b627b0..7967eeb 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitbip/AmazfitBipService.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitbip/AmazfitBipService.java
@@ -43,5 +43,5 @@
 
     public static final byte[] COMMAND_ACK_FIND_PHONE_IN_PROGRESS = new byte[]{ENDPOINT_DISPLAY, 0x14, 0x00, 0x00};
 
-    public static final byte[] COMMAND_CHANGE_SCREENS = new byte[]{ENDPOINT_DISPLAY_ITEMS, DISPLAY_ITEM_BIT_CLOCK, 0x00, 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
+    public static final byte[] COMMAND_CHANGE_SCREENS = new byte[]{ENDPOINT_DISPLAY_ITEMS, DISPLAY_ITEM_BIT_CLOCK, 0x10, 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
 }
