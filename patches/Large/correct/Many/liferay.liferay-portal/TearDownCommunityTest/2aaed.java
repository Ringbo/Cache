diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/TearDownCommunityTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/TearDownCommunityTest.java
index 7342b3f5..acc0e00 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/TearDownCommunityTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/TearDownCommunityTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
