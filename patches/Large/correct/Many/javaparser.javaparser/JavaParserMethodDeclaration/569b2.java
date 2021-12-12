diff --git a/java-symbol-solver-core/src/main/java/me/tomassetti/symbolsolver/javaparsermodel/declarations/JavaParserMethodDeclaration.java b/java-symbol-solver-core/src/main/java/me/tomassetti/symbolsolver/javaparsermodel/declarations/JavaParserMethodDeclaration.java
index 336f743..4273bbf 100644
--- a/java-symbol-solver-core/src/main/java/me/tomassetti/symbolsolver/javaparsermodel/declarations/JavaParserMethodDeclaration.java
+++ b/java-symbol-solver-core/src/main/java/me/tomassetti/symbolsolver/javaparsermodel/declarations/JavaParserMethodDeclaration.java
@@ -126,7 +126,7 @@
             actualParamType = correspondingFormalType.get(0);
         }
         if (formalParamType.isReferenceType() && actualParamType.isReferenceType()) {
-            if (actualParamType.asReferenceTypeUsage().isRawType()) {
+            if (formalParamType.asReferenceTypeUsage().isRawType() || actualParamType.asReferenceTypeUsage().isRawType()) {
                 return;
             }
             List<TypeUsage> formalTypeParams = formalParamType.asReferenceTypeUsage().parameters();
