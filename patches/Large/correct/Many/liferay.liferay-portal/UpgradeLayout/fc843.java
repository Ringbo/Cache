diff --git a/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeLayout.java b/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeLayout.java
index afd2a53..61e8477 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeLayout.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeLayout.java
@@ -171,7 +171,7 @@
 				typeSettingsProperties, javaScript1, javaScript2, javaScript3);
 		}
 
-		updateTypeSettings(plid, typeSettingsProperties.toSortedString());
+		updateTypeSettings(plid, typeSettingsProperties.toString());
 	}
 
 	protected UnicodeProperties updateMetaField(
