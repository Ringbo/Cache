diff --git a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java
index 9675c71..95623b6 100644
--- a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java
+++ b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java
@@ -210,7 +210,7 @@
         if(isKeepAlive()) {
             dataSource.setTestWhileIdle(true);
             dataSource.setValidationQuery(getCheckQuery());
-            dataSource.setMaxConnLifetimeMillis(Long.parseLong(getConnectionAge()));            
+            dataSource.setSoftMinEvictableIdleTimeMillis(Long.parseLong(getConnectionAge()));
             dataSource.setTimeBetweenEvictionRunsMillis(Integer.parseInt(getTrimInterval()));
         }
 
