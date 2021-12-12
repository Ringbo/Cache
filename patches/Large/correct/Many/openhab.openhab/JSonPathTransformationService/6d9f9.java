diff --git a/bundles/core/org.openhab.core.transform/src/main/java/org/openhab/core/transform/internal/service/JSonPathTransformationService.java b/bundles/core/org.openhab.core.transform/src/main/java/org/openhab/core/transform/internal/service/JSonPathTransformationService.java
index 8f98cb6..70d0136 100644
--- a/bundles/core/org.openhab.core.transform/src/main/java/org/openhab/core/transform/internal/service/JSonPathTransformationService.java
+++ b/bundles/core/org.openhab.core.transform/src/main/java/org/openhab/core/transform/internal/service/JSonPathTransformationService.java
@@ -41,9 +41,9 @@
 		logger.debug("about to transform '{}' by the function '{}'", source, JSonPathExpression);
 
 		try {
-			String transformationResult = JsonPath.read(source, JSonPathExpression);
+			Object transformationResult = JsonPath.read(source, JSonPathExpression);
 			logger.debug("transformation resulted in '{}'", transformationResult);
-			return transformationResult;
+			return (transformationResult != null) ? transformationResult.toString() : null;
 		} catch(InvalidPathException e) {
 			throw new TransformationException("An error occured while transforming JSON expression.", e);
 		} 
