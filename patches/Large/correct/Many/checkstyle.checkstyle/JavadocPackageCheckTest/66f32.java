diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocPackageCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocPackageCheckTest.java
index ea5ba11..d8a51a9 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocPackageCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocPackageCheckTest.java
@@ -156,11 +156,9 @@
     /**
      * Using direct call to check here because there is no other way
      * to reproduce exception with invalid canonical path.
-     *
-     * @throws Exception if error occurs
      */
     @Test
-    public void testCheckstyleExceptionIfFailedToGetCanonicalPathToFile() throws Exception {
+    public void testCheckstyleExceptionIfFailedToGetCanonicalPathToFile() {
         final JavadocPackageCheck check = new JavadocPackageCheck();
         final File fileWithInvalidPath = new File("\u0000\u0000\u0000");
         final FileText mockFileText = new FileText(fileWithInvalidPath, Collections.emptyList());
