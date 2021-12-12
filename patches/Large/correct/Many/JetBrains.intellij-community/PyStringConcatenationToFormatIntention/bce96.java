diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/PyStringConcatenationToFormatIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/PyStringConcatenationToFormatIntention.java
index e6e2e26..fe8b9d7 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/PyStringConcatenationToFormatIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/PyStringConcatenationToFormatIntention.java
@@ -67,7 +67,7 @@
         return false;
       }
     }
-    if (LanguageLevel.forElement(element).isPy3K())
+    if (LanguageLevel.forElement(element).isAtLeast(LanguageLevel.PYTHON27))
       setText(PyBundle.message("INTN.replace.plus.with.str.format"));
     else
       setText(PyBundle.message("INTN.replace.plus.with.format.operator"));
@@ -135,7 +135,7 @@
     PyElementGenerator elementGenerator = PyElementGenerator.getInstance(project);
 
     if (!parameters.isEmpty()) {
-      if (languageLevel.isPy3K()) {
+      if (LanguageLevel.forElement(element).isAtLeast(LanguageLevel.PYTHON27)) {
         stringLiteral.append(".format(").append(StringUtil.join(parameters, ",")).append(")");
 
       }
