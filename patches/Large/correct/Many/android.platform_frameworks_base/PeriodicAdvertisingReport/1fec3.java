diff --git a/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java b/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java
index 55c3a73..73a2e74 100644
--- a/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java
+++ b/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java
@@ -71,7 +71,7 @@
     @Override
     public void writeToParcel(Parcel dest, int flags) {
         dest.writeInt(mSyncHandle);
-        dest.writeLong(mTxPower);
+        dest.writeInt(mTxPower);
         dest.writeInt(mRssi);
         dest.writeInt(mDataStatus);
         if (mData != null) {
