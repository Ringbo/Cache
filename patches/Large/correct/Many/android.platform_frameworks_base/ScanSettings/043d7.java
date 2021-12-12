diff --git a/core/java/android/bluetooth/le/ScanSettings.java b/core/java/android/bluetooth/le/ScanSettings.java
index 123514e..dad486d 100644
--- a/core/java/android/bluetooth/le/ScanSettings.java
+++ b/core/java/android/bluetooth/le/ScanSettings.java
@@ -187,7 +187,7 @@
         mScanResultType = scanResultType;
         mReportDelayMillis = reportDelayMillis;
         mNumOfMatchesPerFilter = numOfMatchesPerFilter;
-        mMatchMode = numOfMatchesPerFilter;
+        mMatchMode = matchMode;
     }
 
     private ScanSettings(Parcel in) {
