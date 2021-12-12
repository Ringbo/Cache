diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressElement.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressElement.java
index 7c6cd90..b288cff 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressElement.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/SuppressElement.java
@@ -57,16 +57,16 @@
     private String moduleId;
 
     /** Line number filter. */
-    private CSVFilter lineFilter;
+    private CsvFilter lineFilter;
 
     /** CSV for line number filter. */
-    private String linesCSV;
+    private String linesCsv;
 
     /** Column number filter. */
-    private CSVFilter columnFilter;
+    private CsvFilter columnFilter;
 
     /** CSV for column number filter. */
-    private String columnsCSV;
+    private String columnsCsv;
 
     /**
      * Constructs a {@code SuppressElement} for a
@@ -102,12 +102,12 @@
      * @param lines CSV values and ranges for line number filtering.
      */
     public void setLines(String lines) {
-        linesCSV = lines;
+        linesCsv = lines;
         if (lines == null) {
             lineFilter = null;
         }
         else {
-            lineFilter = new CSVFilter(lines);
+            lineFilter = new CsvFilter(lines);
         }
     }
 
@@ -117,12 +117,12 @@
      * @param columns CSV values and ranges for column number filtering.
      */
     public void setColumns(String columns) {
-        columnsCSV = columns;
+        columnsCsv = columns;
         if (columns == null) {
             columnFilter = null;
         }
         else {
-            columnFilter = new CSVFilter(columns);
+            columnFilter = new CsvFilter(columns);
         }
     }
 
@@ -154,7 +154,7 @@
 
     @Override
     public int hashCode() {
-        return Objects.hash(filePattern, checkPattern, moduleId, linesCSV, columnsCSV);
+        return Objects.hash(filePattern, checkPattern, moduleId, linesCsv, columnsCsv);
     }
 
     @Override
@@ -169,7 +169,7 @@
         return Objects.equals(filePattern, suppressElement.filePattern)
                 && Objects.equals(checkPattern, suppressElement.checkPattern)
                 && Objects.equals(moduleId, suppressElement.moduleId)
-                && Objects.equals(linesCSV, suppressElement.linesCSV)
-                && Objects.equals(columnsCSV, suppressElement.columnsCSV);
+                && Objects.equals(linesCsv, suppressElement.linesCsv)
+                && Objects.equals(columnsCsv, suppressElement.columnsCsv);
     }
 }
