diff --git a/src/com/activeandroid/Model.java b/src/com/activeandroid/Model.java
index 6237fea..735f8fb 100644
--- a/src/com/activeandroid/Model.java
+++ b/src/com/activeandroid/Model.java
@@ -244,7 +244,7 @@
 	//////////////////////////////////////////////////////////////////////////////////////
 
 	protected final <E extends Model> List<E> getMany(Class<? extends Model> type, String foreignKey) {
-		return new Select().from(type).where(mTableInfo.getTableName() + "." + foreignKey + "=?", getId()).execute();
+		return new Select().from(type).where(Cache.getTableName(type) + "." + foreignKey + "=?", getId()).execute();
 	}
 
 	//////////////////////////////////////////////////////////////////////////////////////
