diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/GenericWhitespaceCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/GenericWhitespaceCheckTest.java
index 8c2d48c..470134d 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/GenericWhitespaceCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/GenericWhitespaceCheckTest.java
@@ -139,8 +139,7 @@
     @Test
     public void testGenericEndsTheLine() throws Exception {
         final String[] expected = ArrayUtils.EMPTY_STRING_ARRAY;
-        verify(checkConfig, getNonCompilablePath("InputGenericWhitespaceEndsTheLine.java"),
-                expected);
+        verify(checkConfig, getPath("InputGenericWhitespaceEndsTheLine.java"), expected);
     }
 
     @Test
