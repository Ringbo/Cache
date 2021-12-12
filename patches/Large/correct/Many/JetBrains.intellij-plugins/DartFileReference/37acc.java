diff --git a/Dart/src/com/jetbrains/lang/dart/psi/impl/DartFileReference.java b/Dart/src/com/jetbrains/lang/dart/psi/impl/DartFileReference.java
index ed5fc83..dab2184 100644
--- a/Dart/src/com/jetbrains/lang/dart/psi/impl/DartFileReference.java
+++ b/Dart/src/com/jetbrains/lang/dart/psi/impl/DartFileReference.java
@@ -120,7 +120,7 @@
   private PsiElement updateUri(@NotNull final String newUri) {
     final String uriElementText = myUriElement.getText();
     final String startQuote = uriElementText.substring(0, myRange.getStartOffset());
-    final String endQuote = uriElementText.substring(myRange.getEndOffset(), uriElementText.length());
+    final String endQuote = uriElementText.substring(myRange.getEndOffset());
     final String text = "import " + startQuote + newUri + endQuote + ";";
     final PsiFile fileFromText = PsiFileFactory.getInstance(myUriElement.getProject()).createFileFromText(DartLanguage.INSTANCE, text);
 
