diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/AbstractGrailsArtefactTransformer.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/AbstractGrailsArtefactTransformer.java
index 016489b..f089369 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/AbstractGrailsArtefactTransformer.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/compiler/injection/AbstractGrailsArtefactTransformer.java
@@ -303,7 +303,7 @@
     }
 
     protected MethodNode populateDefaultApiLookupMethod(ClassNode implementationNode, String apiInstanceProperty, String methodName, BlockStatement methodBody) {
-        methodBody.addStatement(new ReturnStatement(new VariableExpression(apiInstanceProperty)));
+        methodBody.addStatement(new ReturnStatement(new VariableExpression(apiInstanceProperty, implementationNode)));
         return new MethodNode(methodName, Modifier.PRIVATE, implementationNode,ZERO_PARAMETERS,null,methodBody);
     }
 
