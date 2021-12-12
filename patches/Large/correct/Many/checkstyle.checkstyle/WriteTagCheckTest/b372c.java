diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/WriteTagCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/WriteTagCheckTest.java
index 54a6109..ae0ec1b 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/WriteTagCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/WriteTagCheckTest.java
@@ -202,10 +202,10 @@
         final int errs = checker.process(theFiles);
 
         // process each of the lines
-        final ByteArrayInputStream bais =
+        final ByteArrayInputStream localStream =
             new ByteArrayInputStream(stream.toByteArray());
         try (final LineNumberReader lnr = new LineNumberReader(
-                new InputStreamReader(bais, StandardCharsets.UTF_8))) {
+                new InputStreamReader(localStream, StandardCharsets.UTF_8))) {
 
             for (int i = 0; i < expected.length; i++) {
                 final String expectedResult = messageFileName + ":" + expected[i];
