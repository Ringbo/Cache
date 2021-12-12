diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/TestPersistentActionPlugin.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/TestPersistentActionPlugin.java
index fdba169..fdd5eac 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/TestPersistentActionPlugin.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/TestPersistentActionPlugin.java
@@ -422,11 +422,11 @@
 
     static class TestTaskResponse implements Writeable {
 
-        public TestTaskResponse() {
+        TestTaskResponse() {
 
         }
 
-        public TestTaskResponse(StreamInput in) throws IOException {
+        TestTaskResponse(StreamInput in) throws IOException {
             in.readBoolean();
         }
 
