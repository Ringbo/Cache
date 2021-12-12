diff --git a/spring-datastore-mongodb/src/main/java/org/springframework/datastore/document/mongodb/MongoDbUtils.java b/spring-datastore-mongodb/src/main/java/org/springframework/datastore/document/mongodb/MongoDbUtils.java
index 5d32f70..1d47cec 100644
--- a/spring-datastore-mongodb/src/main/java/org/springframework/datastore/document/mongodb/MongoDbUtils.java
+++ b/spring-datastore-mongodb/src/main/java/org/springframework/datastore/document/mongodb/MongoDbUtils.java
@@ -115,7 +115,7 @@
 			else {
 				holderToUse.addDB(db);
 			}
-			TransactionSynchronizationManager.registerSynchronization(new MongoSynchronization(dbHolder, mongo));
+			TransactionSynchronizationManager.registerSynchronization(new MongoSynchronization(holderToUse, mongo));
 			holderToUse.setSynchronizedWithTransaction(true);
 			if (holderToUse != dbHolder) {
 				TransactionSynchronizationManager.bindResource(mongo, holderToUse);
