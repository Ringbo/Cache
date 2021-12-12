diff --git a/litepal/src/main/java/org/litepal/crud/DataSupport.java b/litepal/src/main/java/org/litepal/crud/DataSupport.java
index 2eff040..cef4f4e 100644
--- a/litepal/src/main/java/org/litepal/crud/DataSupport.java
+++ b/litepal/src/main/java/org/litepal/crud/DataSupport.java
@@ -106,7 +106,7 @@
 	/**
 	 * A map contains all the associated models' id with M2M association.
 	 */
-	private Map<String, Set<Long>> associatedModelsMapForJoinTable;
+	private Map<String, List<Long>> associatedModelsMapForJoinTable;
 
 	/**
 	 * When updating a model and the associations breaks between current model
@@ -2142,10 +2142,10 @@
 	 *            The id of associated model.
 	 */
 	void addAssociatedModelForJoinTable(String associatedModelName, long associatedId) {
-		Set<Long> associatedIdsM2MSet = getAssociatedModelsMapForJoinTable().get(
+		List<Long> associatedIdsM2MSet = getAssociatedModelsMapForJoinTable().get(
 				associatedModelName);
 		if (associatedIdsM2MSet == null) {
-			associatedIdsM2MSet = new HashSet<Long>();
+			associatedIdsM2MSet = new ArrayList<Long>();
 			associatedIdsM2MSet.add(associatedId);
 			associatedModelsMapForJoinTable.put(associatedModelName, associatedIdsM2MSet);
 		} else {
@@ -2162,10 +2162,10 @@
 	 *            The name of associated model.
 	 */
 	void addEmptyModelForJoinTable(String associatedModelName) {
-		Set<Long> associatedIdsM2MSet = getAssociatedModelsMapForJoinTable().get(
+		List<Long> associatedIdsM2MSet = getAssociatedModelsMapForJoinTable().get(
 				associatedModelName);
 		if (associatedIdsM2MSet == null) {
-			associatedIdsM2MSet = new HashSet<Long>();
+			associatedIdsM2MSet = new ArrayList<Long>();
 			associatedModelsMapForJoinTable.put(associatedModelName, associatedIdsM2MSet);
 		}
 	}
@@ -2178,9 +2178,9 @@
 	 * @return An associated model's map to save values into intermediate join
 	 *         table
 	 */
-	Map<String, Set<Long>> getAssociatedModelsMapForJoinTable() {
+	Map<String, List<Long>> getAssociatedModelsMapForJoinTable() {
 		if (associatedModelsMapForJoinTable == null) {
-			associatedModelsMapForJoinTable = new HashMap<String, Set<Long>>();
+			associatedModelsMapForJoinTable = new HashMap<String, List<Long>>();
 		}
 		return associatedModelsMapForJoinTable;
 	}
