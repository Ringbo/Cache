diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java
index b03b5b1..bcab365 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java
@@ -177,7 +177,7 @@
     public static MethodNode addDelegateInstanceMethod(ClassNode classNode, Expression delegate, MethodNode declaredMethod, boolean thisAsFirstArgument) {
         Parameter[] parameterTypes = thisAsFirstArgument ? getRemainingParameterTypes(declaredMethod.getParameters()) : declaredMethod.getParameters();
         String methodName = declaredMethod.getName();
-        if (classNode.hasMethod(methodName, parameterTypes)) {
+        if (classNode.hasDeclaredMethod(methodName, parameterTypes)) {
             return null;
         }
         String propertyName = GrailsClassUtils.getPropertyForGetter(methodName);
