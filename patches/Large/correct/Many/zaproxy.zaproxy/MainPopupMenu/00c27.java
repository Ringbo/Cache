diff --git a/src/org/parosproxy/paros/view/MainPopupMenu.java b/src/org/parosproxy/paros/view/MainPopupMenu.java
index c8903ab..69ee8e8 100644
--- a/src/org/parosproxy/paros/view/MainPopupMenu.java
+++ b/src/org/parosproxy/paros/view/MainPopupMenu.java
@@ -32,6 +32,7 @@
 // ZAP: 2013/04/14 Issue 592: Do not show the main pop up menu if it doesn't have visible pop up menu items
 // ZAP: 2013/04/14 Issue 598: Replace/update "old" pop up menu items
 // ZAP: 2013/11/16 Issue 878: ExtensionPopupMenuItem#getMenuIndex() as no effect in MainPopupMenu
+// ZAP: 2013/11/16 Issue 901: Pop up menu "succeed" separator is not added when using sub-menu in MainPopupMenu
 
 package org.parosproxy.paros.view;
 
@@ -163,7 +164,7 @@
 	            			superMenu.setEnabled(true);
 	            		}
 	            		if (menuItem.succeedWithSeparator()) {
-	            			superMenu.add(menuItem);
+	            			superMenu.addSeparator();
 	            		}
 	            		
 	            	} else {
