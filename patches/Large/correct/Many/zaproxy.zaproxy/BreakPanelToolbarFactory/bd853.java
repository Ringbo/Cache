diff --git a/src/org/zaproxy/zap/extension/brk/BreakPanelToolbarFactory.java b/src/org/zaproxy/zap/extension/brk/BreakPanelToolbarFactory.java
index 43f644d..9e308f6 100644
--- a/src/org/zaproxy/zap/extension/brk/BreakPanelToolbarFactory.java
+++ b/src/org/zaproxy/zap/extension/brk/BreakPanelToolbarFactory.java
@@ -256,7 +256,7 @@
 		isBreakResponse = brk;
 		resetRequestSerialization(false);
 
-		updateBreakRequestBtn();
+		updateBreakResponseBtn();
 	}
 
 	private void toggleBreakRequest() {
