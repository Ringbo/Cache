diff --git a/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java b/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java
index de2b4c2..944beae 100644
--- a/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java
+++ b/hikaricp-java6/src/test/java/com/zaxxer/hikari/MiscTest.java
@@ -108,7 +108,7 @@
          TestElf.setSlf4jTargetStream(LeakTask.class, ps);
 
          Connection connection = ds.getConnection();
-         PoolUtilities.quietlySleep(TimeUnit.SECONDS.toMillis(3));
+         PoolUtilities.quietlySleep(TimeUnit.SECONDS.toMillis(4));
          ps.close();
          connection.close();
          String s = new String(baos.toByteArray());
