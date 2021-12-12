diff --git a/ambari-server/src/main/java/org/apache/ambari/server/orm/dao/ClusterDAO.java b/ambari-server/src/main/java/org/apache/ambari/server/orm/dao/ClusterDAO.java
index a57ef1f..7df1e2b 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/orm/dao/ClusterDAO.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/orm/dao/ClusterDAO.java
@@ -133,13 +133,13 @@
    * @return the highest existing value of the version column + 1
    */
   public Long findNextConfigVersion(long clusterId, String configType) {
-    TypedQuery<Long> query = entityManagerProvider.get().createNamedQuery(
-        "ClusterConfigEntity.findNextConfigVersion", Long.class);
+    TypedQuery<Number> query = entityManagerProvider.get().createNamedQuery(
+        "ClusterConfigEntity.findNextConfigVersion", Number.class);
 
     query.setParameter("clusterId", clusterId);
     query.setParameter("configType", configType);
 
-    return daoUtils.selectSingle(query);
+    return daoUtils.selectSingle(query).longValue();
   }
 
   /**
