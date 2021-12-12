diff --git a/sdks/java/extensions/sql/src/main/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonTableProvider.java b/sdks/java/extensions/sql/src/main/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonTableProvider.java
index 66a952a..9c13c8a 100644
--- a/sdks/java/extensions/sql/src/main/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonTableProvider.java
+++ b/sdks/java/extensions/sql/src/main/java/org/apache/beam/sdk/extensions/sql/meta/provider/pubsub/PubsubJsonTableProvider.java
@@ -71,7 +71,8 @@
 
     if (schema.getFieldCount() != 3
         || !fieldPresent(schema, TIMESTAMP_FIELD, TIMESTAMP)
-        || !fieldPresent(schema, ATTRIBUTES_FIELD, Schema.FieldType.map(VARCHAR, VARCHAR))
+        || !fieldPresent(
+            schema, ATTRIBUTES_FIELD, Schema.FieldType.map(VARCHAR.withNullable(false), VARCHAR))
         || !(schema.hasField(PAYLOAD_FIELD)
             && ROW.equals(schema.getField(PAYLOAD_FIELD).getType().getTypeName()))) {
 
@@ -85,7 +86,9 @@
   }
 
   private boolean fieldPresent(Schema schema, String field, Schema.FieldType expectedType) {
-    return schema.hasField(field) && expectedType.equals(schema.getField(field).getType());
+    return schema.hasField(field)
+        && expectedType.equivalent(
+            schema.getField(field).getType(), Schema.EquivalenceNullablePolicy.IGNORE);
   }
 
   private void validateDlq(String deadLetterQueue) {
