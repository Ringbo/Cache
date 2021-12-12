diff --git a/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/tables/AbstractElementsDataTable.java b/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/tables/AbstractElementsDataTable.java
index 2ce6476..e52bce6 100644
--- a/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/tables/AbstractElementsDataTable.java
+++ b/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/tables/AbstractElementsDataTable.java
@@ -371,7 +371,7 @@
             int index = columnModel.getColumnIndexAtX(p.x);
             int realIndex = columnModel.getColumn(index).getModelIndex();
 
-            if (realIndex < columns.size()) {
+            if (realIndex < columns.size() && columns.get(realIndex).getColumn() != null) {
                 String id = columns.get(realIndex).getColumn().getId();
 
                 return NbBundle.getMessage(AbstractElementsDataTable.class, "AbstractElementsDataTable.column.tooltip", id);
