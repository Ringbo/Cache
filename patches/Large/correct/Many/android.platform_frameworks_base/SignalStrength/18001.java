diff --git a/telephony/java/android/telephony/SignalStrength.java b/telephony/java/android/telephony/SignalStrength.java
index 4e56396..95abb91 100644
--- a/telephony/java/android/telephony/SignalStrength.java
+++ b/telephony/java/android/telephony/SignalStrength.java
@@ -911,11 +911,8 @@
 
         if (rsrpIconLevel != -1) return rsrpIconLevel;
 
-        /* Valid values are (0-63, 99) as defined in TS 36.331 */
-        // TODO the range here is probably supposed to be (0..31, 99). It's unclear if anyone relies
-        // on the current incorrect range check, so this will be fixed in a future release with more
-        // soak time
-        if (mLteSignalStrength > 63) rssiIconLevel = SIGNAL_STRENGTH_NONE_OR_UNKNOWN;
+        /* Valid values are (0-31, 99) as defined in TS 27.007 8.5 */
+        if (mLteSignalStrength > 31) rssiIconLevel = SIGNAL_STRENGTH_NONE_OR_UNKNOWN;
         else if (mLteSignalStrength >= 12) rssiIconLevel = SIGNAL_STRENGTH_GREAT;
         else if (mLteSignalStrength >= 8) rssiIconLevel = SIGNAL_STRENGTH_GOOD;
         else if (mLteSignalStrength >= 5) rssiIconLevel = SIGNAL_STRENGTH_MODERATE;
