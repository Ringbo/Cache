diff --git a/portal-impl/src/com/liferay/portal/upgrade/v5_2_3/UpgradeWiki.java b/portal-impl/src/com/liferay/portal/upgrade/v5_2_3/UpgradeWiki.java
index 88914ed..669d152 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/v5_2_3/UpgradeWiki.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/v5_2_3/UpgradeWiki.java
@@ -55,7 +55,7 @@
 	}
 
 	protected void doUpgrade() throws Exception {
-		if (isSupportsAlterColumnName()) {
+		if (isSupportsAlterColumnType()) {
 			runSQL("alter_column_type WikiPage title VARCHAR(255) null");
 		}
 		else {
