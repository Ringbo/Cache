diff --git a/nifi-nar-bundles/nifi-extension-utils/nifi-record-utils/nifi-avro-record-utils/src/main/java/org/apache/nifi/avro/AvroTypeUtil.java b/nifi-nar-bundles/nifi-extension-utils/nifi-record-utils/nifi-avro-record-utils/src/main/java/org/apache/nifi/avro/AvroTypeUtil.java
index 52d749f..bd5e8e4 100644
--- a/nifi-nar-bundles/nifi-extension-utils/nifi-record-utils/nifi-avro-record-utils/src/main/java/org/apache/nifi/avro/AvroTypeUtil.java
+++ b/nifi-nar-bundles/nifi-extension-utils/nifi-record-utils/nifi-avro-record-utils/src/main/java/org/apache/nifi/avro/AvroTypeUtil.java
@@ -481,7 +481,7 @@
                 if (LOGICAL_TYPE_DATE.equals(logicalName)) {
                     // date logical name means that the value is number of days since Jan 1, 1970
                     return new java.sql.Date(TimeUnit.DAYS.toMillis((int) value));
-                } else if (LOGICAL_TYPE_TIMESTAMP_MILLIS.equals(logicalName)) {
+                } else if (LOGICAL_TYPE_TIME_MILLIS.equals(logicalName)) {
                     // time-millis logical name means that the value is number of milliseconds since midnight.
                     return new java.sql.Time((int) value);
                 }
