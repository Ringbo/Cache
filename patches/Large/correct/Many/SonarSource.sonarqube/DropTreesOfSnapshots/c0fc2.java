diff --git a/sonar-db/src/main/java/org/sonar/db/version/v60/DropTreesOfSnapshots.java b/sonar-db/src/main/java/org/sonar/db/version/v60/DropTreesOfSnapshots.java
index 07a5ac5..c5918a5 100644
--- a/sonar-db/src/main/java/org/sonar/db/version/v60/DropTreesOfSnapshots.java
+++ b/sonar-db/src/main/java/org/sonar/db/version/v60/DropTreesOfSnapshots.java
@@ -38,10 +38,10 @@
     massUpdate.select("select id from snapshots where depth > 0");
     massUpdate.update("delete from snapshots where id=?");
     massUpdate.rowPluralName("snapshots");
-    massUpdate.execute(this::handle);
+    massUpdate.execute(DropTreesOfSnapshots::handle);
   }
 
-  private boolean handle(Select.Row row, SqlStatement update) throws SQLException {
+  private static boolean handle(Select.Row row, SqlStatement update) throws SQLException {
     long id = row.getLong(1);
     update.setLong(1, id);
     return true;
