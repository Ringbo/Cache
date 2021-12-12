diff --git a/extensions/wikidata/src/org/openrefine/wikidata/editing/NewItemLibrary.java b/extensions/wikidata/src/org/openrefine/wikidata/editing/NewItemLibrary.java
index 1a4a4d9..c66f249 100644
--- a/extensions/wikidata/src/org/openrefine/wikidata/editing/NewItemLibrary.java
+++ b/extensions/wikidata/src/org/openrefine/wikidata/editing/NewItemLibrary.java
@@ -68,7 +68,7 @@
         
         for(Row row : project.rows) {
             for(Cell cell : row.cells) {
-                if (cell.recon == null) {
+                if (cell == null || cell.recon == null) {
                     continue;
                 }
                 Recon recon = cell.recon;
