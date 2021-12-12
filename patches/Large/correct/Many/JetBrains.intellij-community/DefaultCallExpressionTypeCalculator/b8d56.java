diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/DefaultCallExpressionTypeCalculator.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/DefaultCallExpressionTypeCalculator.java
index 125c9be..c1ba1f8 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/DefaultCallExpressionTypeCalculator.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/path/DefaultCallExpressionTypeCalculator.java
@@ -212,11 +212,11 @@
         return arrayType.getComponentType().accept(this);
       }
 
-      @NotNull
+      @Nullable
       @Override
       public Boolean visitWildcardType(PsiWildcardType wildcardType) {
         final PsiType bound = wildcardType.getBound();
-        return bound != null && bound.accept(this);
+        return bound == null ? null : bound.accept(this);
       }
     }) == Boolean.TRUE;
   }
