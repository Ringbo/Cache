diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/query/QueryAdvancedTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/query/QueryAdvancedTest.java
index d5be62c..c89f143 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/query/QueryAdvancedTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/query/QueryAdvancedTest.java
@@ -104,10 +104,10 @@
 
     @Test
     @SuppressWarnings("deprecation")
-    public void testQueryWithTTL() throws Exception {
+    public void testQueryWithTTL() {
         Config config = getConfig();
         String mapName = "default";
-        config.getMapConfig(mapName).setTimeToLiveSeconds(5);
+        config.getMapConfig(mapName).setTimeToLiveSeconds(10);
 
         HazelcastInstance instance = createHazelcastInstance(config);
 
@@ -140,7 +140,9 @@
 
         // check the query result before eviction
         Collection values = map.values(new SqlPredicate("active"));
-        assertEquals(activeEmployees, values.size());
+        assertEquals(String.format("Expected %s results but got %s. Number of evicted entries: %s.",
+                activeEmployees, values.size(), allEmployees - latch.getCount()),
+                activeEmployees, values.size());
 
         // wait until eviction is completed
         assertOpenEventually(latch);
