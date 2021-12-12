diff --git a/src/test/java/org/apache/commons/lang3/time/FastDateParserTest.java b/src/test/java/org/apache/commons/lang3/time/FastDateParserTest.java
index c334f36..e9acc17 100644
--- a/src/test/java/org/apache/commons/lang3/time/FastDateParserTest.java
+++ b/src/test/java/org/apache/commons/lang3/time/FastDateParserTest.java
@@ -693,7 +693,7 @@
     }
 
     @Test
-    public void testParseOffset() throws ParseException {
+    public void testParseOffset() {
         final DateParser parser = getInstance(YMD_SLASH);
         final Date date = parser.parse("Today is 2015/07/04", new ParsePosition(9));
 
