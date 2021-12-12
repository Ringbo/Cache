diff --git a/h2/src/test/org/h2/test/unit/TestDateTimeUtils.java b/h2/src/test/org/h2/test/unit/TestDateTimeUtils.java
index 10925eb..040aae9 100644
--- a/h2/src/test/org/h2/test/unit/TestDateTimeUtils.java
+++ b/h2/src/test/org/h2/test/unit/TestDateTimeUtils.java
@@ -45,7 +45,7 @@
      * {@link DateTimeUtils#getIsoDayOfWeek(long)}.
      */
     private void testDayOfWeek() {
-        GregorianCalendar gc = DateTimeUtils.createGregorianCalendar();
+        GregorianCalendar gc = DateTimeUtils.createGregorianCalendar(DateTimeUtils.UTC);
         for (int i = -1_000_000; i <= 1_000_000; i++) {
             gc.clear();
             gc.setTimeInMillis(i * 86400000L);
