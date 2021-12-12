diff --git a/src/org/parosproxy/paros/extension/history/ExtensionHistory.java b/src/org/parosproxy/paros/extension/history/ExtensionHistory.java
index 9be00c3..36afe3d 100644
--- a/src/org/parosproxy/paros/extension/history/ExtensionHistory.java
+++ b/src/org/parosproxy/paros/extension/history/ExtensionHistory.java
@@ -53,6 +53,8 @@
 // ZAP: 2014/03/23 Issue 999: History loaded in wrong order
 // ZAP: 2014/04/10 Remove cached history reference when a history reference is removed
 // ZAP: 2014/04/10 Issue 1042: Having significant issues opening a previous session
+// ZAP: 2014/05/20 Issue 1206: "History" tab is not cleared when a new session is created 
+// through the API with ZAP in GUI mode
 
 package org.parosproxy.paros.extension.history;
 
@@ -627,7 +629,7 @@
 				EventQueue.invokeAndWait(new Runnable() {
 					@Override
 					public void run() {
-						sessionChanged(session);
+						sessionAboutToChange(session);
 					}
 				});
 			} catch (Exception e) {
