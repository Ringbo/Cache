diff --git a/platform/lang-impl/src/com/intellij/psi/formatter/DocumentBasedFormattingModel.java b/platform/lang-impl/src/com/intellij/psi/formatter/DocumentBasedFormattingModel.java
index 94910b2..4aa36a1 100644
--- a/platform/lang-impl/src/com/intellij/psi/formatter/DocumentBasedFormattingModel.java
+++ b/platform/lang-impl/src/com/intellij/psi/formatter/DocumentBasedFormattingModel.java
@@ -119,21 +119,9 @@
     return new TextRange(textRange.getStartOffset(), textRange.getStartOffset() + whiteSpace.length());
   }
 
-  /**
-   * Allows to check if following conditions are met:
-   * <ul>
-   *   <li>target document contains given pattern within the given range;</li>
-   *   <li>given white space string contains given pattern;</li>
-   * </ul>
-   *
-   * @param textRange       target range to use during checking given pattern at the target document
-   * @param whiteSpace      white space symbol to check at the given pattern
-   * @param pattern           pattern to check at the target document
-   * @return                      <code>true</code> if target conditions are met; <code>false</code> otherwise
-   */
   private boolean removesPattern(final TextRange textRange, final String whiteSpace, final String pattern) {
     return CharArrayUtil.indexOf(myDocument.getCharsSequence(), pattern, textRange.getStartOffset(), textRange.getEndOffset() + 1) >= 0 &&
-        CharArrayUtil.indexOf(whiteSpace, pattern, 0) >= 0;
+        CharArrayUtil.indexOf(whiteSpace, pattern, 0) < 0;
   }
 
   public TextRange shiftIndentInsideRange(TextRange range, int indent) {
