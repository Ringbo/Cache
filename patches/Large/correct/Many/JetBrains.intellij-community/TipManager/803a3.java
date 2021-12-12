diff --git a/source/com/intellij/debugger/ui/impl/TipManager.java b/source/com/intellij/debugger/ui/impl/TipManager.java
index c46ae76..db12d55 100644
--- a/source/com/intellij/debugger/ui/impl/TipManager.java
+++ b/source/com/intellij/debugger/ui/impl/TipManager.java
@@ -109,7 +109,7 @@
   public void hideTooltip() {
     if (myCurrentTooltip != null) {
       Window window = SwingUtilities.windowForComponent(myCurrentTooltip);
-      if(window != null) {
+      if(window != null && !(window instanceof JFrame)) {
         window.hide();
       }
       myCurrentTooltip = null;
