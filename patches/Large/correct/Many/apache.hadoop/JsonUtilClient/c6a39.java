diff --git a/hadoop-hdfs-project/hadoop-hdfs-client/src/main/java/org/apache/hadoop/hdfs/web/JsonUtilClient.java b/hadoop-hdfs-project/hadoop-hdfs-client/src/main/java/org/apache/hadoop/hdfs/web/JsonUtilClient.java
index 3690a86..246f242 100644
--- a/hadoop-hdfs-project/hadoop-hdfs-client/src/main/java/org/apache/hadoop/hdfs/web/JsonUtilClient.java
+++ b/hadoop-hdfs-project/hadoop-hdfs-client/src/main/java/org/apache/hadoop/hdfs/web/JsonUtilClient.java
@@ -526,7 +526,7 @@
     }
 
     final String namesInJson = (String) json.get("XAttrNames");
-    ObjectReader reader = new ObjectMapper().reader(List.class);
+    ObjectReader reader = new ObjectMapper().readerFor(List.class);
     final List<Object> xattrs = reader.readValue(namesInJson);
     final List<String> names =
         Lists.newArrayListWithCapacity(json.keySet().size());
