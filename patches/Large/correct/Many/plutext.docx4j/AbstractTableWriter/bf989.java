diff --git a/src/main/java/org/docx4j/convert/out/common/writer/AbstractTableWriter.java b/src/main/java/org/docx4j/convert/out/common/writer/AbstractTableWriter.java
index 8181b28..7a8d46b 100644
--- a/src/main/java/org/docx4j/convert/out/common/writer/AbstractTableWriter.java
+++ b/src/main/java/org/docx4j/convert/out/common/writer/AbstractTableWriter.java
@@ -265,7 +265,7 @@
 						
 						cellNode = createNode(doc, row, (inHeader ? NODE_TABLE_HEADER_CELL : NODE_TABLE_BODY_CELL));
 						row.appendChild(cellNode);
-						applyTableCellCustomAttributes(context, table, transformState, (AbstractTableWriterModelCell) cell, cellNode, inHeader, true);
+						applyTableCellCustomAttributes(context, table, transformState, cell, cellNode, inHeader, true);
 					}
 				}
 				else {
@@ -275,7 +275,7 @@
 					//Apply cell style
 					createCellProperties(cellProperties, cell.getTcPr());
 					processAttributes(context, cellProperties, cellNode);
-					applyTableCellCustomAttributes(context, table, transformState, (AbstractTableWriterModelCell) cell, cellNode, inHeader, false);
+					applyTableCellCustomAttributes(context, table, transformState, cell, cellNode, inHeader, false);
 					//remove properties defined on cell level
 					resetProperties(cellProperties, cellPropertiesRowSize);
 					
@@ -571,7 +571,8 @@
   	protected void applyTableRowCustomAttributes(AbstractWmlConversionContext context, AbstractTableWriterModel table, TransformState transformState, Element row, int rowIndex, boolean isHeader) {  		
   	}
   	
-  	protected void applyTableCellCustomAttributes(AbstractWmlConversionContext context, AbstractTableWriterModel table, TransformState transformState, AbstractTableWriterModelCell tableCell, Element cellNode, boolean isHeader, boolean isDummyCell) {
+  	protected void applyTableCellCustomAttributes(AbstractWmlConversionContext context, AbstractTableWriterModel table, 
+  			TransformState transformState, TableModelCell tableCell, Element cellNode, boolean isHeader, boolean isDummyCell) {
   	}
 
 }
