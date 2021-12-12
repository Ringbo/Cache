diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/BluetoothConnectReceiver.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/BluetoothConnectReceiver.java
index 5282e7a..af97386 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/BluetoothConnectReceiver.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/BluetoothConnectReceiver.java
@@ -14,7 +14,7 @@
 
 public class BluetoothConnectReceiver extends BroadcastReceiver {
 
-    private static final Logger LOG = LoggerFactory.getLogger(DeviceCommunicationService.class);
+    private static final Logger LOG = LoggerFactory.getLogger(BluetoothConnectReceiver.class);
 
     final DeviceCommunicationService service;
 
