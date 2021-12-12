diff --git a/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java b/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java
index 15423c7..223c3ae 100644
--- a/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java
@@ -129,7 +129,7 @@
 
 		portalPreferencesWrapper.store();
 
-		doUpgrade();
+		upgrade();
 
 		Assert.assertEquals(_newPortletIds.size(), 4);
 		Assert.assertFalse(PortletConstants.hasUserId(_newPortletIds.get(0)));
