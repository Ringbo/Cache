diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/CombineToParentFolderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/CombineToParentFolderTest.java
index 78171ea..6c0811a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/CombineToParentFolderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/CombineToParentFolderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
