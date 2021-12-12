diff --git a/qa/no-bootstrap-tests/src/test/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelperNoBootstrapTests.java b/qa/no-bootstrap-tests/src/test/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelperNoBootstrapTests.java
index 556389a..b03c791 100644
--- a/qa/no-bootstrap-tests/src/test/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelperNoBootstrapTests.java
+++ b/qa/no-bootstrap-tests/src/test/java/org/elasticsearch/xpack/ml/utils/NamedPipeHelperNoBootstrapTests.java
@@ -196,7 +196,7 @@
         private String line;
         private Exception exception;
 
-        public PipeReaderServer(String pipeName) {
+        PipeReaderServer(String pipeName) {
             this.pipeName = pipeName;
         }
 
@@ -235,7 +235,7 @@
         private String line;
         private Exception exception;
 
-        public PipeWriterServer(String pipeName, String line) {
+        PipeWriterServer(String pipeName, String line) {
             this.pipeName = pipeName;
             this.line = line;
         }
