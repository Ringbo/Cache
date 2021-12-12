diff --git a/src/be/ibridge/kettle/repository/Repository.java b/src/be/ibridge/kettle/repository/Repository.java
index 6cbfdd7..d54c65f 100644
--- a/src/be/ibridge/kettle/repository/Repository.java
+++ b/src/be/ibridge/kettle/repository/Repository.java
@@ -1480,7 +1480,7 @@
     
     public synchronized long insertClusterSlave(ClusterSchema clusterSchema, SlaveServer slaveServer) throws KettleDatabaseException
     {
-        long id = getNextClusterID();
+        long id = getNextClusterSlaveID();
 
         Row table = new Row();
 
@@ -1488,7 +1488,7 @@
         table.addValue(new Value("ID_CLUSTER", id));
         table.addValue(new Value("ID_SLAVE", id));
 
-        database.prepareInsert(table, "R_CLUSTER");
+        database.prepareInsert(table, "R_CLUSTER_SLAVE");
         database.setValuesInsert(table);
         database.insertRow();
         database.closeInsert();
