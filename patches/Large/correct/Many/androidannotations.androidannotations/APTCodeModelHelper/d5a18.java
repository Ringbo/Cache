diff --git a/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java b/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java
index 84bb5c1..77d72ef 100644
--- a/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java
+++ b/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/helper/APTCodeModelHelper.java
@@ -309,7 +309,7 @@
 	private void addParamToMethod(JMethod method, VariableElement parameter, int mod, Map<String, TypeMirror> actualTypes, boolean varParam) {
 		String parameterName = parameter.getSimpleName().toString();
 		AbstractJClass parameterClass = typeMirrorToJClass(parameter.asType(), actualTypes);
-		JVar param = varParam ? method.varParam(parameterClass.elementType(), parameterName) : method.param(mod, parameterClass, parameterName);
+		JVar param = varParam ? method.varParam(mod, parameterClass.elementType(), parameterName) : method.param(mod, parameterClass, parameterName);
 		copyNonAAAnnotations(param, parameter.getAnnotationMirrors());
 	}
 
