diff --git a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/config/AbstractMongoConfiguration.java b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/config/AbstractMongoConfiguration.java
index 0a4f7fe..25583dc 100644
--- a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/config/AbstractMongoConfiguration.java
+++ b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/config/AbstractMongoConfiguration.java
@@ -86,12 +86,12 @@
 	@Bean
 	public SimpleMongoDbFactory mongoDbFactory() throws Exception {
 
-		UserCredentials creadentials = getUserCredentials();
+		UserCredentials credentials = getUserCredentials();
 
-		if (creadentials == null) {
+		if (credentials == null) {
 			return new SimpleMongoDbFactory(mongo(), getDatabaseName());
 		} else {
-			return new SimpleMongoDbFactory(mongo(), getDatabaseName(), creadentials);
+			return new SimpleMongoDbFactory(mongo(), getDatabaseName(), credentials);
 		}
 	}
 
