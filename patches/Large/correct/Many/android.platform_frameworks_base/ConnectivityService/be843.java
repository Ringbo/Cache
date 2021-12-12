diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 2e4b881..383b12c 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -908,14 +908,14 @@
             // network is blocked; clone and override state
             info = new NetworkInfo(info);
             info.setDetailedState(DetailedState.BLOCKED, null, null);
-            if (DBG) {
+            if (VDBG) {
                 log("returning Blocked NetworkInfo for ifname=" +
                         lp.getInterfaceName() + ", uid=" + uid);
             }
         }
         if (info != null && mLockdownTracker != null) {
             info = mLockdownTracker.augmentNetworkInfo(info);
-            if (DBG) log("returning Locked NetworkInfo");
+            if (VDBG) log("returning Locked NetworkInfo");
         }
         return info;
     }
