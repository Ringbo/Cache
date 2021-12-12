diff --git a/platform/lang-impl/src/com/intellij/psi/codeStyle/arrangement/engine/ArrangementEntryWrapper.java b/platform/lang-impl/src/com/intellij/psi/codeStyle/arrangement/engine/ArrangementEntryWrapper.java
index 158c559..35d512a 100644
--- a/platform/lang-impl/src/com/intellij/psi/codeStyle/arrangement/engine/ArrangementEntryWrapper.java
+++ b/platform/lang-impl/src/com/intellij/psi/codeStyle/arrangement/engine/ArrangementEntryWrapper.java
@@ -124,7 +124,7 @@
     CharSequence text = document.getCharsSequence();
     for (int current = getStartOffset() - 1; current >= 0; current--) {
       current = CharArrayUtil.shiftBackward(text, current, " \t");
-      if (text.charAt(current) == '\n') lineFeeds++;
+      if (current > 0 && text.charAt(current) == '\n') lineFeeds++;
       else break;
     }
     if (lineFeeds > 0) myBlankLinesBefore = lineFeeds - 1;
