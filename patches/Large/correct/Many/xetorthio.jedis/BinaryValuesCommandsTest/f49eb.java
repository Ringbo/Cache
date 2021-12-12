diff --git a/src/test/java/redis/clients/jedis/tests/commands/BinaryValuesCommandsTest.java b/src/test/java/redis/clients/jedis/tests/commands/BinaryValuesCommandsTest.java
index bdd1c91..21432fe 100644
--- a/src/test/java/redis/clients/jedis/tests/commands/BinaryValuesCommandsTest.java
+++ b/src/test/java/redis/clients/jedis/tests/commands/BinaryValuesCommandsTest.java
@@ -74,7 +74,7 @@
     String status = jedis.set(bfoo, binaryValue);
     assertTrue(Keyword.OK.name().equalsIgnoreCase(status));
     // nx should fail if value exists
-    String statusSuccess = jedis.set(bfoo, binaryValue, setParams().nx().ex(expireSeconds));
+    String statusSuccess = jedis.set(bfoo, binaryValue, setParams().xx().ex(expireSeconds));
     assertTrue(Keyword.OK.name().equalsIgnoreCase(statusSuccess));
 
     byte[] value = jedis.get(bfoo);
