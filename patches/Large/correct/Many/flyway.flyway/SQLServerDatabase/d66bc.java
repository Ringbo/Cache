diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/database/sqlserver/SQLServerDatabase.java b/flyway-core/src/main/java/org/flywaydb/core/internal/database/sqlserver/SQLServerDatabase.java
index 7d2b1e8..e1181d0 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/database/sqlserver/SQLServerDatabase.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/database/sqlserver/SQLServerDatabase.java
@@ -161,6 +161,6 @@
 
     @Override
     public boolean useSingleConnection() {
-        return true;
+        return false;
     }
 }
\ No newline at end of file
