diff --git a/location/java/com/android/internal/location/GpsLocationProvider.java b/location/java/com/android/internal/location/GpsLocationProvider.java
index fa53ccf..c3dddad 100755
--- a/location/java/com/android/internal/location/GpsLocationProvider.java
+++ b/location/java/com/android/internal/location/GpsLocationProvider.java
@@ -199,7 +199,7 @@
     // flags to trigger NTP or XTRA data download when network becomes available
     // initialized to true so we do NTP and XTRA when the network comes up after booting
     private boolean mInjectNtpTimePending = true;
-    private boolean mDownloadXtraDataPending = true;
+    private boolean mDownloadXtraDataPending = false;
 
     // true if GPS is navigating
     private boolean mNavigating;
@@ -522,7 +522,7 @@
     }
 
     private void handleDownloadXtraData() {
-        if (!mDownloadXtraDataPending) {
+        if (!mNetworkAvailable) {
             // try again when network is up
             mDownloadXtraDataPending = true;
             return;
