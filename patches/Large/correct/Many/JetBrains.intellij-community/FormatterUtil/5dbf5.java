diff --git a/platform/lang-impl/src/com/intellij/psi/formatter/FormatterUtil.java b/platform/lang-impl/src/com/intellij/psi/formatter/FormatterUtil.java
index 185ef9a..4b6e96f 100644
--- a/platform/lang-impl/src/com/intellij/psi/formatter/FormatterUtil.java
+++ b/platform/lang-impl/src/com/intellij/psi/formatter/FormatterUtil.java
@@ -378,7 +378,7 @@
       if (treePrev.getElementType() == TokenType.WHITE_SPACE) {
         return treePrev;
       }
-      else if (treePrev.getTextLength() == 0) {
+      else if (treePrev.getTextLength() == 0 && !treePrev.getElementType().isLeftBound()) {
         return getWsCandidate(treePrev);
       }
       else {
