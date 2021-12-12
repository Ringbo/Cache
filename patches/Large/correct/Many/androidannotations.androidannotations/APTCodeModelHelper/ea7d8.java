diff --git a/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java b/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java
index 8dd2f4a..49a8454 100644
--- a/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java
+++ b/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java
@@ -328,7 +328,7 @@
 	public void copyAnnotation(IJAnnotatable annotatable, AnnotationMirror annotationMirror) {
 		Map<? extends ExecutableElement, ? extends AnnotationValue> parameters = annotationMirror.getElementValues();
 
-		if (!hasAnnotation(annotatable, annotationMirror)) {
+		if (!hasAnnotation(annotatable, annotationMirror) || annotatable instanceof JAnnotationArrayMember) {
 			AbstractJClass annotation = typeMirrorToJClass(annotationMirror.getAnnotationType());
 			JAnnotationUse annotate = annotatable.annotate(annotation);
 
