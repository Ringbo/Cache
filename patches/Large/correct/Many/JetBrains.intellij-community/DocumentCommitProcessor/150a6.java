diff --git a/platform/core-impl/src/com/intellij/psi/impl/DocumentCommitProcessor.java b/platform/core-impl/src/com/intellij/psi/impl/DocumentCommitProcessor.java
index fc52526..4ed0915 100644
--- a/platform/core-impl/src/com/intellij/psi/impl/DocumentCommitProcessor.java
+++ b/platform/core-impl/src/com/intellij/psi/impl/DocumentCommitProcessor.java
@@ -114,7 +114,7 @@
     final String oldPsiText = myTreeElementBeingReparsedSoItWontBeCollected.getText();
     int commonPrefixLength = StringUtil.commonPrefixLength(oldPsiText, chars);
     final TextRange changedPsiRange;
-    if (commonPrefixLength == chars.length()) {
+    if (commonPrefixLength == chars.length() && chars.length() == oldPsiText.length()) {
       changedPsiRange = getChangedPsiRange(file, 0, 0, chars.length());
     } else {
       int commonSuffixLength = StringUtil.commonSuffixLength(oldPsiText, chars);
