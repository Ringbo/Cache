diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceCandidate.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceCandidate.java
index 3696ec5..cec517a 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceCandidate.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/impl/GBDeviceCandidate.java
@@ -57,7 +57,7 @@
         dest.writeParcelable(device, 0);
         dest.writeInt(rssi);
         dest.writeString(deviceType.name());
-        dest.writeArray(serviceUuds);
+        dest.writeParcelableArray(serviceUuds, 0);
     }
 
     public static final Creator<GBDeviceCandidate> CREATOR = new Creator<GBDeviceCandidate>() {
