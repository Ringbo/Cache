diff --git a/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java b/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java
index 11fa25e..cef7d09 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/util/UpgradePortletId.java
@@ -127,7 +127,7 @@
 				column, StringUtil.merge(portletIds).concat(StringPool.COMMA));
 		}
 
-		return typeSettingsProperties.toSortedString();
+		return typeSettingsProperties.toString();
 	}
 
 	protected String[][] getRenamePortletIdsArray() {
