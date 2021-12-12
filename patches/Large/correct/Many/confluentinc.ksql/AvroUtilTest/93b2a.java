diff --git a/ksql-engine/src/test/java/io/confluent/ksql/util/AvroUtilTest.java b/ksql-engine/src/test/java/io/confluent/ksql/util/AvroUtilTest.java
index a39edf0..1dab779 100644
--- a/ksql-engine/src/test/java/io/confluent/ksql/util/AvroUtilTest.java
+++ b/ksql-engine/src/test/java/io/confluent/ksql/util/AvroUtilTest.java
@@ -49,7 +49,7 @@
 
 public class AvroUtilTest {
 
-  String ordersAveroSchemaStr = "{"
+  private String ordersAveroSchemaStr = "{"
                      + "\"namespace\": \"kql\","
                      + " \"name\": \"orders\","
                      + " \"type\": \"record\","
@@ -62,7 +62,7 @@
                      + "     {\"name\": \"mapcol\", \"type\": {\"type\": \"map\", \"values\": \"double\"}}"
                      + " ]"
                      + "}";
-  AvroUtil avroUtil = new AvroUtil();
+  private AvroUtil avroUtil = new AvroUtil();
 
   @Test
   public void shouldPassAvroCheck() throws Exception {
@@ -100,9 +100,8 @@
       avroUtil.checkAndSetAvroSchema(abstractStreamCreateStatement, new HashMap<>(), schemaRegistryClient);
       fail();
     } catch (Exception e) {
-      assertThat("Expected different message message.", e.getMessage(), equalTo(" Could not "
-                                                                               + "fetch the AVRO schema "
-                                                          + "from schema registry. null "));
+      assertThat("Expected different message message.", e.getMessage().trim(),
+          equalTo("Unable to verify the AVRO schema is compatible with KSQL. null"));
     }
   }
 
