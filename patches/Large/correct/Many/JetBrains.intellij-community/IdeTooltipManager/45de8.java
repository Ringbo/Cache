diff --git a/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java b/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java
index 13a0c85..c180d25 100644
--- a/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java
+++ b/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java
@@ -107,11 +107,11 @@
         maybeShowFor(c, me);
       }
     } else if (me.getID() == MouseEvent.MOUSE_EXITED) {
-      if (me.getComponent() == myCurrentComponent) {
+      if (me.getComponent() == myCurrentComponent || me.getComponent() == myQueuedComponent) {
         hideCurrent(me);
       }
     } else if (me.getID() == MouseEvent.MOUSE_MOVED) {
-      if (me.getComponent() == myCurrentComponent) {
+      if (me.getComponent() == myCurrentComponent || me.getComponent() == myQueuedComponent) {
         if (myCurrentTipUi != null && myCurrentTipUi.wasFadedIn()) {
           if (hideCurrent(me)) {
             maybeShowFor(c, me);
