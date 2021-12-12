diff --git a/platform/script-debugger/debugger-ui/src/org/jetbrains/debugger/frame/ExecutionStackImpl.java b/platform/script-debugger/debugger-ui/src/org/jetbrains/debugger/frame/ExecutionStackImpl.java
index 6cf1070..afd0771 100644
--- a/platform/script-debugger/debugger-ui/src/org/jetbrains/debugger/frame/ExecutionStackImpl.java
+++ b/platform/script-debugger/debugger-ui/src/org/jetbrains/debugger/frame/ExecutionStackImpl.java
@@ -28,7 +28,7 @@
   @Nullable
   public CallFrameView getTopFrame() {
     CallFrame topCallFrame = suspendContext.getTopFrame();
-    if (topCallFrameView.getCallFrame() != topCallFrame) {
+    if (topCallFrameView == null || topCallFrameView.getCallFrame() != topCallFrame) {
       topCallFrameView = topCallFrame == null ? null : new CallFrameView(topCallFrame, debugProcess, topFrameScript);
     }
     return topCallFrameView;
