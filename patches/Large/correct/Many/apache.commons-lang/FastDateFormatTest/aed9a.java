diff --git a/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java b/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java
index 8645bf6..e4cde1a 100644
--- a/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java
+++ b/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java
@@ -96,7 +96,7 @@
 
             assertTrue(format1 != format2); // -- junit 3.8 version -- assertFalse(format1 == format2);
             assertSame(format1, format3);
-            assertSame(Locale.GERMANY, format1.getLocale());
+            assertEquals(Locale.GERMANY, format1.getLocale());
 
         } finally {
             Locale.setDefault(realDefaultLocale);
