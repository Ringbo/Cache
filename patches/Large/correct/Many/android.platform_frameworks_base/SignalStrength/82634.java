diff --git a/telephony/java/android/telephony/SignalStrength.java b/telephony/java/android/telephony/SignalStrength.java
index 92b889b..4671310 100755
--- a/telephony/java/android/telephony/SignalStrength.java
+++ b/telephony/java/android/telephony/SignalStrength.java
@@ -279,7 +279,7 @@
         mCdmaEcio = (mCdmaEcio > 0) ? -mCdmaEcio : -160;
 
         mEvdoDbm = (mEvdoDbm > 0) ? -mEvdoDbm : -120;
-        mEvdoEcio = (mEvdoEcio > 0) ? -mEvdoEcio : -1;
+        mEvdoEcio = (mEvdoEcio >= 0) ? -mEvdoEcio : -1;
         mEvdoSnr = ((mEvdoSnr > 0) && (mEvdoSnr <= 8)) ? mEvdoSnr : -1;
 
         // TS 36.214 Physical Layer Section 5.1.3, TS 36.331 RRC
