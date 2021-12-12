diff --git a/grails-plugin-testing/src/main/groovy/org/grails/compiler/injection/test/TestMixinTransformation.java b/grails-plugin-testing/src/main/groovy/org/grails/compiler/injection/test/TestMixinTransformation.java
index 4ce7837..c985b6c 100644
--- a/grails-plugin-testing/src/main/groovy/org/grails/compiler/injection/test/TestMixinTransformation.java
+++ b/grails-plugin-testing/src/main/groovy/org/grails/compiler/injection/test/TestMixinTransformation.java
@@ -217,7 +217,7 @@
         
         boolean implementsTestRuntimeAwareMixin = GrailsASTUtils.findInterface(mixinClassNode, ClassHelper.make(TestRuntimeAwareMixin.class)) != null;
         
-        FieldNode mixinFieldNode = null;
+        FieldNode mixinFieldNode;
         if(!implementsTestRuntimeAwareMixin) { 
             mixinFieldNode = addLegacyMixinFieldIfNonExistent(classNode, mixinClassNode, fieldName);
         } else {
@@ -395,7 +395,7 @@
     }
 
     static protected boolean hasDeclaredMethod(ClassNode classNode, MethodNode mixinMethod) {
-        return classNode.hasDeclaredMethod(mixinMethod.getName(), mixinMethod.getParameters());
+        return classNode.hasMethod(mixinMethod.getName(), mixinMethod.getParameters());
     }
 
     static protected boolean hasAnnotation(MethodNode mixinMethod, Class<?> beforeClass) {
