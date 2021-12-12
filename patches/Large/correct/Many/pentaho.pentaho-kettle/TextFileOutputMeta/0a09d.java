diff --git a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java
index e4bb167..a59afa2 100644
--- a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java
+++ b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java
@@ -788,7 +788,7 @@
 			{
 				retval.append("      <field>"+Const.CR);
 				retval.append("        "+XMLHandler.addTagValue("name",      field.getName()));
-				retval.append("        "+XMLHandler.addTagValue("type",      field.getType()));
+				retval.append("        "+XMLHandler.addTagValue("type",      field.getTypeDesc()));
 				retval.append("        "+XMLHandler.addTagValue("format",    field.getFormat()));
 				retval.append("        "+XMLHandler.addTagValue("currency",  field.getCurrencySymbol()));
 				retval.append("        "+XMLHandler.addTagValue("decimal",   field.getDecimalSymbol()));
