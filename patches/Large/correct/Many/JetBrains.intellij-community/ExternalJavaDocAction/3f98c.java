diff --git a/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java b/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java
index 094a23f..154c432 100644
--- a/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java
+++ b/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java
@@ -36,7 +36,7 @@
     PsiFile context = LangDataKeys.PSI_FILE.getData(dataContext);
     Editor editor = PlatformDataKeys.EDITOR.getData(dataContext);
     PsiElement originalElement = getOriginalElement(context, editor);
-    DocumentationManager.storeOriginalElement(project, element, originalElement);
+    DocumentationManager.storeOriginalElement(project, originalElement, element);
     final ExtensibleDocumentationProvider provider = (ExtensibleDocumentationProvider)DocumentationManager.getProviderFromElement(element);
     assert provider != null;
     provider.openExternalDocumentation(element, originalElement);
@@ -53,7 +53,7 @@
     Editor editor = PlatformDataKeys.EDITOR.getData(dataContext);
     final PsiElement element = LangDataKeys.PSI_ELEMENT.getData(dataContext);
     final PsiElement originalElement = getOriginalElement(LangDataKeys.PSI_FILE.getData(dataContext), editor);
-    DocumentationManager.storeOriginalElement(PlatformDataKeys.PROJECT.getData(dataContext), element, originalElement);
+    DocumentationManager.storeOriginalElement(PlatformDataKeys.PROJECT.getData(dataContext), originalElement, element);
     final DocumentationProvider provider = DocumentationManager.getProviderFromElement(element);
     boolean enabled = provider instanceof ExtensibleDocumentationProvider && ((ExtensibleDocumentationProvider)provider).isExternalDocumentationEnabled(element, originalElement);
     if (editor != null) {
