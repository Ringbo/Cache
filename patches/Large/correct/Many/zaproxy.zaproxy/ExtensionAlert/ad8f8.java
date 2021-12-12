diff --git a/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java b/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
index da9e90b..7e063b2 100644
--- a/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
+++ b/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
@@ -168,7 +168,7 @@
     }
 
     private void addAlertToTree(final Alert alert, final HistoryReference ref, final HttpMessage msg) {
-        if (EventQueue.isDispatchThread()) {
+        if (!View.isInitialised() || EventQueue.isDispatchThread()) {
             addAlertToTreeEventHandler(alert, ref, msg);
 
         } else {
