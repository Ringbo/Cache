diff --git a/graylog2-server/src/main/java/org/graylog2/outputs/DiscardMessageOutput.java b/graylog2-server/src/main/java/org/graylog2/outputs/DiscardMessageOutput.java
index eef07ce..4d3e1c6 100644
--- a/graylog2-server/src/main/java/org/graylog2/outputs/DiscardMessageOutput.java
+++ b/graylog2-server/src/main/java/org/graylog2/outputs/DiscardMessageOutput.java
@@ -81,9 +81,9 @@
         messagesDiscarded.mark(messages.size());
     }
 
-    public interface Factory extends MessageOutput.Factory<GelfOutput> {
+    public interface Factory extends MessageOutput.Factory<DiscardMessageOutput> {
         @Override
-        GelfOutput create(Stream stream, Configuration configuration);
+        DiscardMessageOutput create(Stream stream, Configuration configuration);
 
         @Override
         Config getConfig();
