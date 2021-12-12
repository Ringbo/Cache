diff --git a/src/test/java/org/apache/commons/lang3/CharUtilsTest.java b/src/test/java/org/apache/commons/lang3/CharUtilsTest.java
index 988c380..ea68ada 100644
--- a/src/test/java/org/apache/commons/lang3/CharUtilsTest.java
+++ b/src/test/java/org/apache/commons/lang3/CharUtilsTest.java
@@ -235,7 +235,7 @@
         assertTrue(CharUtils.isAsciiPrintable('3'));
         assertTrue(CharUtils.isAsciiPrintable('-'));
         assertFalse(CharUtils.isAsciiPrintable('\n'));
-        assertFalse(CharUtils.isAscii(CHAR_COPY));
+        assertFalse(CharUtils.isAsciiPrintable(CHAR_COPY));
        
         for (int i = 0; i < 196; i++) {
             if (i >= 32 && i <= 126) {
