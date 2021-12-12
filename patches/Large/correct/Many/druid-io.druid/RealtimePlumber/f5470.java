diff --git a/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumber.java b/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumber.java
index 0da1a9a..bf1b575 100644
--- a/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumber.java
+++ b/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumber.java
@@ -356,7 +356,7 @@
               log.makeAlert(e, "Failed to persist merged index[%s]", schema.getDataSource())
                  .addData("interval", interval)
                  .emit();
-              if (!shuttingDown) {
+              if (shuttingDown) {
                 // We're trying to shut down, and this segment failed to push. Let's just get rid of it.
                 // This call will also delete possibly-partially-written files, so we don't need to do it explicitly.
                 abandonSegment(truncatedTime, sink);
