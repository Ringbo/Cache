diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
index 9bbb996..66e4a8b 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/GroovyAnnotator.java
@@ -336,7 +336,7 @@
   }
 
   private static void checkConstructors(AnnotationHolder holder, GrTypeDefinition typeDefinition) {
-    if (typeDefinition.isEnum() || typeDefinition.isInterface() || typeDefinition.isAnonymous()) return;
+    if (typeDefinition.isEnum() || typeDefinition.isInterface() || typeDefinition.isAnonymous() || typeDefinition instanceof GrTypeParameter) return;
     final PsiClass superClass = typeDefinition.getSuperClass();
     if (superClass == null) return;
 
