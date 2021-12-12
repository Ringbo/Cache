diff --git a/json/src/com/jetbrains/jsonSchema/impl/JsonSchemaDocumentationProvider.java b/json/src/com/jetbrains/jsonSchema/impl/JsonSchemaDocumentationProvider.java
index 7c9c988..2f00abe 100644
--- a/json/src/com/jetbrains/jsonSchema/impl/JsonSchemaDocumentationProvider.java
+++ b/json/src/com/jetbrains/jsonSchema/impl/JsonSchemaDocumentationProvider.java
@@ -52,7 +52,7 @@
                                                 @Nullable PsiElement originalElement,
                                                 final boolean preferShort,
                                                 @Nullable String forcedPropName) {
-    if (element instanceof FakeDocElement) return null;
+    if (element instanceof FakePsiElement) return null;
     element = isWhitespaceOrComment(originalElement) ? element : ObjectUtils.coalesce(originalElement, element);
     final PsiFile containingFile = element.getContainingFile();
     if (containingFile == null) return null;
