diff --git a/src/main/java/com/metaweb/gridworks/operations/ReconMatchBestCandidatesOperation.java b/src/main/java/com/metaweb/gridworks/operations/ReconMatchBestCandidatesOperation.java
index 34f8863..a576044 100644
--- a/src/main/java/com/metaweb/gridworks/operations/ReconMatchBestCandidatesOperation.java
+++ b/src/main/java/com/metaweb/gridworks/operations/ReconMatchBestCandidatesOperation.java
@@ -72,7 +72,7 @@
             public boolean visit(Project project, int rowIndex, Row row, boolean includeContextual, boolean includeDependent) {
                 if (cellIndex < row.cells.size()) {
                     Cell cell = row.cells.get(cellIndex);
-                    if (cell.recon != null) {
+                    if (cell != null && cell.recon != null) {
                         ReconCandidate candidate = cell.recon.getBestCandidate();
                         if (candidate != null) {
                             Cell newCell = new Cell(
