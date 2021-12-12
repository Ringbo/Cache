diff --git a/src/java/org/apache/commons/lang3/time/FastDateFormat.java b/src/java/org/apache/commons/lang3/time/FastDateFormat.java
index d60af96..e30da2a 100644
--- a/src/java/org/apache/commons/lang3/time/FastDateFormat.java
+++ b/src/java/org/apache/commons/lang3/time/FastDateFormat.java
@@ -869,7 +869,7 @@
      */
     public StringBuffer format(Calendar calendar, StringBuffer buf) {
         if (mTimeZoneForced) {
-            calendar.getTime(); /// LANG-538
+            calendar.getTimeInMillis(); /// LANG-538
             calendar = (Calendar) calendar.clone();
             calendar.setTimeZone(mTimeZone);
         }
