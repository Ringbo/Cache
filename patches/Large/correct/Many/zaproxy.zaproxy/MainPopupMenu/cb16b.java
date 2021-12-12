diff --git a/src/org/parosproxy/paros/view/MainPopupMenu.java b/src/org/parosproxy/paros/view/MainPopupMenu.java
index c9b0707..c8903ab 100644
--- a/src/org/parosproxy/paros/view/MainPopupMenu.java
+++ b/src/org/parosproxy/paros/view/MainPopupMenu.java
@@ -31,6 +31,7 @@
 // ZAP: 2012/10/08 Added check for PopupMenu safeness
 // ZAP: 2013/04/14 Issue 592: Do not show the main pop up menu if it doesn't have visible pop up menu items
 // ZAP: 2013/04/14 Issue 598: Replace/update "old" pop up menu items
+// ZAP: 2013/11/16 Issue 878: ExtensionPopupMenuItem#getMenuIndex() as no effect in MainPopupMenu
 
 package org.parosproxy.paros.view;
 
@@ -169,7 +170,7 @@
 	            		if (menuItem.precedeWithSeparator()) {
 	    	                this.addSeparator();
 	            		}
-						if (menuItem.getMenuIndex() > menuItem.getComponentCount()) {
+						if (menuItem.getMenuIndex() > this.getComponentCount()) {
 							this.add(menuItem);
 						} else {
 							this.add(menuItem, menuItem.getMenuIndex());
