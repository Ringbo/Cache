diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/database/support/SqlPagingQueryProviderFactoryBean.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/database/support/SqlPagingQueryProviderFactoryBean.java
index e24b828..a7b419f 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/database/support/SqlPagingQueryProviderFactoryBean.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/database/support/SqlPagingQueryProviderFactoryBean.java
@@ -139,7 +139,7 @@
 		}
 		catch (MetaDataAccessException e) {
 			throw new IllegalArgumentException(
-					"Could not inspect meta data for database type.  You have to supply it explicitly.");
+					"Could not inspect meta data for database type.  You have to supply it explicitly.", e);
 		}
 
 		AbstractSqlPagingQueryProvider provider = providers.get(type);
