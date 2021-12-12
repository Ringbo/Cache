diff --git a/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java b/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
index c13115e..10c23f8 100755
--- a/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
@@ -264,7 +264,7 @@
     }
 
     public DatabaseLocker getDatabaseLocker() throws IOException {
-        if (databaseLocker == null) {
+        if (databaseLocker == null && isUseDatabaseLock()) {
             databaseLocker = createDatabaseLocker();
         }
         return databaseLocker;
