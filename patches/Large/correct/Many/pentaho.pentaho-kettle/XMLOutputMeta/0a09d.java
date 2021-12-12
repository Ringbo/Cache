diff --git a/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputMeta.java b/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputMeta.java
index aa8f915..007021d 100644
--- a/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputMeta.java
+++ b/src/be/ibridge/kettle/trans/step/xmloutput/XMLOutputMeta.java
@@ -520,7 +520,7 @@
 				retval.append("      <field>"+Const.CR);
 				retval.append("        "+XMLHandler.addTagValue("name",      field.getFieldName()));
                 retval.append("        "+XMLHandler.addTagValue("element",   field.getElementName()));
-				retval.append("        "+XMLHandler.addTagValue("type",      field.getType()));
+				retval.append("        "+XMLHandler.addTagValue("type",      field.getTypeDesc()));
 				retval.append("        "+XMLHandler.addTagValue("format",    field.getFormat()));
 				retval.append("        "+XMLHandler.addTagValue("currency",  field.getCurrencySymbol()));
 				retval.append("        "+XMLHandler.addTagValue("decimal",   field.getDecimalSymbol()));
