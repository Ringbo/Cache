diff --git a/test/unit/voldemort/serialization/avro/versioned/AvroBackwardsCompatibilityTest.java b/test/unit/voldemort/serialization/avro/versioned/AvroBackwardsCompatibilityTest.java
index 8787e12..b240647 100644
--- a/test/unit/voldemort/serialization/avro/versioned/AvroBackwardsCompatibilityTest.java
+++ b/test/unit/voldemort/serialization/avro/versioned/AvroBackwardsCompatibilityTest.java
@@ -35,7 +35,7 @@
     }
 
     @Test
-    public static void testAvroSchemaEvolution() throws IOException {
+    public void testAvroSchemaEvolution() throws IOException {
 
         String versionZero = "{\"type\": \"record\", \"name\": \"myrec\",\"fields\": [{ \"name\": \"original\", \"type\": \"string\" }]}";
 
