diff --git a/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TwoDataSources.java b/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TwoDataSources.java
index 3dbb07c..2c508ab 100644
--- a/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TwoDataSources.java
+++ b/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TwoDataSources.java
@@ -28,7 +28,7 @@
         org.apache.tomcat.jdbc.pool.DataSource d1 = this.createDefaultDataSource();
         org.apache.tomcat.jdbc.pool.DataSource d2 = this.createDefaultDataSource();
         d1.setRemoveAbandoned(true);
-        d1.setRemoveAbandonedTimeout(10);
+        d1.setRemoveAbandonedTimeout(2);
         d1.setTimeBetweenEvictionRunsMillis(1000);
         d2.setRemoveAbandoned(false);
         Connection c1 = d1.getConnection();
