diff --git a/graylog2-server/src/main/java/org/graylog2/shared/journal/KafkaJournal.java b/graylog2-server/src/main/java/org/graylog2/shared/journal/KafkaJournal.java
index 88777e5..1713cf5 100644
--- a/graylog2-server/src/main/java/org/graylog2/shared/journal/KafkaJournal.java
+++ b/graylog2-server/src/main/java/org/graylog2/shared/journal/KafkaJournal.java
@@ -432,7 +432,7 @@
             final long logStartOffset = getLogStartOffset();
 
             if (readOffset < logStartOffset) {
-                LOG.error(
+                LOG.info(
                         "Read offset {} before start of log at {}, starting to read from the beginning of the journal.",
                         readOffset,
                         logStartOffset);
