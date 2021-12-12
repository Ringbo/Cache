diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditSubfolderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditSubfolderTest.java
index 5b49590..f2842fe8 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditSubfolderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditSubfolderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
