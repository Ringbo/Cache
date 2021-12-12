diff --git a/AndroidAnnotations/androidannotations-rest-spring/rest-spring/src/main/java/org/androidannotations/rest/spring/helper/RestSpringValidatorHelper.java b/AndroidAnnotations/androidannotations-rest-spring/rest-spring/src/main/java/org/androidannotations/rest/spring/helper/RestSpringValidatorHelper.java
index f5823d9..0208abb 100644
--- a/AndroidAnnotations/androidannotations-rest-spring/rest-spring/src/main/java/org/androidannotations/rest/spring/helper/RestSpringValidatorHelper.java
+++ b/AndroidAnnotations/androidannotations-rest-spring/rest-spring/src/main/java/org/androidannotations/rest/spring/helper/RestSpringValidatorHelper.java
@@ -569,10 +569,10 @@
 
 		boolean formConverterFound = false;
 
-		TypeElement formConverter = annotationHelper.getElementUtils().getTypeElement(FORM_HTTP_MESSAGE_CONVERTER);
+		TypeMirror formConverter = annotationHelper.getElementUtils().getTypeElement(FORM_HTTP_MESSAGE_CONVERTER).asType();
 
 		for (DeclaredType converter : converters) {
-			if (formConverter != null && annotationHelper.isSubtype(formConverter.asType(), converter)) {
+			if (formConverter != null && annotationHelper.isSubtype(converter, formConverter)) {
 				formConverterFound = true;
 				break;
 			}
