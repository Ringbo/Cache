diff --git a/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java b/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java
index de320e5..c32cafbb 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/TargetElementUtil.java
@@ -138,7 +138,7 @@
     else if (!isIdentifierPart(file, text, offset)) {
       correctedOffset--;
     }
-    if (correctedOffset >= 0) {
+    if (correctedOffset >= 0 && offset < document.getTextLength()) {
       char charAt = text.charAt(offset);
       if (isIdentifierPart(file, text, correctedOffset) ||
           charAt == '\'' || charAt == '"' || charAt == ')' || charAt == ']') {
