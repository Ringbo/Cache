diff --git a/src/main/java/com/tightdb/lib/AbstractTable.java b/src/main/java/com/tightdb/lib/AbstractTable.java
index d383ea1..0326d22 100644
--- a/src/main/java/com/tightdb/lib/AbstractTable.java
+++ b/src/main/java/com/tightdb/lib/AbstractTable.java
@@ -43,7 +43,7 @@
 	}
 
 	private void defineTableStructure() {
-		if (table != null) {
+		if (table != null && table.getTableSpec().getColumnCount() <= 0) {
 			final TableSpec spec = new TableSpec();
 			specifyStructure(spec);
 			table.updateFromSpec(spec);
