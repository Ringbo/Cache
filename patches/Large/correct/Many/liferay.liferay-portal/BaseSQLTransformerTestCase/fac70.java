diff --git a/portal-impl/test/unit/com/liferay/portal/dao/orm/common/BaseSQLTransformerTestCase.java b/portal-impl/test/unit/com/liferay/portal/dao/orm/common/BaseSQLTransformerTestCase.java
index 403a014..a6d6959 100644
--- a/portal-impl/test/unit/com/liferay/portal/dao/orm/common/BaseSQLTransformerTestCase.java
+++ b/portal-impl/test/unit/com/liferay/portal/dao/orm/common/BaseSQLTransformerTestCase.java
@@ -28,7 +28,7 @@
 	public void setUp() {
 		DBFactoryUtil.setDBFactory(new DBFactoryImpl());
 
-		DBFactoryUtil.setDB(getDBType());
+		DBFactoryUtil.setDB(getDBType(), null);
 	}
 
 	protected abstract String getDBType();
