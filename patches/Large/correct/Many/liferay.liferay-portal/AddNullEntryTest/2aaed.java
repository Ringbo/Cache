diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullEntryTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullEntryTest.java
index 001ac2f..0672efa 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullEntryTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullEntryTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
