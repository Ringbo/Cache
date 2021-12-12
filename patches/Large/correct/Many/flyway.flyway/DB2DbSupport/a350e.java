diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/db2/DB2DbSupport.java b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/db2/DB2DbSupport.java
index e5bc4ae..68791d9 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/db2/DB2DbSupport.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/db2/DB2DbSupport.java
@@ -132,6 +132,6 @@
 
     @Override
     public boolean useSingleConnection() {
-        return true;
+        return false;
     }
 }
\ No newline at end of file
