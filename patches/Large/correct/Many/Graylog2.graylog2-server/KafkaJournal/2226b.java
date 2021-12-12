diff --git a/graylog2-shared/src/main/java/org/graylog2/shared/journal/KafkaJournal.java b/graylog2-shared/src/main/java/org/graylog2/shared/journal/KafkaJournal.java
index 0edf0ff..a9d439f 100644
--- a/graylog2-shared/src/main/java/org/graylog2/shared/journal/KafkaJournal.java
+++ b/graylog2-shared/src/main/java/org/graylog2/shared/journal/KafkaJournal.java
@@ -366,7 +366,7 @@
     protected void flushDirtyLogs() {
         log.debug("Checking for dirty logs to flush...");
 
-        final Set<Map.Entry<TopicAndPartition, Log>> entries = JavaConversions.asMap(logManager.logsByTopicPartition()).entrySet();
+        final Set<Map.Entry<TopicAndPartition, Log>> entries = JavaConversions.mapAsJavaMap(logManager.logsByTopicPartition()).entrySet();
         for (final Map.Entry<TopicAndPartition, Log> topicAndPartitionLogEntry : entries) {
             final TopicAndPartition topicAndPartition = topicAndPartitionLogEntry.getKey();
             final Log kafkaLog = topicAndPartitionLogEntry.getValue();
@@ -459,7 +459,7 @@
                 loggerForCleaner.debug("Beginning log cleanup");
                 int total = 0;
                 final Timer.Context ctx = new Timer().time();
-                for (final Log kafkaLog : JavaConversions.asIterable(logManager.allLogs())) {
+                for (final Log kafkaLog : JavaConversions.asJavaIterable(logManager.allLogs())) {
                     if (kafkaLog.config().compact()) continue;
                     loggerForCleaner.debug("Garbage collecting {}", kafkaLog.name());
                     total += cleanupExpiredSegments(kafkaLog) +
@@ -535,7 +535,7 @@
             // so we have to get a global view.
             final long committedOffset = KafkaJournal.this.committedOffset.get();
             final HashSet<LogSegment> logSegments = Sets.newHashSet(
-                    JavaConversions.asIterable(kafkaLog.logSegments(committedOffset, Long.MAX_VALUE))
+                    JavaConversions.asJavaIterable(kafkaLog.logSegments(committedOffset, Long.MAX_VALUE))
             );
             loggerForCleaner.debug("[cleanup-committed] Keeping segments {}", logSegments);
             return kafkaLog.deleteOldSegments(new AbstractFunction1<LogSegment, Object>() {
