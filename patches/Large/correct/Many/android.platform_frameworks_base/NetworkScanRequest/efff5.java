diff --git a/telephony/java/android/telephony/NetworkScanRequest.java b/telephony/java/android/telephony/NetworkScanRequest.java
index 9726569..38678a3 100644
--- a/telephony/java/android/telephony/NetworkScanRequest.java
+++ b/telephony/java/android/telephony/NetworkScanRequest.java
@@ -152,7 +152,7 @@
         this.mMaxSearchTime = maxSearchTime;
         this.mIncrementalResults = incrementalResults;
         this.mIncrementalResultsPeriodicity = incrementalResultsPeriodicity;
-        if (mMccMncs != null) {
+        if (mccMncs != null) {
             this.mMccMncs = (ArrayList<String>) mccMncs.clone();
         } else {
             this.mMccMncs = new ArrayList<>();
