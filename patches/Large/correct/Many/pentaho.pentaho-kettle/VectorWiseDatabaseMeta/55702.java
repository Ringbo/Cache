diff --git a/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java b/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
index 766139c..0de2414 100644
--- a/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
+++ b/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
@@ -39,7 +39,7 @@
     if (getAccessType() == DatabaseMeta.TYPE_ACCESS_ODBC) {
       return "jdbc:odbc:" + databaseName;
     } else {
-      if (Const.isEmpty(port)) {
+      if (Const.isEmpty(port) || "-1".equals(port)) {
         return "jdbc:ingres://" + hostname + ":VW7/" + databaseName;
       } else {
         return "jdbc:ingres://" + hostname + ":" + port + "/" + databaseName;
