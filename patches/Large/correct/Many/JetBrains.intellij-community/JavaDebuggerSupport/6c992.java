diff --git a/java/debugger/impl/src/com/intellij/debugger/ui/JavaDebuggerSupport.java b/java/debugger/impl/src/com/intellij/debugger/ui/JavaDebuggerSupport.java
index 27b922c..1c6887c 100644
--- a/java/debugger/impl/src/com/intellij/debugger/ui/JavaDebuggerSupport.java
+++ b/java/debugger/impl/src/com/intellij/debugger/ui/JavaDebuggerSupport.java
@@ -159,7 +159,7 @@
   @Override
   @NotNull
   public DebuggerActionHandler getEvaluateHandler() {
-    return myEvaluateActionHandler;
+    return DISABLED;
   }
 
   @Override
