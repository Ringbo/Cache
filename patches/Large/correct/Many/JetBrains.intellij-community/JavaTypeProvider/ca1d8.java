diff --git a/java/java-impl/src/com/intellij/codeInsight/hint/JavaTypeProvider.java b/java/java-impl/src/com/intellij/codeInsight/hint/JavaTypeProvider.java
index 2d84db2..66c4b46 100644
--- a/java/java-impl/src/com/intellij/codeInsight/hint/JavaTypeProvider.java
+++ b/java/java-impl/src/com/intellij/codeInsight/hint/JavaTypeProvider.java
@@ -30,7 +30,7 @@
   @Override
   public String getInformationHint(@NotNull PsiExpression element) {
     PsiType type = element.getType();
-    String text = type == null ? "<unknown>" : type.getCanonicalText();
+    String text = type == null ? "<unknown>" : type.getPresentableText();
     return StringUtil.escapeXml(text);
   }
 
