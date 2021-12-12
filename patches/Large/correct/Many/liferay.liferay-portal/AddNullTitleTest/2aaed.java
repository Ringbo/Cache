diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullTitleTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullTitleTest.java
index 70bca34..aed8655 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullTitleTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullTitleTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
