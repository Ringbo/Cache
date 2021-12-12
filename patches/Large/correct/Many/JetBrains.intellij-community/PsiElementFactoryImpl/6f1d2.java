diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/PsiElementFactoryImpl.java b/java/java-psi-impl/src/com/intellij/psi/impl/PsiElementFactoryImpl.java
index d0f86c7..3bbccf1 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/PsiElementFactoryImpl.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/PsiElementFactoryImpl.java
@@ -157,7 +157,7 @@
     final PsiClassType.ClassResolveResult resolveResult = type.resolveGenerics();
     final PsiClass refClass = resolveResult.getElement();
     assert refClass != null : type;
-    return new LightClassReference(myManager, type.getPresentableText(), refClass, resolveResult.getSubstitutor());
+    return new LightClassReference(myManager, type.getInternalCanonicalText(), refClass, resolveResult.getSubstitutor());
   }
 
   @NotNull
