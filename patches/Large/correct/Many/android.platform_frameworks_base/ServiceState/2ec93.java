diff --git a/telephony/java/android/telephony/ServiceState.java b/telephony/java/android/telephony/ServiceState.java
index 6c4bd66..606fcb4 100644
--- a/telephony/java/android/telephony/ServiceState.java
+++ b/telephony/java/android/telephony/ServiceState.java
@@ -693,7 +693,7 @@
         mOperatorNumeric = m.getString("operator-numeric");
         mIsManualNetworkSelection = m.getBoolean("manual");
         mRilVoiceRadioTechnology = m.getInt("radioTechnology");
-        mRilVoiceRadioTechnology = m.getInt("dataRadioTechnology");
+        mRilDataRadioTechnology = m.getInt("dataRadioTechnology");
         mCssIndicator = m.getBoolean("cssIndicator");
         mNetworkId = m.getInt("networkId");
         mSystemId = m.getInt("systemId");
