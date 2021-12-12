diff --git a/platform/platform-impl/src/com/intellij/codeInsight/hint/HintManagerImpl.java b/platform/platform-impl/src/com/intellij/codeInsight/hint/HintManagerImpl.java
index 39cdb4d..8f58f29 100644
--- a/platform/platform-impl/src/com/intellij/codeInsight/hint/HintManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/codeInsight/hint/HintManagerImpl.java
@@ -758,7 +758,7 @@
     if (showByBalloon) {
       hintInfo.setBorderColor(Color.gray);
       hintInfo.setFont(hintInfo.getTextFont().deriveFont(Font.PLAIN));
-      hintInfo.setCalloutShift(-(int)(editor.getLineHeight() * 0.1));
+      hintInfo.setCalloutShift((int)(editor.getLineHeight() * 0.1));
     }
     hintInfo.setPreferredPosition(Balloon.Position.above);
     if (constraint == UNDER || constraint == RIGHT_UNDER) {
