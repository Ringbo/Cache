diff --git a/src/org/parosproxy/paros/extension/ExtensionLoader.java b/src/org/parosproxy/paros/extension/ExtensionLoader.java
index 9cdc894..363cf1f 100644
--- a/src/org/parosproxy/paros/extension/ExtensionLoader.java
+++ b/src/org/parosproxy/paros/extension/ExtensionLoader.java
@@ -39,6 +39,7 @@
 // ZAP: 2013/01/25 Refactored hookMenu(). Resolved some Checkstyle issues.
 // ZAP: 2013/01/29 Catch Errors thrown by out of date extensions as well as Exceptions
 // ZAP: 2013/07/23 Issue 738: Options to hide tabs
+// ZAP: 2013/11/16 Issue 807: Error while loading ZAP when Quick Start Tab is closed
 
 package org.parosproxy.paros.extension;
 
@@ -481,7 +482,7 @@
         		// ZAP: added icon
                 if (panel.getTabIndex() >= 0) {
                 	tab.addTab(panel.getName() + " ", panel.getIcon(), panel, panel.isHideable(), panel.getTabIndex());
-                    if (panel.getTabIndex() == 0) {
+                    if (panel.getTabIndex() == 0  && tab.indexOfComponent(panel) != -1) {
                     	// Its now the first one, give it focus
                     	tab.setSelectedComponent(panel);	
                     }
