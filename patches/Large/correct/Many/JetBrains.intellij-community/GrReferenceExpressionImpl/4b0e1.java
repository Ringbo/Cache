diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/GrReferenceExpressionImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/GrReferenceExpressionImpl.java
index bd4affb..23fce6c 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/GrReferenceExpressionImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/GrReferenceExpressionImpl.java
@@ -104,7 +104,7 @@
     PsiReference[] references = new PsiReference[otherReferences.length + 1];
 
     references[0] = this;
-    System.arraycopy(otherReferences, 0, references, 0, otherReferences.length);
+    System.arraycopy(otherReferences, 0, references, 1, otherReferences.length);
 
     return new PsiMultiReference(references, this);
   }
