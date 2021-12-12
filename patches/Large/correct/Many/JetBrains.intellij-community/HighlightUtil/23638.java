diff --git a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java
index ab7ceea..06b1940 100644
--- a/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java
+++ b/java/java-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightUtil.java
@@ -481,7 +481,7 @@
     int start = variable.getTypeElement().getTextRange().getStartOffset();
     int end = variable.getTextRange().getEndOffset();
     HighlightInfo highlightInfo = checkAssignability(lType, rType, initializer, new TextRange(start, end));
-    if (highlightInfo != null) {
+    if (highlightInfo != null && !(rType instanceof PsiMethodReferenceType)) {
       registerChangeVariableTypeFixes(variable, rType, highlightInfo);
     }
     return highlightInfo;
