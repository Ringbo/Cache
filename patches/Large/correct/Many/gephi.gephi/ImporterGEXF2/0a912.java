diff --git a/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGEXF2.java b/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGEXF2.java
index 19e8781..a414025 100644
--- a/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGEXF2.java
+++ b/ImportPlugin/src/org/gephi/io/importer/plugin/file/ImporterGEXF2.java
@@ -748,9 +748,9 @@
 
             //Type
             AttributeType attributeType = AttributeType.STRING;
-            if (type.equalsIgnoreCase("boolean")) {
+            if (type.equalsIgnoreCase("boolean") || type.equalsIgnoreCase("bool")) {
                 attributeType = dynamic ? AttributeType.DYNAMIC_BOOLEAN : AttributeType.BOOLEAN;
-            } else if (type.equalsIgnoreCase("integer")) {
+            } else if (type.equalsIgnoreCase("integer") || type.equalsIgnoreCase("int")) {
                 attributeType = dynamic ? AttributeType.DYNAMIC_INT : AttributeType.INT;
             } else if (type.equalsIgnoreCase("long")) {
                 attributeType = dynamic ? AttributeType.DYNAMIC_LONG : AttributeType.LONG;
