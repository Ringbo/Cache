diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocTagContinuationIndentationCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocTagContinuationIndentationCheckTest.java
index 910b919..5a3d2bc 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocTagContinuationIndentationCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocTagContinuationIndentationCheckTest.java
@@ -30,7 +30,7 @@
     public void testFP() throws Exception
     {
         final DefaultConfiguration checkConfig =
-                createCheckConfig(JavaDocTagContinuationIndentationCheck.class);
+                createCheckConfig(JavadocTagContinuationIndentationCheck.class);
         final String[] expected = {
         };
         verify(checkConfig, getPath("javadoc/GuavaFP.java"), expected);
