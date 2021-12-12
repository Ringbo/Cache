diff --git a/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/BaseConfiguration.java b/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/BaseConfiguration.java
index 03a8f46..664b2c0 100644
--- a/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/BaseConfiguration.java
+++ b/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/BaseConfiguration.java
@@ -112,7 +112,7 @@
     private int udpRecvBufferSizes = 1048576;
 
     @Parameter("message_journal_enabled")
-    private boolean messageJournalEnabled = false;
+    private boolean messageJournalEnabled = true;
 
     @Parameter("inputbuffer_processors")
     private int inputbufferProcessors = 2;
