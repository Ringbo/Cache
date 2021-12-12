diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserScreenNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserScreenNameTest.java
index a78f514..ce27337 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserScreenNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/advancedsearchuser/AdvancedSearchUserScreenNameTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
