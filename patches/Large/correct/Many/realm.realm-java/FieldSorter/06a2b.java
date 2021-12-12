diff --git a/src/main/java/com/tightdb/generator/FieldSorter.java b/src/main/java/com/tightdb/generator/FieldSorter.java
index e5b7473..7010ce5 100644
--- a/src/main/java/com/tightdb/generator/FieldSorter.java
+++ b/src/main/java/com/tightdb/generator/FieldSorter.java
@@ -27,7 +27,7 @@
 	public void sortFields(List<VariableElement> fields, TypeElement model, File sourcePath) {
 		String specSource = specReader.getSpecFields(model, sourcePath);
 		if (specSource == null) {
-			logger.error("Field sorting failed, couldn't find table spec: " + model.getSimpleName());
+			logger.warn("Field sorting failed, couldn't find table spec: " + model.getSimpleName());
 			return;
 		}
 
@@ -60,7 +60,7 @@
 			});
 			logger.info("Successfully sorted fields: " + fields);
 		} else {
-			logger.error("Field sorting failed!");
+			logger.warn("Field sorting failed!");
 		}
 	}
 
