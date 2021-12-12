diff --git a/lang-impl/src/com/intellij/codeInsight/daemon/impl/UpdateHighlightersUtil.java b/lang-impl/src/com/intellij/codeInsight/daemon/impl/UpdateHighlightersUtil.java
index 489781e..29c5829 100644
--- a/lang-impl/src/com/intellij/codeInsight/daemon/impl/UpdateHighlightersUtil.java
+++ b/lang-impl/src/com/intellij/codeInsight/daemon/impl/UpdateHighlightersUtil.java
@@ -417,7 +417,7 @@
         if (!highlighter.isValid()) {
           toRemove = true;
         }
-        else if (start < highlighterEnd && highlighterStart < end) {
+        else if (start < highlighterEnd && highlighterStart <= end) {
           LOG.assertTrue(0 <= highlighterStart);
           LOG.assertTrue(highlighterStart < document.getTextLength());
           documentChangedInsideHighlighter = true;
