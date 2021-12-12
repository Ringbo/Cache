diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserMiddleNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserMiddleNameTest.java
index 03f28eb..9a05dcd 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserMiddleNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserMiddleNameTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
