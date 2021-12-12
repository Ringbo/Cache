diff --git a/src/com/activeandroid/Model.java b/src/com/activeandroid/Model.java
index 07ad46c..e705680 100644
--- a/src/com/activeandroid/Model.java
+++ b/src/com/activeandroid/Model.java
@@ -164,7 +164,7 @@
 		new Delete().from(type).where("Id=?", id).execute();
 	}
 
-	public static <T extends Model> T load(Class<? extends Model> type, long id) {
+	public static <T extends Model> T load(Class<T> type, long id) {
 		return new Select().from(type).where("Id=?", id).executeSingle();
 	}
 
@@ -269,7 +269,7 @@
 	// PROTECTED METHODS
 	//////////////////////////////////////////////////////////////////////////////////////
 
-	protected final <E extends Model> List<E> getMany(Class<? extends Model> type, String foreignKey) {
+	protected final <T extends Model> List<T> getMany(Class<T> type, String foreignKey) {
 		return new Select().from(type).where(Cache.getTableName(type) + "." + foreignKey + "=?", getId()).execute();
 	}
 
