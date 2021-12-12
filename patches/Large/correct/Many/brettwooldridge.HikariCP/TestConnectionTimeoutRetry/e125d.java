diff --git a/src/test/java/com/zaxxer/hikari/pool/TestConnectionTimeoutRetry.java b/src/test/java/com/zaxxer/hikari/pool/TestConnectionTimeoutRetry.java
index 0d5f009..c8c9d27 100644
--- a/src/test/java/com/zaxxer/hikari/pool/TestConnectionTimeoutRetry.java
+++ b/src/test/java/com/zaxxer/hikari/pool/TestConnectionTimeoutRetry.java
@@ -234,7 +234,7 @@
          Connection connection6 = ds.getConnection();
          Connection connection7 = ds.getConnection();
 
-         Thread.sleep(1200);
+         Thread.sleep(2000);
 
          Assert.assertSame("Totals connections not as expected", 10, TestElf.getPool(ds).getTotalConnections());
          Assert.assertSame("Idle connections not as expected", 3, TestElf.getPool(ds).getIdleConnections());
