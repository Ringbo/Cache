diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java
index fbb1785..fe86a06 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/XDebuggerUtilImpl.java
@@ -327,7 +327,7 @@
       SmartPointerManager.getInstance(element.getProject()).createSmartPsiElementPointer(element);
 
     return new XSourcePosition() {
-      private XSourcePosition myDelegate;
+      private volatile XSourcePosition myDelegate;
 
       private XSourcePosition getDelegate() {
         if (myDelegate == null) {
