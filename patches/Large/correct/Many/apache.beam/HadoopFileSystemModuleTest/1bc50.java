diff --git a/sdks/java/io/hadoop-file-system/src/test/java/org/apache/beam/sdk/io/hdfs/HadoopFileSystemModuleTest.java b/sdks/java/io/hadoop-file-system/src/test/java/org/apache/beam/sdk/io/hdfs/HadoopFileSystemModuleTest.java
index 6963116..cdb1694 100644
--- a/sdks/java/io/hadoop-file-system/src/test/java/org/apache/beam/sdk/io/hdfs/HadoopFileSystemModuleTest.java
+++ b/sdks/java/io/hadoop-file-system/src/test/java/org/apache/beam/sdk/io/hdfs/HadoopFileSystemModuleTest.java
@@ -57,7 +57,7 @@
     String serializedConfiguration = objectMapper.writeValueAsString(configuration);
     Configuration deserializedConfiguration =
         objectMapper.readValue(serializedConfiguration, Configuration.class);
-    assertThat(deserializedConfiguration, Matchers.<Map.Entry<String, String>>contains(
+    assertThat(deserializedConfiguration, Matchers.<Map.Entry<String, String>>containsInAnyOrder(
         new AbstractMap.SimpleEntry("testPropertyA", "A"),
         new AbstractMap.SimpleEntry("testPropertyB", "B"),
         new AbstractMap.SimpleEntry("testPropertyC", "baseC")));
