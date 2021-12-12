diff --git a/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java b/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java
index 72d54fb..3a7fdd9 100644
--- a/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/upgrade/v6_2_0/UpgradeCustomizablePortletsTest.java
@@ -218,7 +218,7 @@
 
 		PortalPreferencesImpl portalPreferencesImpl =
 			(PortalPreferencesImpl)PortletPreferencesFactoryUtil.fromXML(
-				0, ownerId, ownerType, preferences);
+				ownerId, ownerType, preferences);
 
 		return new PortalPreferencesWrapper(portalPreferencesImpl);
 	}
