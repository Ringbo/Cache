diff --git a/core/src/test/java/org/elasticsearch/env/NodeEnvironmentTests.java b/core/src/test/java/org/elasticsearch/env/NodeEnvironmentTests.java
index 84809c0..ad425d8 100644
--- a/core/src/test/java/org/elasticsearch/env/NodeEnvironmentTests.java
+++ b/core/src/test/java/org/elasticsearch/env/NodeEnvironmentTests.java
@@ -409,19 +409,19 @@
 
     public void testWhetherClusterFolderShouldBeUsed() throws Exception {
         Path tempNoCluster = createTempDir();
-        String tempDataPathString = tempNoCluster.toAbsolutePath().toString();
+        Path tempDataPath = tempNoCluster.toAbsolutePath();
 
         Path tempPath = tempNoCluster.resolve("foo"); // "foo" is the cluster name
-        String tempClusterPathString = tempPath.toAbsolutePath().toString();
+        Path tempClusterPath = tempPath.toAbsolutePath();
 
         assertFalse("non-existent directory should not be used", NodeEnvironment.readFromDataPathWithClusterName(tempPath));
         Settings settings = Settings.builder()
                 .put("cluster.name", "foo")
                 .put(Environment.PATH_HOME_SETTING.getKey(), createTempDir().toAbsolutePath().toString())
-                .put(Environment.PATH_DATA_SETTING.getKey(), tempDataPathString).build();
+                .put(Environment.PATH_DATA_SETTING.getKey(), tempDataPath.toString()).build();
         try (NodeEnvironment env = new NodeEnvironment(settings, new Environment(settings))) {
             Path nodeDataPath = env.nodeDataPaths()[0];
-            assertThat(nodeDataPath.toString(), equalTo(tempDataPathString + "/nodes/0"));
+            assertEquals(nodeDataPath, tempDataPath.resolve("nodes").resolve("0"));
         }
         IOUtils.rm(tempNoCluster);
 
@@ -430,10 +430,10 @@
         settings = Settings.builder()
                 .put("cluster.name", "foo")
                 .put(Environment.PATH_HOME_SETTING.getKey(), createTempDir().toAbsolutePath().toString())
-                .put(Environment.PATH_DATA_SETTING.getKey(), tempDataPathString).build();
+                .put(Environment.PATH_DATA_SETTING.getKey(), tempDataPath.toString()).build();
         try (NodeEnvironment env = new NodeEnvironment(settings, new Environment(settings))) {
             Path nodeDataPath = env.nodeDataPaths()[0];
-            assertThat(nodeDataPath.toString(), equalTo(tempDataPathString + "/nodes/0"));
+            assertEquals(nodeDataPath, tempDataPath.resolve("nodes").resolve("0"));
         }
         IOUtils.rm(tempNoCluster);
 
@@ -443,10 +443,10 @@
         settings = Settings.builder()
                 .put("cluster.name", "foo")
                 .put(Environment.PATH_HOME_SETTING.getKey(), createTempDir().toAbsolutePath().toString())
-                .put(Environment.PATH_DATA_SETTING.getKey(), tempDataPathString).build();
+                .put(Environment.PATH_DATA_SETTING.getKey(), tempClusterPath.toString()).build();
         try (NodeEnvironment env = new NodeEnvironment(settings, new Environment(settings))) {
             Path nodeDataPath = env.nodeDataPaths()[0];
-            assertThat(nodeDataPath.toString(), equalTo(tempClusterPathString + "/nodes/0"));
+            assertEquals(nodeDataPath, tempClusterPath.resolve("nodes").resolve("0"));
         }
     }
 
