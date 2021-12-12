diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java
index e251fa6..07d6811 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/LocalInspectionsPass.java
@@ -535,7 +535,9 @@
       TextRange hostRange = ((DocumentWindow)documentRange).injectedToHost(editable);
       HighlightInfo patched = HighlightInfo.createHighlightInfo(info.type, element, hostRange.getStartOffset(),
                                                                  hostRange.getEndOffset(), info.description, info.toolTip);
-      if (patched != null) {
+      if (patched != null &&
+          (patched.startOffset != patched.endOffset ||
+           info.startOffset == info.endOffset)) {
         registerQuickFixes(tool, descriptor, patched, emptyActionRegistered);
         outInfos.add(patched);
       }
