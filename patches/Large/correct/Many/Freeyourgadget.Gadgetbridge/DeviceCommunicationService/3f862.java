diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/DeviceCommunicationService.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/DeviceCommunicationService.java
index 2437f50..1ea9124 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/DeviceCommunicationService.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/DeviceCommunicationService.java
@@ -207,14 +207,13 @@
             String action = intent.getAction();
             if (action.equals(GBDevice.ACTION_DEVICE_CHANGED)) {
                 GBDevice device = intent.getParcelableExtra(GBDevice.EXTRA_DEVICE);
-                // FIXME: mGBDevice was null here once
-                if (mGBDevice.equals(device)) {
+                if (mGBDevice != null && mGBDevice.equals(device)) {
                     mGBDevice = device;
                     boolean enableReceivers = mDeviceSupport != null && (mDeviceSupport.useAutoConnect() || mGBDevice.isInitialized());
                     setReceiversEnableState(enableReceivers, mGBDevice.isInitialized(), DeviceHelper.getInstance().getCoordinator(device));
                     GB.updateNotification(mGBDevice.getName() + " " + mGBDevice.getStateString(), mGBDevice.isInitialized(), context);
                 } else {
-                    LOG.error("Got ACTION_DEVICE_CHANGED from unexpected device: " + mGBDevice);
+                    LOG.error("Got ACTION_DEVICE_CHANGED from unexpected device: " + device);
                 }
             }
         }
