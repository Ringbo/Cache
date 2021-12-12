diff --git a/src/test/java/org/elasticsearch/discovery/ZenFaultDetectionTests.java b/src/test/java/org/elasticsearch/discovery/ZenFaultDetectionTests.java
index fc1634d..3f65ed1 100644
--- a/src/test/java/org/elasticsearch/discovery/ZenFaultDetectionTests.java
+++ b/src/test/java/org/elasticsearch/discovery/ZenFaultDetectionTests.java
@@ -60,7 +60,7 @@
     @Before
     public void setUp() throws Exception {
         super.setUp();
-        threadPool = new ThreadPool();
+        threadPool = new ThreadPool(getClass().getName());
         serviceA = build(ImmutableSettings.builder().put("name", "TS_A").build(), version0);
         nodeA = new DiscoveryNode("TS_A", "TS_A", serviceA.boundAddress().publishAddress(), ImmutableMap.<String, String>of(), version0);
         serviceB = build(ImmutableSettings.builder().put("name", "TS_B").build(), version1);
