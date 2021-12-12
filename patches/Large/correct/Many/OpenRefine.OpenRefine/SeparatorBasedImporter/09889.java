diff --git a/main/src/com/google/refine/importers/SeparatorBasedImporter.java b/main/src/com/google/refine/importers/SeparatorBasedImporter.java
index 1c2173e..f1cfe47 100644
--- a/main/src/com/google/refine/importers/SeparatorBasedImporter.java
+++ b/main/src/com/google/refine/importers/SeparatorBasedImporter.java
@@ -92,7 +92,7 @@
     ) {
         // String lineSeparator = JSONUtilities.getString(options, "lineSeparator", "\n");
         String sep = JSONUtilities.getString(options, "separator", "\t");
-        if (sep == null) {
+        if (sep == null || "".equals(sep)) {
             sep = "\t";
         }
         boolean processQuotes = JSONUtilities.getBoolean(options, "processQuotes", true);
