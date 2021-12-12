diff --git a/server/src/test/java/org/elasticsearch/persistent/TestPersistentActionPlugin.java b/server/src/test/java/org/elasticsearch/persistent/TestPersistentActionPlugin.java
index f0a1bea..6e94e36 100644
--- a/server/src/test/java/org/elasticsearch/persistent/TestPersistentActionPlugin.java
+++ b/server/src/test/java/org/elasticsearch/persistent/TestPersistentActionPlugin.java
@@ -436,11 +436,11 @@
 
     static class TestTaskResponse implements Writeable {
 
-        public TestTaskResponse() {
+        TestTaskResponse() {
 
         }
 
-        public TestTaskResponse(StreamInput in) throws IOException {
+        TestTaskResponse(StreamInput in) throws IOException {
             in.readBoolean();
         }
 
