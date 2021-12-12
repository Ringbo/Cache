diff --git a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/query/AbstractMongoQuery.java b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/query/AbstractMongoQuery.java
index 5f10463..ef61aae 100644
--- a/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/query/AbstractMongoQuery.java
+++ b/spring-data-mongodb/src/main/java/org/springframework/data/mongodb/repository/query/AbstractMongoQuery.java
@@ -408,7 +408,7 @@
 				return operations.findAllAndRemove(query, metadata.getJavaType());
 			}
 
-			WriteResult writeResult = operations.remove(query, metadata.getCollectionName());
+			WriteResult writeResult = operations.remove(query, metadata.getJavaType(), metadata.getCollectionName());
 			return writeResult != null ? writeResult.getN() : 0L;
 		}
 	}
