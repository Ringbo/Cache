diff --git a/services/java/com/android/server/location/GpsLocationProvider.java b/services/java/com/android/server/location/GpsLocationProvider.java
index f8c9a61..ea6aa94 100755
--- a/services/java/com/android/server/location/GpsLocationProvider.java
+++ b/services/java/com/android/server/location/GpsLocationProvider.java
@@ -177,7 +177,7 @@
     // flags to trigger NTP or XTRA data download when network becomes available
     // initialized to true so we do NTP and XTRA when the network comes up after booting
     private boolean mInjectNtpTimePending = true;
-    private boolean mDownloadXtraDataPending = true;
+    private boolean mDownloadXtraDataPending = false;
 
     // true if GPS is navigating
     private boolean mNavigating;
@@ -495,7 +495,7 @@
     }
 
     private void handleDownloadXtraData() {
-        if (!mDownloadXtraDataPending) {
+        if (!mNetworkAvailable) {
             // try again when network is up
             mDownloadXtraDataPending = true;
             return;
