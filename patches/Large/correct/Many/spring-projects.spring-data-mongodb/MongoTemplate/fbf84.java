diff --git a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/core/MongoTemplate.java b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/core/MongoTemplate.java
index d2bbca1..7358986 100644
--- a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/core/MongoTemplate.java
+++ b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/core/MongoTemplate.java
@@ -159,6 +159,7 @@
  * @author Mark Paluch
  * @author Laszlo Csontos
  * @author Maninder Singh
+ * @author Borislav Rangelov
  */
 @SuppressWarnings("deprecation")
 public class MongoTemplate implements MongoOperations, ApplicationContextAware, IndexOperationsProvider {
@@ -1651,7 +1652,7 @@
 	 */
 	@Override
 	public <T> List<T> findAllAndRemove(Query query, String collectionName) {
-		return findAndRemove(query, null, collectionName);
+		return findAllAndRemove(query, null, collectionName);
 	}
 
 	/* (non-Javadoc)
