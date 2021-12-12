diff --git a/src/main/java/org/mybatis/spring/SqlSessionFactoryBean.java b/src/main/java/org/mybatis/spring/SqlSessionFactoryBean.java
index a5146d8..9dcce28 100644
--- a/src/main/java/org/mybatis/spring/SqlSessionFactoryBean.java
+++ b/src/main/java/org/mybatis/spring/SqlSessionFactoryBean.java
@@ -390,7 +390,7 @@
     Environment environment = new Environment(this.environment, this.transactionFactory, this.dataSource);
     configuration.setEnvironment(environment);
 
-    if (this.databaseIdProvider != null) {
+    if (configuration.getDatabaseId() == null && this.databaseIdProvider != null) {
       try {
         configuration.setDatabaseId(this.databaseIdProvider.getDatabaseId(this.dataSource));
       } catch (SQLException e) {
