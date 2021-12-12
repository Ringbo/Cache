diff --git a/src/com/maddyhome/idea/vim/VimPlugin.java b/src/com/maddyhome/idea/vim/VimPlugin.java
index 05502da..65f86dd 100644
--- a/src/com/maddyhome/idea/vim/VimPlugin.java
+++ b/src/com/maddyhome/idea/vim/VimPlugin.java
@@ -210,7 +210,7 @@
    */
   public void disposeComponent() {
     LOG.debug("disposeComponent");
-    setEnabled(false);
+    turnOffPlugin();
     EditorActionManager manager = EditorActionManager.getInstance();
     TypedAction action = manager.getTypedAction();
     action.setupHandler(vimHandler.getOriginalTypedHandler());
