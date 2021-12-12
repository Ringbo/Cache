diff --git a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
index b7896df..44828bf 100644
--- a/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
+++ b/platform/platform-impl/src/com/intellij/ui/popup/AbstractPopup.java
@@ -1273,7 +1273,7 @@
         if (size.width > delta) {
           size.width = delta;
           // we shrank horizontally - need to increase height to fit the horizontal scrollbar
-          JScrollPane scrollPane = JBScrollPane.findScrollPane(myContent);
+          JScrollPane scrollPane = ScrollUtil.findScrollPane(myContent);
           if (scrollPane != null && scrollPane.getHorizontalScrollBarPolicy() != ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) {
             JScrollBar scrollBar = scrollPane.getHorizontalScrollBar();
             if (scrollBar != null) {
