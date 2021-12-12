diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java
index 3a42a25..e980fe5 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSessionFactory.java
@@ -70,14 +70,14 @@
 
   public Session openSession(CommandContext commandContext) {
     DbSqlSession dbSqlSession = new DbSqlSession(this, commandContext.getEntityCache());
-    if (getDatabaseSchema() != null) {
+    if (getDatabaseSchema() != null && getDatabaseSchema().length() > 0) {
       try {
         dbSqlSession.getSqlSession().getConnection().setSchema(getDatabaseSchema());
       } catch (SQLException e) {
         throw new ActivitiException("Could not set database schema on connection", e);
       }
     }
-    if (getDatabaseCatalog() != null) {
+    if (getDatabaseCatalog() != null && getDatabaseCatalog().length() > 0) {
       try {
         dbSqlSession.getSqlSession().getConnection().setCatalog(getDatabaseCatalog());
       } catch (SQLException e) {
