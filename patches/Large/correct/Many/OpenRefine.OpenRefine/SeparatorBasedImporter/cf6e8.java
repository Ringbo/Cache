diff --git a/main/src/com/google/refine/importers/SeparatorBasedImporter.java b/main/src/com/google/refine/importers/SeparatorBasedImporter.java
index c237b03..06f8058 100644
--- a/main/src/com/google/refine/importers/SeparatorBasedImporter.java
+++ b/main/src/com/google/refine/importers/SeparatorBasedImporter.java
@@ -101,7 +101,7 @@
         final CSVParser parser = new CSVParser(
             sep.toCharArray()[0],//HACK changing string to char - won't work for multi-char separators.
             CSVParser.DEFAULT_QUOTE_CHARACTER,
-            (char) 127, // we don't want escape processing try DEL as a rare character until we can turn it off
+            (char) 0, // we don't want escape processing
             strictQuotes,
             CSVParser.DEFAULT_IGNORE_LEADING_WHITESPACE,
             !processQuotes);
