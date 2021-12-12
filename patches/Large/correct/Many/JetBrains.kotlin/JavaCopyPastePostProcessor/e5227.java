diff --git a/idea/src/org/jetbrains/jet/plugin/conversion/copy/JavaCopyPastePostProcessor.java b/idea/src/org/jetbrains/jet/plugin/conversion/copy/JavaCopyPastePostProcessor.java
index 989ef76..249cfa8 100644
--- a/idea/src/org/jetbrains/jet/plugin/conversion/copy/JavaCopyPastePostProcessor.java
+++ b/idea/src/org/jetbrains/jet/plugin/conversion/copy/JavaCopyPastePostProcessor.java
@@ -55,7 +55,7 @@
             StringBuilder result = new StringBuilder();
 
             for (PsiElement e : buffer) {
-                String converted = new Converter().elementToKotlin(e);
+                String converted = new Converter(file.getProject()).elementToKotlin(e);
                 if (!converted.isEmpty()) {
                     result.append(converted).append(eol);
                 }
