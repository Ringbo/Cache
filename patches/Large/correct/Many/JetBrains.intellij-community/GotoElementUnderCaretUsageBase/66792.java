diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/actions/GotoElementUnderCaretUsageBase.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/actions/GotoElementUnderCaretUsageBase.java
index f7a6caf..7b74a9f 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/actions/GotoElementUnderCaretUsageBase.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/actions/GotoElementUnderCaretUsageBase.java
@@ -46,7 +46,7 @@
     final Ref<Integer> next = new Ref<>();
     DaemonCodeAnalyzerEx.processHighlights(editor.getDocument(), project, null, startOffset, endOffset, info -> {
       if (info.type == HighlightInfoType.ELEMENT_UNDER_CARET_READ || info.type == HighlightInfoType.ELEMENT_UNDER_CARET_WRITE) {
-        if (ordering.compare(info.startOffset, caretOffset) > 0) {
+        if (ordering.compare(info.startOffset, caretOffset) > 0 && ordering.compare(info.endOffset, caretOffset) > 0) {
           if (next.isNull() || ordering.compare(next.get(), info.startOffset) > 0) {
             next.set(info.startOffset);
           }
