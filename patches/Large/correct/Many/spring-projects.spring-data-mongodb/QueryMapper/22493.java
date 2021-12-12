diff --git a/spring-data-mongodb/src/main/java/org/springframework/data/document/mongodb/query/QueryMapper.java b/spring-data-mongodb/src/main/java/org/springframework/data/document/mongodb/query/QueryMapper.java
index 22341c5..d8b0aa3 100644
--- a/spring-data-mongodb/src/main/java/org/springframework/data/document/mongodb/query/QueryMapper.java
+++ b/spring-data-mongodb/src/main/java/org/springframework/data/document/mongodb/query/QueryMapper.java
@@ -46,7 +46,7 @@
 
 	public DBObject getMappedObject() {
 		String idKey = null;
-		if (null != entity) {
+		if (null != entity && null != entity.getIdProperty()) {
 			idKey = entity.getIdProperty().getName();
 		} else if (query.containsField("id")) {
 			idKey = "id";
