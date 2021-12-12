diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java
index 8ec05c8..6263bfe 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/GrailsASTUtils.java
@@ -242,7 +242,7 @@
 
     public static ClassNode nonGeneric(ClassNode type) {
         if (type.isUsingGenerics()) {
-            final ClassNode nonGen = ClassHelper.make(type.getName());
+            final ClassNode nonGen = ClassHelper.makeWithoutCaching(type.getName());
             nonGen.setRedirect(type);
             nonGen.setGenericsTypes(null);
             nonGen.setUsingGenerics(false);
