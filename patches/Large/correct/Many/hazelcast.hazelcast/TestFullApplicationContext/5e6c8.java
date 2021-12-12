diff --git a/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java b/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
index cb63096..2971cad 100644
--- a/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
+++ b/hazelcast-spring/src/test/java/com/hazelcast/spring/TestFullApplicationContext.java
@@ -123,7 +123,7 @@
     @Test
     public void testMapConfig() {
         assertNotNull(config);
-        assertEquals(8, config.getMapConfigs().size());
+        assertEquals(6, config.getMapConfigs().size());
         MapConfig testMapConfig = config.getMapConfig("testMap");
         assertNotNull(testMapConfig);
         assertEquals("testMap", testMapConfig.getName());
