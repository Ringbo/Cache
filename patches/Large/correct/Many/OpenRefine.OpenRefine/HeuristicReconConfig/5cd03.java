diff --git a/src/main/java/com/metaweb/gridworks/model/recon/HeuristicReconConfig.java b/src/main/java/com/metaweb/gridworks/model/recon/HeuristicReconConfig.java
index ad83d98..4dbf14a 100644
--- a/src/main/java/com/metaweb/gridworks/model/recon/HeuristicReconConfig.java
+++ b/src/main/java/com/metaweb/gridworks/model/recon/HeuristicReconConfig.java
@@ -156,7 +156,7 @@
                         Cell cell2 = row.getCell(detailCellIndex);
                         if (cell2 == null || !ExpressionUtils.isNonBlankData(cell2.value)) {
                             int cellIndex = project.columnModel.getColumnByName(columnName).getCellIndex();
-                            if (cellIndex < row.contextRowSlots.length) {
+                            if (row.contextRowSlots != null && cellIndex < row.contextRowSlots.length) {
                                 int contextRowIndex = row.contextRowSlots[cellIndex];
                                 if (contextRowIndex >= 0 && contextRowIndex < project.rows.size()) {
                                     Row row2 = project.rows.get(contextRowIndex);
