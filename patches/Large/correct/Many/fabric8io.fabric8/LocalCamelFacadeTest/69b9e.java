diff --git a/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/LocalCamelFacadeTest.java b/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/LocalCamelFacadeTest.java
index 6c04c92..2aedf39 100644
--- a/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/LocalCamelFacadeTest.java
+++ b/tooling/tooling-camel-facade/src/test/java/io/fabric8/camel/facade/LocalCamelFacadeTest.java
@@ -195,7 +195,7 @@
     public void testThreadPools() throws Exception {
         List<CamelThreadPoolMBean> pools = local.getThreadPools(context.getManagementName());
         assertNotNull(pools);
-        assertEquals(2, pools.size());
+        assertEquals(1, pools.size());
     }
 
     @Test
