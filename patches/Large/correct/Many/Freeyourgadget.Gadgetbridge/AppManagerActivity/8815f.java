diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/AppManagerActivity.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/AppManagerActivity.java
index e2a1d56..6b566f3 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/AppManagerActivity.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/AppManagerActivity.java
@@ -80,7 +80,7 @@
         List<GBDeviceApp> systemApps = new ArrayList<>();
         systemApps.add(new GBDeviceApp(UUID.fromString("4dab81a6-d2fc-458a-992c-7a1f3b96a970"), "Sports (System)", "Pebble Inc.", "", GBDeviceApp.Type.APP_SYSTEM));
         systemApps.add(new GBDeviceApp(UUID.fromString("cf1e816a-9db0-4511-bbb8-f60c48ca8fac"), "Golf (System)", "Pebble Inc.", "", GBDeviceApp.Type.APP_SYSTEM));
-        if (mGBDevice != null && !"aplite".equals(PebbleUtils.getPlatformName(mGBDevice.getFirmwareVersion()))) {
+        if (mGBDevice != null && !"aplite".equals(PebbleUtils.getPlatformName(mGBDevice.getHardwareVersion()))) {
             systemApps.add(new GBDeviceApp(PebbleProtocol.UUID_PEBBLE_HEALTH, "Health (System)", "Pebble Inc.", "", GBDeviceApp.Type.APP_SYSTEM));
         }
 
