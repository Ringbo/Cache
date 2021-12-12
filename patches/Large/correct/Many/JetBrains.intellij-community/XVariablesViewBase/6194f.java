diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/frame/XVariablesViewBase.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/frame/XVariablesViewBase.java
index e7199db..d4da1af 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/frame/XVariablesViewBase.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/frame/XVariablesViewBase.java
@@ -208,7 +208,7 @@
       if (!Registry.is("debugger.valueTooltipAutoShowOnSelection") ||
           myEditor.getCaretModel().getCaretCount() > 1 ||
           e.getNewRanges().length != 1 ||
-          !Objects.equals(e.getNewRange(), e.getOldRange())) {
+          Objects.equals(e.getNewRange(), e.getOldRange())) {
         return;
       }
 
