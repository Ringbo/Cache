diff --git a/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java b/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java
index cef7d09..11fa25e 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java
@@ -127,7 +127,7 @@
 				column, StringUtil.merge(portletIds).concat(StringPool.COMMA));
 		}
 
-		return typeSettingsProperties.toString();
+		return typeSettingsProperties.toSortedString();
 	}
 
 	protected String[][] getRenamePortletIdsArray() {
