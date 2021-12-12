diff --git a/src/main/java/io/mycat/backend/datasource/PhysicalDBNode.java b/src/main/java/io/mycat/backend/datasource/PhysicalDBNode.java
index 71deb7e..b356f0a 100644
--- a/src/main/java/io/mycat/backend/datasource/PhysicalDBNode.java
+++ b/src/main/java/io/mycat/backend/datasource/PhysicalDBNode.java
@@ -118,7 +118,7 @@
 					LOGGER.debug("rrs.getRunOnSlave() " + rrs.getRunOnSlave());
 					PhysicalDatasource writeSource=dbPool.getSource();
 					//记录写节点写负载值
-					writeSource.setReadCount();
+					writeSource.setWriteCount();
 					writeSource.getConnection(schema, autoCommit,
 							handler, attachment);
 					rrs.setCanRunInReadDB(false);
