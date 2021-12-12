diff --git a/grails-plugin-validation/src/main/groovy/grails/validation/DefaultASTValidateableHelper.java b/grails-plugin-validation/src/main/groovy/grails/validation/DefaultASTValidateableHelper.java
index 34840e0..28a52b4 100644
--- a/grails-plugin-validation/src/main/groovy/grails/validation/DefaultASTValidateableHelper.java
+++ b/grails-plugin-validation/src/main/groovy/grails/validation/DefaultASTValidateableHelper.java
@@ -194,7 +194,7 @@
         final Map<String, MethodNode> declaredMethodsMap = classNode.getDeclaredMethodsMap();
         for (Entry<String, MethodNode> methodEntry : declaredMethodsMap.entrySet()) {
             final MethodNode value = methodEntry.getValue();
-            if (!value.isStatic() && value.isPublic() && classNode.equals(value.getDeclaringClass())) {
+            if (!value.isStatic() && value.isPublic() && classNode.equals(value.getDeclaringClass()) && value.getLineNumber() > 0) {
                 Parameter[] parameters = value.getParameters();
                 if (parameters != null && parameters.length == 1) {
                     final String methodName = value.getName();
