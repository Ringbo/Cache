diff --git a/main/src/com/google/refine/importers/SeparatorBasedImporter.java b/main/src/com/google/refine/importers/SeparatorBasedImporter.java
index 6c8b294..4e742e4 100644
--- a/main/src/com/google/refine/importers/SeparatorBasedImporter.java
+++ b/main/src/com/google/refine/importers/SeparatorBasedImporter.java
@@ -73,7 +73,7 @@
         String separator = guessSeparator(job, fileRecords);
         JSONUtilities.safePut(options, "separator", separator != null ? separator : "\\t");
         
-        JSONUtilities.safePut(options, "guessCellValueTypes", true);
+        JSONUtilities.safePut(options, "guessCellValueTypes", false);
         JSONUtilities.safePut(options, "processQuotes", true);
 
         return options;
