diff --git a/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/validation/OptionsItemValidator.java b/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/validation/OptionsItemValidator.java
index 88e7a95..808b9b9 100644
--- a/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/validation/OptionsItemValidator.java
+++ b/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/validation/OptionsItemValidator.java
@@ -54,7 +54,7 @@
 
 		IsValid valid = new IsValid();
 
-		validatorHelper.enclosingElementHasEnhancedViewSupportAnnotation(element, validatedElements, valid);
+		validatorHelper.enclosingElementHasEActivity(element, validatedElements, valid);
 
 		validatorHelper.idsExists(element, Res.ID, valid);
 
