diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
index 44e7348..712b1b5 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
@@ -346,7 +346,7 @@
     checkTypeDefinition(myHolder, typeDefinition);
     checkTypeDefinitionModifiers(myHolder, typeDefinition);
 
-    checkDuplicateMethod(typeDefinition.getGroovyMethods(), myHolder);
+    checkDuplicateMethod(typeDefinition.getMethods(), myHolder);
     checkImplementedMethodsOfClass(myHolder, typeDefinition);
     checkConstructors(myHolder, typeDefinition);
     highligtClassReference(myHolder, typeDefinition.getNameIdentifierGroovy());
