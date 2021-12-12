diff --git a/src/main/java/org/springframework/data/elasticsearch/repository/support/MappingElasticsearchEntityInformation.java b/src/main/java/org/springframework/data/elasticsearch/repository/support/MappingElasticsearchEntityInformation.java
index 0f612a9..17b1b3e 100644
--- a/src/main/java/org/springframework/data/elasticsearch/repository/support/MappingElasticsearchEntityInformation.java
+++ b/src/main/java/org/springframework/data/elasticsearch/repository/support/MappingElasticsearchEntityInformation.java
@@ -90,7 +90,7 @@
 
     @Override
     public Long getVersion(T entity) {
-        ElasticsearchPersistentProperty versionProperty = entityMetadata.getIdProperty();
+        ElasticsearchPersistentProperty versionProperty = entityMetadata.getVersionProperty();
         try {
             if(versionProperty != null){
                 return (Long) BeanWrapper.create(entity, null).getProperty(versionProperty);
