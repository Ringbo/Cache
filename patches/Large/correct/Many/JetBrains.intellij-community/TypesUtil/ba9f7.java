diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java
index 364e2a1..6363fe8 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/expressions/TypesUtil.java
@@ -411,7 +411,7 @@
   public static ConversionResult canCast(@NotNull PsiType targetType, @NotNull PsiType actualType, @NotNull PsiElement context) {
     final ConversionResult result = areTypesConvertible(targetType, actualType, context, ApplicableTo.EXPLICIT_CAST);
     if (result != null) return result;
-    return TypeConversionUtil.areTypesConvertible(targetType, actualType) ? ConversionResult.OK : ConversionResult.ERROR;
+    return TypeConversionUtil.areTypesConvertible(actualType, targetType) ? ConversionResult.OK : ConversionResult.ERROR;
   }
 
   @NotNull
