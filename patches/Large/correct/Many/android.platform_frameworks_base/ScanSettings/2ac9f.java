diff --git a/core/java/android/bluetooth/le/ScanSettings.java b/core/java/android/bluetooth/le/ScanSettings.java
index abe3efd..4eeb577 100644
--- a/core/java/android/bluetooth/le/ScanSettings.java
+++ b/core/java/android/bluetooth/le/ScanSettings.java
@@ -178,7 +178,7 @@
         mScanResultType = scanResultType;
         mReportDelayMillis = reportDelayMillis;
         mNumOfMatchesPerFilter = numOfMatchesPerFilter;
-        mMatchMode = numOfMatchesPerFilter;
+        mMatchMode = matchMode;
     }
 
     private ScanSettings(Parcel in) {
