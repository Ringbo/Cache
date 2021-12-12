diff --git a/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java b/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java
index c37198b..8682dc0 100644
--- a/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java
+++ b/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java
@@ -108,7 +108,7 @@
          TestElf.setSlf4jTargetStream(LeakTask.class, ps);
 
          Connection connection = ds.getConnection();
-         PoolUtilities.quietlySleep(TimeUnit.SECONDS.toMillis(4));
+         PoolUtilities.quietlySleep(TimeUnit.SECONDS.toMillis(5));
          ps.close();
          connection.close();
          String s = new String(baos.toByteArray());
