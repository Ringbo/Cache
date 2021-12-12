diff --git a/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/RemoteCamelFacadeTest.java b/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/RemoteCamelFacadeTest.java
index f62a2c1..57bc7e2 100644
--- a/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/RemoteCamelFacadeTest.java
+++ b/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/RemoteCamelFacadeTest.java
@@ -196,7 +196,7 @@
     public void testThreadPools() throws Exception {
         List<CamelThreadPoolMBean> pools = remote.getThreadPools("myCamel");
         assertNotNull(pools);
-        assertEquals(2, pools.size());
+        assertEquals(1, pools.size());
     }
 
     @Test
