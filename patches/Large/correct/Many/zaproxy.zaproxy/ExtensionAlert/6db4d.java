diff --git a/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java b/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
index 3c9573c..1f0d912 100644
--- a/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
+++ b/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
@@ -169,11 +169,11 @@
 
     private void addAlertToTree(final Alert alert, final HistoryReference ref, final HttpMessage msg) {
     	
-        if (!View.isInitialised() || Constant.isLowMemoryOptionSet()) {
+        if (Constant.isLowMemoryOptionSet()) {
         	return;
         }
     	
-        if (EventQueue.isDispatchThread()) {
+        if (!View.isInitialised() || EventQueue.isDispatchThread()) {
             addAlertToTreeEventHandler(alert, ref, msg);
 
         } else {
