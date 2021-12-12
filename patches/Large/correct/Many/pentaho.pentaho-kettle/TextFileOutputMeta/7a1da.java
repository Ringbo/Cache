diff --git a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java
index 1f30d48..d2e77fd 100644
--- a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java
+++ b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputMeta.java
@@ -806,7 +806,7 @@
 			    TextFileField field = outputFields[i];
 			    
 				rep.saveStepAttribute(id_transformation, id_step, i, "field_name",      field.getName());
-				rep.saveStepAttribute(id_transformation, id_step, i, "field_type",      field.getType());
+				rep.saveStepAttribute(id_transformation, id_step, i, "field_type",      field.getTypeDesc());
 				rep.saveStepAttribute(id_transformation, id_step, i, "field_format",    field.getFormat());
 				rep.saveStepAttribute(id_transformation, id_step, i, "field_currency",  field.getCurrencySymbol());
 				rep.saveStepAttribute(id_transformation, id_step, i, "field_decimal",   field.getDecimalSymbol());
