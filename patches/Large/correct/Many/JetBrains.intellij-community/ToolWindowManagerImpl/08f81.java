diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
index e54b760..b02a7d6 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
@@ -152,7 +152,8 @@
         PropertyChangeListener focusListener = it -> myUpdateHeadersAlarm.request();
         KeyboardFocusManager keyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
         keyboardFocusManager.addPropertyChangeListener("focusOwner", focusListener);
-        Disposer.register(ToolWindowManagerImpl.this, () -> keyboardFocusManager.removePropertyChangeListener(focusListener));
+        Disposer.register(ToolWindowManagerImpl.this,
+                          () -> keyboardFocusManager.removePropertyChangeListener("focusOwner", focusListener));
       }
 
       @Override
