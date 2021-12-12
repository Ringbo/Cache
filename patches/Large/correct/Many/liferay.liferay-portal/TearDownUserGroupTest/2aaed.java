diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/usergroup/TearDownUserGroupTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/usergroup/TearDownUserGroupTest.java
index 783f3ee..392feb2 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/usergroup/TearDownUserGroupTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/usergroup/TearDownUserGroupTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
