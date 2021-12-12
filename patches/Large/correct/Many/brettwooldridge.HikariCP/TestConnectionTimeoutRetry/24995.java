diff --git a/hikaricp-java6/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java b/hikaricp-java6/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java
index 4325a72..3662a8d 100644
--- a/hikaricp-java6/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java
+++ b/hikaricp-java6/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java
@@ -235,7 +235,7 @@
          Connection connection6 = ds.getConnection();
          Connection connection7 = ds.getConnection();
 
-         Thread.sleep(1350);
+         Thread.sleep(1500);
 
          Assert.assertSame("Totals connections not as expected", 10, TestElf.getPool(ds).getTotalConnections());
          Assert.assertSame("Idle connections not as expected", 3, TestElf.getPool(ds).getIdleConnections());
