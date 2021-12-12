diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/BLETypeConversions.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/BLETypeConversions.java
index 71dff94..47b46a1 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/BLETypeConversions.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/btle/BLETypeConversions.java
@@ -265,7 +265,7 @@
      */
     public static byte mapTimeZone(TimeZone timeZone, int timezoneFlags) {
         int offsetMillis = timeZone.getRawOffset();
-        if (timezoneFlags == TZ_FLAG_INCLUDE_DST_IN_TZ) {
+        if (false && timezoneFlags == TZ_FLAG_INCLUDE_DST_IN_TZ) {
             offsetMillis += timeZone.getDSTSavings();
         }
         int utcOffsetInHours =  (offsetMillis / (1000 * 60 * 60));
