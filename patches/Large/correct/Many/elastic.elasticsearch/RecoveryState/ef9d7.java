diff --git a/core/src/main/java/org/elasticsearch/indices/recovery/RecoveryState.java b/core/src/main/java/org/elasticsearch/indices/recovery/RecoveryState.java
index decebd3..a0ef2ef 100644
--- a/core/src/main/java/org/elasticsearch/indices/recovery/RecoveryState.java
+++ b/core/src/main/java/org/elasticsearch/indices/recovery/RecoveryState.java
@@ -942,7 +942,7 @@
             // stream size first, as it matters more and the files section can be long
             builder.startObject(Fields.SIZE);
             builder.byteSizeField(Fields.TOTAL_IN_BYTES, Fields.TOTAL, totalBytes());
-            builder.byteSizeField(Fields.REUSED_IN_BYTES, Fields.REUSED, totalBytes());
+            builder.byteSizeField(Fields.REUSED_IN_BYTES, Fields.REUSED, reusedBytes());
             builder.byteSizeField(Fields.RECOVERED_IN_BYTES, Fields.RECOVERED, recoveredBytes());
             builder.field(Fields.PERCENT, String.format(Locale.ROOT, "%1.1f%%", recoveredBytesPercent()));
             builder.endObject();
