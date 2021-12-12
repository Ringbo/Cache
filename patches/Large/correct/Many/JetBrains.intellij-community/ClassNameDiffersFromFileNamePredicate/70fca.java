diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/conversions/ClassNameDiffersFromFileNamePredicate.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/conversions/ClassNameDiffersFromFileNamePredicate.java
index 5dc9966..a108c93 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/conversions/ClassNameDiffersFromFileNamePredicate.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/intentions/conversions/ClassNameDiffersFromFileNamePredicate.java
@@ -42,7 +42,7 @@
     if (!(parent instanceof GrTypeDefinition)) return false;
     if (((GrTypeDefinition)parent).getNameIdentifierGroovy() != element) return false;
 
-    final String name = ((GrTypeDefinition)element).getName();
+    final String name = ((GrTypeDefinition)parent).getName();
     if (name == null || name.length() == 0) return false;
     final PsiFile file = element.getContainingFile();
     if (!(file instanceof GroovyFile)) return false;
