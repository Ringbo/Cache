diff --git a/src/test/java/org/apache/commons/lang3/StringUtilsIsTest.java b/src/test/java/org/apache/commons/lang3/StringUtilsIsTest.java
index f0001e3..f93f1c0 100644
--- a/src/test/java/org/apache/commons/lang3/StringUtilsIsTest.java
+++ b/src/test/java/org/apache/commons/lang3/StringUtilsIsTest.java
@@ -35,7 +35,7 @@
 
     public void testIsAlpha() {
         assertEquals(false, StringUtils.isAlpha(null));
-        assertEquals(true, StringUtils.isAlpha(""));
+        assertEquals(false, StringUtils.isAlpha(""));
         assertEquals(false, StringUtils.isAlpha(" "));
         assertEquals(true, StringUtils.isAlpha("a"));
         assertEquals(true, StringUtils.isAlpha("A"));
@@ -49,7 +49,7 @@
 
     public void testIsAlphanumeric() {
         assertEquals(false, StringUtils.isAlphanumeric(null));
-        assertEquals(true, StringUtils.isAlphanumeric(""));
+        assertEquals(false, StringUtils.isAlphanumeric(""));
         assertEquals(false, StringUtils.isAlphanumeric(" "));
         assertEquals(true, StringUtils.isAlphanumeric("a"));
         assertEquals(true, StringUtils.isAlphanumeric("A"));
@@ -131,7 +131,7 @@
   
     public void testIsNumeric() {
         assertEquals(false, StringUtils.isNumeric(null));
-        assertEquals(true, StringUtils.isNumeric(""));
+        assertEquals(false, StringUtils.isNumeric(""));
         assertEquals(false, StringUtils.isNumeric(" "));
         assertEquals(false, StringUtils.isNumeric("a"));
         assertEquals(false, StringUtils.isNumeric("A"));
