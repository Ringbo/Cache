diff --git a/main/src/com/google/refine/importers/ExcelImporter.java b/main/src/com/google/refine/importers/ExcelImporter.java
index ee7976d..e040b1d 100644
--- a/main/src/com/google/refine/importers/ExcelImporter.java
+++ b/main/src/com/google/refine/importers/ExcelImporter.java
@@ -160,7 +160,7 @@
                 
                 @Override
                 public List<Object> getNextRowOfCells() throws IOException {
-                    if (nextRow >= lastRow) {
+                    if (nextRow > lastRow) {
                         return null;
                     }
                     
