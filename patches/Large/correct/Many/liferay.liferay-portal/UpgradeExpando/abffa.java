diff --git a/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeExpando.java b/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeExpando.java
index 4a1cd45..d497b33 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeExpando.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeExpando.java
@@ -110,7 +110,7 @@
 				typeSettingsProperties.remove("indexable");
 
 				updateColumnTypeSettings(
-					columnId, typeSettingsProperties.toString());
+					columnId, typeSettingsProperties.toSortedString());
 			}
 		}
 		finally {
