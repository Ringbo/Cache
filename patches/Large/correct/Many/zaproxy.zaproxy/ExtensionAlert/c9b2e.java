diff --git a/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java b/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
index ef97736..57f01cb 100644
--- a/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
+++ b/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java
@@ -150,7 +150,7 @@
             writeAlertToDB(alert, ref);
 
             try {
-                if (getView() == null) {
+                if (getView() == null || EventQueue.isDispatchThread()) {
                     SessionStructure.addPath(Model.getSingleton().getSession(), ref, alert.getMessage());
                 } else {
                     final HistoryReference fRef = ref;
