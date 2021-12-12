diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowImpl.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowImpl.java
index e197f64..f841970 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowImpl.java
@@ -114,7 +114,7 @@
 
   public final boolean isActive() {
     ApplicationManager.getApplication().assertIsDispatchThread();
-    return myToolWindowManager.isToolWindowActive(myId) && (myDecorator != null && myDecorator.isFocused());
+    return myToolWindowManager.isToolWindowActive(myId) || (myDecorator != null && myDecorator.isFocused());
   }
 
   public final void show(final Runnable runnable) {
