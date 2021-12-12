diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrClosureParameterImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrClosureParameterImpl.java
index 5bc8e81..61692c6 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrClosureParameterImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrClosureParameterImpl.java
@@ -48,7 +48,7 @@
 
   @Nullable
   private static PsiType getParameterType(@NotNull PsiParameter parameter) {
-    return parameter instanceof GrParameter ? ((GrParameter)parameter).getTypeGroovy() : parameter.getType();
+    return parameter instanceof GrParameter ? ((GrParameter)parameter).getDeclaredType() : parameter.getType();
   }
 
   @Nullable
