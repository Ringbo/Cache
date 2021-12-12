diff --git a/litepal/src/main/java/org/litepal/crud/SaveHandler.java b/litepal/src/main/java/org/litepal/crud/SaveHandler.java
index 87f05b7..c172fcd 100644
--- a/litepal/src/main/java/org/litepal/crud/SaveHandler.java
+++ b/litepal/src/main/java/org/litepal/crud/SaveHandler.java
@@ -498,7 +498,7 @@
 	 *            The current action is update or not.
 	 */
 	private void insertIntermediateJoinTableValue(DataSupport baseObj, boolean isUpdate) {
-		Map<String, Set<Long>> associatedIdsM2M = baseObj.getAssociatedModelsMapForJoinTable();
+		Map<String, List<Long>> associatedIdsM2M = baseObj.getAssociatedModelsMapForJoinTable();
 		ContentValues values = new ContentValues();
 		for (String associatedTableName : associatedIdsM2M.keySet()) {
 			String joinTableName = getIntermediateTableName(baseObj, associatedTableName);
@@ -506,7 +506,7 @@
 				mDatabase.delete(joinTableName, getWhereForJoinTableToDelete(baseObj),
 						new String[] { String.valueOf(baseObj.getBaseObjId()) });
 			}
-			Set<Long> associatedIdsM2MSet = associatedIdsM2M.get(associatedTableName);
+			List<Long> associatedIdsM2MSet = associatedIdsM2M.get(associatedTableName);
 			for (long associatedId : associatedIdsM2MSet) {
 				values.clear();
 				values.put(getForeignKeyColumnName(baseObj.getTableName()), baseObj.getBaseObjId());
