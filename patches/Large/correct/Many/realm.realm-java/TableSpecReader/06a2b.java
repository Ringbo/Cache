diff --git a/src/main/java/com/tightdb/generator/TableSpecReader.java b/src/main/java/com/tightdb/generator/TableSpecReader.java
index 93d7ee0..8d2196f 100644
--- a/src/main/java/com/tightdb/generator/TableSpecReader.java
+++ b/src/main/java/com/tightdb/generator/TableSpecReader.java
@@ -28,7 +28,7 @@
 
 		File sourceFile = findSourceFile(sourcePath, modelName);
 		if (sourceFile == null) {
-			logger.error("Table spec retrieval failed!");
+			logger.warn("Table spec retrieval failed!");
 			return null;
 		}
 
@@ -37,13 +37,13 @@
 		try {
 			source = FileUtils.readFileToString(sourceFile);
 		} catch (IOException e) {
-			logger.error("Table spec retrieval failed, couldn't read file: " + sourceFile);
+			logger.warn("Table spec retrieval failed, couldn't read file: " + sourceFile);
 			return null;
 		}
 
 		String spec = specMatcher.matchSpec(model.getSimpleName().toString(), source);
 		if (spec == null) {
-			logger.error("Table spec retrieval failed, couldn't find table spec: " + modelName);
+			logger.warn("Table spec retrieval failed, couldn't find table spec: " + modelName);
 		}
 		return spec;
 
