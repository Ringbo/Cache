diff --git a/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerUtilsEx.java b/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerUtilsEx.java
index 89cd2bd..c7e682f 100644
--- a/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerUtilsEx.java
+++ b/java/debugger/impl/src/com/intellij/debugger/impl/DebuggerUtilsEx.java
@@ -671,7 +671,7 @@
     @NotNull
     @Override
     public Navigatable createNavigatable(@NotNull Project project) {
-      return XSourcePositionImpl.createOpenFileDescriptor(project, this);
+      return XSourcePositionImpl.doCreateOpenFileDescriptor(project, this);
     }
   }
 
