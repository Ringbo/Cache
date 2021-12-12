diff --git a/postcss/src/org/intellij/plugins/postcss/descriptors/PostCssElementDescriptorProvider.java b/postcss/src/org/intellij/plugins/postcss/descriptors/PostCssElementDescriptorProvider.java
index afe64cc..0230880 100644
--- a/postcss/src/org/intellij/plugins/postcss/descriptors/PostCssElementDescriptorProvider.java
+++ b/postcss/src/org/intellij/plugins/postcss/descriptors/PostCssElementDescriptorProvider.java
@@ -36,7 +36,7 @@
       }
       PsiElement identifier = ((CssPseudoClass)context).getNameIdentifier();
       String selectorName = identifier != null ? identifier.getText() : null;
-      if (selectorName == null || selectorName.startsWith("--")) {
+      if (selectorName == null || !selectorName.startsWith("--")) {
         return Collections.emptyList();
       }
       Collection<PostCssCustomSelector> customSelectors = PostCssCustomSelectorIndex.getCustomSelectors(selectorName.substring(2), context);
