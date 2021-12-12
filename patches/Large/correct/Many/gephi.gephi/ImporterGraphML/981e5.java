diff --git a/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGraphML.java b/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGraphML.java
index 8161260..b391a04 100644
--- a/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGraphML.java
+++ b/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGraphML.java
@@ -481,7 +481,7 @@
             }
 
             //Data attribute value
-            AttributeColumn column = container.getAttributeModel().getNodeTable().getColumn(fore);
+            AttributeColumn column = container.getAttributeModel().getEdgeTable().getColumn(fore);
             if (column != null) {
                 try {
                     Object val = column.getType().parse(value);
