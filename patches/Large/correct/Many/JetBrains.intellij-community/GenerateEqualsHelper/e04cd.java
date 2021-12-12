diff --git a/codeInsight/impl/com/intellij/codeInsight/generation/GenerateEqualsHelper.java b/codeInsight/impl/com/intellij/codeInsight/generation/GenerateEqualsHelper.java
index 4a88331..a667f18 100644
--- a/codeInsight/impl/com/intellij/codeInsight/generation/GenerateEqualsHelper.java
+++ b/codeInsight/impl/com/intellij/codeInsight/generation/GenerateEqualsHelper.java
@@ -427,7 +427,7 @@
 
   @SuppressWarnings("HardCodedStringLiteral")
   private static void adjustHashCodeToArrays(StringBuilder buffer, final PsiField field, final String name) {
-    if (field.getType() instanceof PsiArrayType && LanguageLevel.JDK_1_5.compareTo(field.getManager().getEffectiveLanguageLevel()) >= 0) {
+    if (field.getType() instanceof PsiArrayType && LanguageLevel.JDK_1_5.compareTo(field.getManager().getEffectiveLanguageLevel()) <= 0) {
       buffer.append("Arrays.hashCode(");
       buffer.append(name);
       buffer.append(")");
