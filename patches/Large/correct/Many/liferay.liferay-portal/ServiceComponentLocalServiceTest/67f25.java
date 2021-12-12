diff --git a/portal-impl/test/integration/com/liferay/portal/service/ServiceComponentLocalServiceTest.java b/portal-impl/test/integration/com/liferay/portal/service/ServiceComponentLocalServiceTest.java
index 5747382..15268ac 100644
--- a/portal-impl/test/integration/com/liferay/portal/service/ServiceComponentLocalServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/service/ServiceComponentLocalServiceTest.java
@@ -240,13 +240,15 @@
 		}
 
 		@Override
-		public void upgrade(DBProcessContext dbProcessContext) {
+		public void upgrade(DBProcessContext dbProcessContext)
+			throws UpgradeException {
+
 			try {
 				_db.runSQL(
 					"create table " + _TEST_TABLE + " (name VARCHAR(20))");
 			}
 			catch (Exception e) {
-				new UpgradeException(e);
+				throw new UpgradeException(e);
 			}
 		}
 
