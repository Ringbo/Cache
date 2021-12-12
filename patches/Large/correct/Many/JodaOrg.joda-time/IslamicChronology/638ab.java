diff --git a/JodaTime/src/java/org/joda/time/chrono/IslamicChronology.java b/JodaTime/src/java/org/joda/time/chrono/IslamicChronology.java
index 44be989..7e90d20 100644
--- a/JodaTime/src/java/org/joda/time/chrono/IslamicChronology.java
+++ b/JodaTime/src/java/org/joda/time/chrono/IslamicChronology.java
@@ -463,7 +463,7 @@
     /**
      * Leap year patterns for the Islamic Chronology.
      */
-    public static class LeapYearPatternType implements Serializable {
+    static class LeapYearPatternType implements Serializable {
         /** Serialization lock */
         private static final long serialVersionUID = 26581275372698L;
 //        /** Leap year raw data encoded into bits. */
@@ -488,7 +488,7 @@
          * @param index  the index
          * @param pattern  the bit pattern
          */
-        protected LeapYearPatternType(int index, int pattern) {
+        LeapYearPatternType(int index, int pattern) {
             super();
             this.index = (byte) index;
             this.pattern = pattern;
@@ -499,7 +499,7 @@
          * @param year  the year to query
          * @return true if leap
          */
-        public boolean isLeapYear(int year) {
+        boolean isLeapYear(int year) {
             int key = 1 << (year % 30);
             return ((pattern & key) > 0);
         }
