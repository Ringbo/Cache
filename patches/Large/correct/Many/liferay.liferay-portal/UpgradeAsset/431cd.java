diff --git a/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeAsset.java b/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeAsset.java
index 75b1a51..62a2d66 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeAsset.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/v6_1_0/UpgradeAsset.java
@@ -51,7 +51,7 @@
 		upgradeIGImageClassName();
 	}
 
-	protected long getJournalStructureId(long structureId) throws Exception {
+	protected long getJournalStructureId(String structureId) throws Exception {
 		Connection con = null;
 		PreparedStatement ps = null;
 		ResultSet rs = null;
@@ -64,7 +64,7 @@
 			ps = con.prepareStatement(
 				"select * from JournalStructure where structureId = ?");
 
-			ps.setLong(1, structureId);
+			ps.setString(1, structureId);
 
 			rs = ps.executeQuery();
 
@@ -94,7 +94,7 @@
 
 			while (rs.next()) {
 				long resourcePrimKey = rs.getLong("resourcePrimKey");
-				long structureId = rs.getLong("structureId");
+				String structureId = rs.getString("structureId");
 
 				long journalStructureId = getJournalStructureId(
 					structureId);
