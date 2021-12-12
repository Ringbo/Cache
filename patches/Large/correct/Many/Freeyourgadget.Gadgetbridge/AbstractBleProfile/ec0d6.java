diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/AbstractBleProfile.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/AbstractBleProfile.java
index 4f2aa82..69a66ca 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/AbstractBleProfile.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/profiles/AbstractBleProfile.java
@@ -53,7 +53,9 @@
      * @param intent the intent to broadcast
      */
     protected void notify(Intent intent) {
-        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
+        // note: we send synchronously in order to keep the processing order of BLE events
+        // in BtleQueue and the reception of results.
+        LocalBroadcastManager.getInstance(getContext()).sendBroadcastSync(intent);
     }
 
     /**
