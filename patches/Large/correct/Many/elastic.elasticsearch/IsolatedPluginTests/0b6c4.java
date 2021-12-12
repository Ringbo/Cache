diff --git a/src/test/java/org/elasticsearch/plugins/IsolatedPluginTests.java b/src/test/java/org/elasticsearch/plugins/IsolatedPluginTests.java
index c677b26..bfba23c 100644
--- a/src/test/java/org/elasticsearch/plugins/IsolatedPluginTests.java
+++ b/src/test/java/org/elasticsearch/plugins/IsolatedPluginTests.java
@@ -43,7 +43,7 @@
 
 // NB: the tests uses System Properties to pass the information from different plugins (loaded in separate CLs) to the test.
 // hence the use of try/finally blocks to clean these up after the test has been executed as otherwise the test framework will trigger a failure
-@ClusterScope(scope = Scope.TEST, numNodes = 1)
+@ClusterScope(scope = Scope.TEST, numNodes = 0)
 public class IsolatedPluginTests extends ElasticsearchIntegrationTest {
 
     private static final Settings SETTINGS;
@@ -113,7 +113,7 @@
     @Test
     public void testIsolatedPluginProperties() throws Exception {
         try {
-            cluster().client();
+            client();
             Properties p = System.getProperties();
             assertThat(p.getProperty("es.test.isolated.plugin.count"), equalTo("2"));
             String prop = p.getProperty("es.test.isolated.plugin.instantiated.hashes");
