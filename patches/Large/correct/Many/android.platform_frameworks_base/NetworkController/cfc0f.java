diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkController.java b/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkController.java
index 16db1d7..60dfdac 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkController.java
@@ -225,7 +225,7 @@
     public void addSignalCluster(SignalCluster cluster) {
         mSignalClusters.add(cluster);
         cluster.setWifiIndicators(
-                mWifiEnabled,
+                mWifiConnected, // only show wifi in the cluster if connected
                 mWifiIconId,
                 mWifiActivityIconId);
         cluster.setMobileDataIndicators(
@@ -862,7 +862,7 @@
             // NB: the mLast*s will be updated later
             for (SignalCluster cluster : mSignalClusters) {
                 cluster.setWifiIndicators(
-                        mWifiEnabled,
+                        mWifiConnected, // only show wifi in the cluster if connected
                         mWifiIconId,
                         mWifiActivityIconId);
                 cluster.setMobileDataIndicators(
