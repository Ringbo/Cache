diff --git a/platform/util/testSrc/com/intellij/util/text/DateFormatUtilTest.java b/platform/util/testSrc/com/intellij/util/text/DateFormatUtilTest.java
index 5a0da0e..0104658 100644
--- a/platform/util/testSrc/com/intellij/util/text/DateFormatUtilTest.java
+++ b/platform/util/testSrc/com/intellij/util/text/DateFormatUtilTest.java
@@ -49,7 +49,7 @@
 
   @Test
   public void testTime() throws Exception {
-    Clock.setTime(2004, Calendar.DECEMBER, 10, 17, 10, 15);
+    Clock.setTime(1980, Calendar.DECEMBER, 10, 17, 10, 15);
 
     if (SystemInfo.isMac) {
       assertEquals("17:10", DateFormatUtil.formatTime(Clock.getTime()));
@@ -60,7 +60,7 @@
       assertEquals("17:10:15", printTimeForLocale("de_DE.UTF-8", Clock.getTime()));
     }
     else if (SystemInfo.isWinVistaOrNewer) {
-      long time = new Date().getTime();
+      long time = Clock.getTime();
       assertEquals(printWindowsTime(time), DateFormatUtil.formatTimeWithSeconds(time));
     }
     else {
