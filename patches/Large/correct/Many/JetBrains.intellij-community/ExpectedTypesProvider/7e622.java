diff --git a/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java b/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java
index 212918e..fb7460d 100644
--- a/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java
+++ b/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java
@@ -1162,7 +1162,8 @@
       if (className != null && className.startsWith("Log")) {
         if (parameterType instanceof PsiClassType) {
           PsiType typeArg = PsiUtil.substituteTypeParameter(parameterType, CommonClassNames.JAVA_LANG_CLASS, 0, true);
-          if (typeArg != null && TypeConversionUtil.erasure(typeArg).equalsToText(CommonClassNames.JAVA_LANG_OBJECT)) {
+          if (typeArg instanceof PsiWildcardType && !((PsiWildcardType)typeArg).isBounded() ||
+              typeArg != null && TypeConversionUtil.erasure(typeArg).equalsToText(CommonClassNames.JAVA_LANG_OBJECT)) {
             PsiClass placeClass = PsiTreeUtil.getContextOfType(argument, PsiClass.class);
             PsiClass classClass = ((PsiClassType)parameterType).resolve();
             if (placeClass != null && classClass != null) {
