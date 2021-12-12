diff --git a/core/src/main/java/de/danoeh/antennapod/core/service/GpodnetSyncService.java b/core/src/main/java/de/danoeh/antennapod/core/service/GpodnetSyncService.java
index e9312b9..6b3ece4 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/service/GpodnetSyncService.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/service/GpodnetSyncService.java
@@ -83,7 +83,7 @@
         } else {
             Log.e(TAG, "Received invalid intent: action argument is null");
         }
-        return START_FLAG_REDELIVERY;
+        return START_STICKY;
     }
 
     @Override
