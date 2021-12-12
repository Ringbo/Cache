diff --git a/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java b/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java
index 7094145..902ed41 100644
--- a/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java
+++ b/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java
@@ -219,7 +219,7 @@
                     // Then, each line of the file...
                     BufferedReader testFile = new BufferedReader(
                             new InputStreamReader(
-                                this.getClass().getResourceAsStream(tokens[0])));
+                                this.getClass().getResourceAsStream(tokens[0]), "UTF-8"));
                     String testLine = null;
                     while((testLine = testFile.readLine()) != null) {
                         testLine = testLine.trim();
