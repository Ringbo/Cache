diff --git a/extensions-core/kafka-indexing-service/src/main/java/io/druid/indexing/kafka/supervisor/KafkaSupervisor.java b/extensions-core/kafka-indexing-service/src/main/java/io/druid/indexing/kafka/supervisor/KafkaSupervisor.java
index 3769fe1..9a01344 100644
--- a/extensions-core/kafka-indexing-service/src/main/java/io/druid/indexing/kafka/supervisor/KafkaSupervisor.java
+++ b/extensions-core/kafka-indexing-service/src/main/java/io/druid/indexing/kafka/supervisor/KafkaSupervisor.java
@@ -313,7 +313,7 @@
                     try {
                       notice.handle();
                     }
-                    catch (Exception e) {
+                    catch (Throwable e) {
                       log.makeAlert(e, "KafkaSupervisor[%s] failed to handle notice", dataSource)
                          .addData("noticeClass", notice.getClass().getSimpleName())
                          .emit();
