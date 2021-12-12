diff --git a/platform/lang-impl/src/com/intellij/codeInsight/navigation/DocPreviewUtil.java b/platform/lang-impl/src/com/intellij/codeInsight/navigation/DocPreviewUtil.java
index 41af172..cac454d 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/navigation/DocPreviewUtil.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/navigation/DocPreviewUtil.java
@@ -180,7 +180,7 @@
                               @NotNull String replaceTo,
                               @NotNull List<TextRange> readOnlyChanges)
   {
-    for (int i = text.indexOf(replaceFrom); i >= 0 && i < text.length() - 1; i = text.indexOf(replaceFrom, i + 1)) {
+    for (int i = text.indexOf(replaceFrom); i >= 0 && i <= text.length() - 1; i = text.indexOf(replaceFrom, i + 1)) {
       int end = i + replaceFrom.length();
       if (intersects(readOnlyChanges, i, end)) {
         continue;
