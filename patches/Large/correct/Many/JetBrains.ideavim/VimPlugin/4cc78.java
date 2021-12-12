diff --git a/src/com/maddyhome/idea/vim/VimPlugin.java b/src/com/maddyhome/idea/vim/VimPlugin.java
index 1d14855..a9bfe0f 100644
--- a/src/com/maddyhome/idea/vim/VimPlugin.java
+++ b/src/com/maddyhome/idea/vim/VimPlugin.java
@@ -141,7 +141,7 @@
     });
 
     final TypedAction typedAction = EditorActionManager.getInstance().getTypedAction();
-    EventFacade.getInstance().setupTypedActionHandler(new VimTypedActionHandler(typedAction.getHandler()));
+    EventFacade.getInstance().setupTypedActionHandler(new VimTypedActionHandler(typedAction.getRawHandler()));
 
     // Register vim actions in command mode
     RegisterActions.registerActions();
