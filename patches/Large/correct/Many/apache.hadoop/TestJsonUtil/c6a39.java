diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/web/TestJsonUtil.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/web/TestJsonUtil.java
index 94cec85..5a3d451 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/web/TestJsonUtil.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/web/TestJsonUtil.java
@@ -71,7 +71,7 @@
     System.out.println("fstatus = " + fstatus);
     final String json = JsonUtil.toJsonString(status, true);
     System.out.println("json    = " + json.replace(",", ",\n  "));
-    ObjectReader reader = new ObjectMapper().reader(Map.class);
+    ObjectReader reader = new ObjectMapper().readerFor(Map.class);
     final HdfsFileStatus s2 =
         JsonUtilClient.toFileStatus((Map<?, ?>) reader.readValue(json), true);
     final FileStatus fs2 = toFileStatus(s2, parent);
@@ -159,7 +159,7 @@
   public void testToAclStatus() throws IOException {
     String jsonString =
         "{\"AclStatus\":{\"entries\":[\"user::rwx\",\"user:user1:rw-\",\"group::rw-\",\"other::r-x\"],\"group\":\"supergroup\",\"owner\":\"testuser\",\"stickyBit\":false}}";
-    ObjectReader reader = new ObjectMapper().reader(Map.class);
+    ObjectReader reader = new ObjectMapper().readerFor(Map.class);
     Map<?, ?> json = reader.readValue(jsonString);
 
     List<AclEntry> aclSpec =
@@ -219,7 +219,7 @@
     String jsonString = 
         "{\"XAttrs\":[{\"name\":\"user.a1\",\"value\":\"0x313233\"}," +
         "{\"name\":\"user.a2\",\"value\":\"0x313131\"}]}";
-    ObjectReader reader = new ObjectMapper().reader(Map.class);
+    ObjectReader reader = new ObjectMapper().readerFor(Map.class);
     Map<?, ?> json = reader.readValue(jsonString);
     XAttr xAttr1 = (new XAttr.Builder()).setNameSpace(XAttr.NameSpace.USER).
         setName("a1").setValue(XAttrCodec.decodeValue("0x313233")).build();
@@ -245,7 +245,7 @@
     String jsonString = 
         "{\"XAttrs\":[{\"name\":\"user.a1\",\"value\":\"0x313233\"}," +
         "{\"name\":\"user.a2\",\"value\":\"0x313131\"}]}";
-    ObjectReader reader = new ObjectMapper().reader(Map.class);
+    ObjectReader reader = new ObjectMapper().readerFor(Map.class);
     Map<?, ?> json = reader.readValue(jsonString);
 
     // Get xattr: user.a2
