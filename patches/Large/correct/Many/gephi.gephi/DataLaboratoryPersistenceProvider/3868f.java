diff --git a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java
index 76ea222..cfdc922 100644
--- a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java
+++ b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java
@@ -112,7 +112,7 @@
                         nodeColumns.addAvailableColumn(column);
                     }
                 } else if (EDGE_COLUMN.equalsIgnoreCase(name)) {
-                    String id = reader.getAttributeValue(null, "id");
+                    Integer id = Integer.parseInt(reader.getAttributeValue(null, "id"));
                     AttributeColumn column = edgesTable.getColumn(id);
                     if (column != null) {
                         edgeColumns.addAvailableColumn(column);
