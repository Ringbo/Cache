diff --git a/lang-impl/src/com/intellij/codeInsight/completion/CompletionData.java b/lang-impl/src/com/intellij/codeInsight/completion/CompletionData.java
index dd396c6..a5c7f0d 100644
--- a/lang-impl/src/com/intellij/codeInsight/completion/CompletionData.java
+++ b/lang-impl/src/com/intellij/codeInsight/completion/CompletionData.java
@@ -189,7 +189,7 @@
     });
     if (prefix != null) return prefix;
 
-    if (insertedElement instanceof PsiPlainText) {
+    if (insertedElement instanceof PsiPlainText || insertedElement instanceof PsiComment) {
       return CompletionUtil.findJavaIdentifierPrefix(insertedElement, offsetInFile);
     }
 
