diff --git a/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/AvroUtils.java b/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/AvroUtils.java
index e36700d..b58aa87 100644
--- a/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/AvroUtils.java
+++ b/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/AvroUtils.java
@@ -25,7 +25,7 @@
 
 /** Utils to help convert Apache Avro types to Beam types. */
 public class AvroUtils {
-  public static Object convertAvroFormat(Field beamField, Object value) throws RuntimeException {
+  public static Object convertAvroFormat(Field beamField, Object value) {
     Object ret;
     TypeName beamFieldTypeName = beamField.getType().getTypeName();
     switch (beamFieldTypeName) {
