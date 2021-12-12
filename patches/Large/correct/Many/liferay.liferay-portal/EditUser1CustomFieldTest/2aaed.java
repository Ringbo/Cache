diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/EditUser1CustomFieldTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/EditUser1CustomFieldTest.java
index ec1a6f9..ec5f6d3 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/EditUser1CustomFieldTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/EditUser1CustomFieldTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
