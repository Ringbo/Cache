diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressbacktick/AddUserEmailAddressBackTickTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressbacktick/AddUserEmailAddressBackTickTest.java
index 36efd4b..43e404d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressbacktick/AddUserEmailAddressBackTickTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressbacktick/AddUserEmailAddressBackTickTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
