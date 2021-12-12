diff --git a/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradePortletSettings.java b/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradePortletSettings.java
index db73447..d7ef3e3 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradePortletSettings.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradePortletSettings.java
@@ -117,7 +117,7 @@
 						portletId, plid, serviceName, groupId);
 				}
 
-				updatePortletPreferences(portletPreferencesRow);
+				addPortletPreferences(portletPreferencesRow);
 			}
 		}
 		catch (SQLException sqle) {
