diff --git a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/support/SpringDataMongodbSerializer.java b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/support/SpringDataMongodbSerializer.java
index 49287b4..6fd82e8 100644
--- a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/support/SpringDataMongodbSerializer.java
+++ b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/support/SpringDataMongodbSerializer.java
@@ -236,13 +236,13 @@
 		return property;
 	}
 
-	Object toQuerydslMongoType(Object source) {
+	private Object toQuerydslMongoType(Object source) {
 
 		Object target = converter.convertToMongoType(source);
 
 		if (target instanceof List) {
 
-			BasicDBList newList = new BasicDBList();
+			List<Object> newList = new BasicDBList();
 
 			for (Object item : (List) target) {
 				if (item instanceof Document) {
