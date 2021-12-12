diff --git a/src/test/java/org/redisson/RedisClientTest.java b/src/test/java/org/redisson/RedisClientTest.java
index 7dee6f0..80198ed 100644
--- a/src/test/java/org/redisson/RedisClientTest.java
+++ b/src/test/java/org/redisson/RedisClientTest.java
@@ -34,12 +34,12 @@
 public class RedisClientTest {
 
     @Before
-    public static void before() throws IOException, InterruptedException {
+    public void before() throws IOException, InterruptedException {
         RedisRunner.startDefaultRedisTestInstance();
     }
 
     @After
-    public static void after() throws InterruptedException {
+    public void after() throws InterruptedException {
         RedisRunner.shutDownDefaultRedisTestInstance();
     }
 
