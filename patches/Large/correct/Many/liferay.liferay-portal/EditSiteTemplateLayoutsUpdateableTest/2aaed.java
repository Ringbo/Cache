diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/EditSiteTemplateLayoutsUpdateableTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/EditSiteTemplateLayoutsUpdateableTest.java
index ff6a226..eba0735 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/EditSiteTemplateLayoutsUpdateableTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationpage/addorganizationpage/EditSiteTemplateLayoutsUpdateableTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
