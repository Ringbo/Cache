diff --git a/src/org/parosproxy/paros/view/MainMenuBar.java b/src/org/parosproxy/paros/view/MainMenuBar.java
index 4788073..55d2058 100644
--- a/src/org/parosproxy/paros/view/MainMenuBar.java
+++ b/src/org/parosproxy/paros/view/MainMenuBar.java
@@ -24,6 +24,7 @@
 // ZAP: 2013/01/23 Clean up of exception handling/logging.
 // ZAP: 2013/03/03 Issue 547: Deprecate unused classes and methods
 // ZAP: 2013/04/16 Issue 638: Persist and snapshot sessions instead of saving them
+// ZAP: 2013/09/11 Issue 786: Snapshot session menu item not working
 
 package org.parosproxy.paros.view;
 
@@ -296,7 +297,7 @@
 
 				@Override
 				public void actionPerformed(java.awt.event.ActionEvent e) {    
-					if (Model.getSingleton().getSession().isNewState()) {
+					if (! Model.getSingleton().getSession().isNewState()) {
 					    getMenuFileControl().saveSnapshot();
 					} else {
 						View.getSingleton().showWarningDialog(Constant.messages.getString("menu.file.snapshotSession.error"));
