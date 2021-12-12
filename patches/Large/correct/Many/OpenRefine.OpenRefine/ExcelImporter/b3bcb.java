diff --git a/main/src/com/google/refine/importers/ExcelImporter.java b/main/src/com/google/refine/importers/ExcelImporter.java
index 0a22193..9d1bf9c 100644
--- a/main/src/com/google/refine/importers/ExcelImporter.java
+++ b/main/src/com/google/refine/importers/ExcelImporter.java
@@ -174,7 +174,7 @@
                     org.apache.poi.ss.usermodel.Row row = sheet.getRow(nextRow++);
                     if (row != null) {
                         short lastCell = row.getLastCellNum();
-                        for (short cellIndex = 0; cellIndex <= lastCell; cellIndex++) {
+                        for (short cellIndex = 0; cellIndex < lastCell; cellIndex++) {
                             Cell cell = null;
                             
                             org.apache.poi.ss.usermodel.Cell sourceCell = row.getCell(cellIndex);
@@ -219,6 +219,13 @@
             
             if (HSSFDateUtil.isCellDateFormatted(cell)) {
                 value = HSSFDateUtil.getJavaDate(d);
+                // TODO: If we had a time datatype, we could use something like the following
+                // to distinguish times from dates (although Excel doesn't really make the distinction)
+                // Another alternative would be to look for values < 0.60
+//                String format = cell.getCellStyle().getDataFormatString();
+//                if (!format.contains("d") && !format.contains("m") && !format.contains("y") ) {
+//                    // It's just a time
+//                }
             } else {
                 value = d;
             }
