diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/MoveEntryTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/MoveEntryTest.java
index 13efdb6..3eb7942 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/MoveEntryTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/MoveEntryTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
@@ -181,7 +181,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
