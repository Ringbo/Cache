diff --git a/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java b/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java
index 3abca5e..d2880ca 100644
--- a/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java
+++ b/modules/util/source-formatter/src/com/liferay/source/formatter/JavaSourceProcessor.java
@@ -105,7 +105,7 @@
 			String propertyNameAndValue = parameterProperty.substring(x + 1, z);
 
 			if (Validator.isNotNull(previousPropertyName) &&
-				(previousPropertyName.compareTo(propertyName) > 0)) {
+				(previousPropertyName.compareToIgnoreCase(propertyName) > 0)) {
 
 				content = StringUtil.replaceFirst(
 					content, previousPropertyNameAndValue,
@@ -173,7 +173,8 @@
 				annotationParameters.substring(y + 1, x));
 
 			if (Validator.isNull(previousParameterName) ||
-				(previousParameterName.compareTo(parameterName) <= 0)) {
+				(previousParameterName.compareToIgnoreCase(parameterName) <=
+					0)) {
 
 				previousParameterName = parameterName;
 
@@ -1163,7 +1164,7 @@
 				}
 
 				if (Validator.isNotNull(previousAnnotation) &&
-					(previousAnnotation.compareTo(annotation) > 0)) {
+					(previousAnnotation.compareToIgnoreCase(annotation) > 0)) {
 
 					content = StringUtil.replaceFirst(
 						content, previousAnnotation, annotation);
