diff --git a/plugins/org.jkiss.dbeaver.ext.informix/src/org/jkiss/dbeaver/ext/informix/model/InformixMetaModel.java b/plugins/org.jkiss.dbeaver.ext.informix/src/org/jkiss/dbeaver/ext/informix/model/InformixMetaModel.java
index 1217d82..d6cb7aa 100644
--- a/plugins/org.jkiss.dbeaver.ext.informix/src/org/jkiss/dbeaver/ext/informix/model/InformixMetaModel.java
+++ b/plugins/org.jkiss.dbeaver.ext.informix/src/org/jkiss/dbeaver/ext/informix/model/InformixMetaModel.java
@@ -77,7 +77,7 @@
                 "WHERE T2.tabid = T1.tabid AND T2.tabname = ?";
 
             try (JDBCPreparedStatement dbStat = session.prepareStatement(query)) {
-                dbStat.setString(2, table.getName());
+                dbStat.setString(1, table.getName());
                 List<GenericTrigger> result = new ArrayList<>();
 
                 try (JDBCResultSet dbResult = dbStat.executeQuery()) {
