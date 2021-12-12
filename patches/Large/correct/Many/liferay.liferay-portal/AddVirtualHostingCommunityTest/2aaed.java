diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingCommunityTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingCommunityTest.java
index 1b79d68..2a98f81 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingCommunityTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingCommunityTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
