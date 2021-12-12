diff --git a/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java b/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java
index 902ed41..160f4e8 100644
--- a/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java
+++ b/src/plugin/languageidentifier/src/test/org/apache/nutch/analysis/lang/TestLanguageIdentifier.java
@@ -213,7 +213,7 @@
                 if (!tokens[0].equals("")) {
                     long start = System.currentTimeMillis();
                     // Identify the whole file
-                    String lang = idfr.identify(this.getClass().getResourceAsStream(tokens[0]));
+                    String lang = idfr.identify(this.getClass().getResourceAsStream(tokens[0]), "UTF-8");
                     total += System.currentTimeMillis() - start;
                     assertEquals(tokens[1], lang);
                     // Then, each line of the file...
