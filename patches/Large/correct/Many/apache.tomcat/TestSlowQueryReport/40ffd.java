diff --git a/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TestSlowQueryReport.java b/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TestSlowQueryReport.java
index e552d03..6a5c89b 100644
--- a/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TestSlowQueryReport.java
+++ b/modules/jdbc-pool/src/test/java/org/apache/tomcat/jdbc/test/TestSlowQueryReport.java
@@ -163,7 +163,7 @@
         }
         Map<String,SlowQueryReport.QueryStats> map = SlowQueryReport.getPoolStats(datasource.getPool().getName());
         Assert.assertNotNull(map);
-        Assert.assertEquals(0,map.size());
+        Assert.assertEquals(1,map.size());
         ConnectionPool pool = datasource.getPool();
         con.close();
         tearDown();
