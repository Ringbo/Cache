diff --git a/src/org/pentaho/di/trans/steps/autodoc/AutoDocMeta.java b/src/org/pentaho/di/trans/steps/autodoc/AutoDocMeta.java
index b1877b7..28499f1 100644
--- a/src/org/pentaho/di/trans/steps/autodoc/AutoDocMeta.java
+++ b/src/org/pentaho/di/trans/steps/autodoc/AutoDocMeta.java
@@ -188,7 +188,7 @@
 		try
 		{
 			rep.saveStepAttribute(id_transformation, id_step, "filename_field", filenameField);
-      rep.saveStepAttribute(id_transformation, id_step, "file_type_field", filenameField);
+      rep.saveStepAttribute(id_transformation, id_step, "file_type_field", fileTypeField);
 			rep.saveStepAttribute(id_transformation, id_step, "target_file", targetFilename);
 			rep.saveStepAttribute(id_transformation, id_step, "output_type", outputType.name());
 			rep.saveStepAttribute(id_transformation, id_step, "include_name", includingName);
