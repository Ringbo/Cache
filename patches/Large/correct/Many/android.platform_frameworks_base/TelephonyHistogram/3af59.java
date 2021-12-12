diff --git a/telephony/java/android/telephony/TelephonyHistogram.java b/telephony/java/android/telephony/TelephonyHistogram.java
index 985102c..9d9ce72 100644
--- a/telephony/java/android/telephony/TelephonyHistogram.java
+++ b/telephony/java/android/telephony/TelephonyHistogram.java
@@ -274,7 +274,7 @@
         out.writeInt(minTimeMs);
         out.writeInt(maxTimeMs);
         out.writeInt(averageTimeMs);
-        out.writeLong(sampleCount);
+        out.writeInt(sampleCount);
         if (initialTimings == null) {
             out.writeInt(ABSENT);
         } else {
