diff --git a/platform/lang-api/src/com/intellij/lang/folding/CustomFoldingSurroundDescriptor.java b/platform/lang-api/src/com/intellij/lang/folding/CustomFoldingSurroundDescriptor.java
index 0c51bd6..68870d7 100644
--- a/platform/lang-api/src/com/intellij/lang/folding/CustomFoldingSurroundDescriptor.java
+++ b/platform/lang-api/src/com/intellij/lang/folding/CustomFoldingSurroundDescriptor.java
@@ -158,7 +158,7 @@
 
     @Override
     public boolean isApplicable(@NotNull PsiElement[] elements) {
-      return elements.length > 0 && LanguageFolding.INSTANCE.forLanguage(elements[0].getLanguage()) instanceof CompositeFoldingBuilder;
+      return elements.length > 0 && LanguageFolding.INSTANCE.forLanguage(elements[0].getLanguage()) instanceof CustomFoldingBuilder;
     }
 
     @Override
