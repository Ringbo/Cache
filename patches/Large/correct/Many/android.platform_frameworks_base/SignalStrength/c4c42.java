diff --git a/telephony/java/android/telephony/SignalStrength.java b/telephony/java/android/telephony/SignalStrength.java
index f535e5d..fced667 100644
--- a/telephony/java/android/telephony/SignalStrength.java
+++ b/telephony/java/android/telephony/SignalStrength.java
@@ -911,7 +911,7 @@
         else if (tdScdmaDbm >= -49) level = SIGNAL_STRENGTH_GREAT;
         else if (tdScdmaDbm >= -73) level = SIGNAL_STRENGTH_GOOD;
         else if (tdScdmaDbm >= -97) level = SIGNAL_STRENGTH_MODERATE;
-        else if (tdScdmaDbm >= -120) level = SIGNAL_STRENGTH_POOR;
+        else if (tdScdmaDbm >= -110) level = SIGNAL_STRENGTH_POOR;
         else level = SIGNAL_STRENGTH_NONE_OR_UNKNOWN;
 
         if (DBG) log("getTdScdmaLevel = " + level);
