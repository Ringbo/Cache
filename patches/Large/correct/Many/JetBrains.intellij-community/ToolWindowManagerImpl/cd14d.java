diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
index 9f35bdd..b1c4abd 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowManagerImpl.java
@@ -575,7 +575,7 @@
 
   @Override
   public void removeToolWindowManagerListener(@NotNull ToolWindowManagerListener l) {
-    myDispatcher.addListener(l);
+    myDispatcher.removeListener(l);
   }
 
   /**
