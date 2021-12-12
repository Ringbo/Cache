diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserFirstNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserFirstNameTest.java
index de71be9..f51baf1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserFirstNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserFirstNameTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
