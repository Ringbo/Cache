diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceWebIDTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceWebIDTest.java
index fedd7b7..57d662a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceWebIDTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceWebIDTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
