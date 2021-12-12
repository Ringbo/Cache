diff --git a/java/java-impl/src/com/intellij/refactoring/extractclass/ExtractClassProcessor.java b/java/java-impl/src/com/intellij/refactoring/extractclass/ExtractClassProcessor.java
index a26256b..cba1f9c 100644
--- a/java/java-impl/src/com/intellij/refactoring/extractclass/ExtractClassProcessor.java
+++ b/java/java-impl/src/com/intellij/refactoring/extractclass/ExtractClassProcessor.java
@@ -127,7 +127,7 @@
       ContainerUtil.addAll(typeParams, sourceClass.getTypeParameters());
     }
     else {
-      final Set<PsiTypeParameter> typeParamSet = new HashSet<>();
+      final Set<PsiTypeParameter> typeParamSet = new LinkedHashSet<>();
       final TypeParametersVisitor visitor = new TypeParametersVisitor(typeParamSet);
       for (PsiField field : fields) {
         field.accept(visitor);
