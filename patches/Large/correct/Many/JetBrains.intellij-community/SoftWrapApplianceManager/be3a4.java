diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/softwrap/mapping/SoftWrapApplianceManager.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/softwrap/mapping/SoftWrapApplianceManager.java
index 7535a1d..6e78715 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/softwrap/mapping/SoftWrapApplianceManager.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/softwrap/mapping/SoftWrapApplianceManager.java
@@ -419,7 +419,7 @@
       myLineWrapPositionStrategy = LanguageLineWrapPositionStrategy.INSTANCE.forEditor(myEditor);
     }
     int softWrapOffset = myLineWrapPositionStrategy.calculateWrapPosition(
-      document.getCharsSequence(), minOffset, maxOffset, preferredOffset, minOffset != preferredOffset
+      document.getCharsSequence(), minOffset, maxOffset, preferredOffset, true
     );
     if (softWrapOffset >= lineData.endLineOffset) {
       return null;
@@ -625,7 +625,7 @@
       int endLine = document.getLineNumber(endRange.getEndOffset());
       int endOffset = document.getLineEndOffset(endLine);
       int textLength = document.getTextLength();
-      if (textLength > 0 && endOffset >= textLength) {
+      if (textLength > 0 && endOffset > textLength) {
         endOffset = textLength - 1;
       }
       endRange = new TextRange(document.getLineStartOffset(startLine), endOffset);
