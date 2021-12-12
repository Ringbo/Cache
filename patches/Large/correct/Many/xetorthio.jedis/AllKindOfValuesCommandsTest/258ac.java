diff --git a/src/test/java/redis/clients/jedis/tests/commands/AllKindOfValuesCommandsTest.java b/src/test/java/redis/clients/jedis/tests/commands/AllKindOfValuesCommandsTest.java
index d7df713..855a35d 100644
--- a/src/test/java/redis/clients/jedis/tests/commands/AllKindOfValuesCommandsTest.java
+++ b/src/test/java/redis/clients/jedis/tests/commands/AllKindOfValuesCommandsTest.java
@@ -300,7 +300,7 @@
     @Test
     public void ttl() {
         long ttl = jedis.ttl("foo");
-        assertEquals(-1, ttl);
+        assertEquals(-2, ttl);
 
         jedis.set("foo", "bar");
         ttl = jedis.ttl("foo");
@@ -312,7 +312,7 @@
 
         // Binary
         long bttl = jedis.ttl(bfoo);
-        assertEquals(-1, bttl);
+        assertEquals(-2, bttl);
 
         jedis.set(bfoo, bbar);
         bttl = jedis.ttl(bfoo);
