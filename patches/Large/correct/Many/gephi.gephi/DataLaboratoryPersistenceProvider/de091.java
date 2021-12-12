diff --git a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java
index 49fac15..76ea222 100644
--- a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java
+++ b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/persistence/DataLaboratoryPersistenceProvider.java
@@ -106,7 +106,7 @@
             if (eventType.equals(XMLEvent.START_ELEMENT)) {
                 String name = reader.getLocalName();
                 if (NODE_COLUMN.equalsIgnoreCase(name)) {
-                    String id = reader.getAttributeValue(null, "id");
+                    Integer id = Integer.parseInt(reader.getAttributeValue(null, "id"));
                     AttributeColumn column = nodesTable.getColumn(id);
                     if (column != null) {
                         nodeColumns.addAvailableColumn(column);
