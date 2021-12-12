diff --git a/src/main/java/org/altbeacon/beacon/BeaconManager.java b/src/main/java/org/altbeacon/beacon/BeaconManager.java
index ea26542..42aec26 100644
--- a/src/main/java/org/altbeacon/beacon/BeaconManager.java
+++ b/src/main/java/org/altbeacon/beacon/BeaconManager.java
@@ -484,7 +484,8 @@
         synchronized(consumers) {
             // Annotation doesn't guarantee we get a non-null, but raising an NPE here is excessive
             //noinspection ConstantConditions
-            return consumer != null && consumers.get(consumer) != null && (serviceMessenger != null);
+            return consumer != null && consumers.get(consumer) != null &&
+                    (mScheduledScanJobsEnabled || serviceMessenger != null);
         }
     }
 
@@ -495,7 +496,8 @@
      */
     public boolean isAnyConsumerBound() {
         synchronized(consumers) {
-            return consumers.isEmpty() && (serviceMessenger != null);
+            return !consumers.isEmpty() &&
+                    (mScheduledScanJobsEnabled || serviceMessenger != null);
         }
     }
 
