diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceService.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceService.java
index 7dab916..c410d5f 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceService.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceService.java
@@ -175,7 +175,7 @@
     @Override
     public void onFindDevice(boolean start) {
         Intent intent = createIntent().setAction(ACTION_FIND_DEVICE)
-                .putExtra(EXTRA_APP_UUID, start);
+                .putExtra(EXTRA_FIND_START, start);
         invokeService(intent);
     }
 
