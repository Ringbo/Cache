diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/persistence/BatchedDocumentsIteratorTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/persistence/BatchedDocumentsIteratorTests.java
index 7fcc08f..98ad716 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/persistence/BatchedDocumentsIteratorTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/persistence/BatchedDocumentsIteratorTests.java
@@ -188,7 +188,7 @@
     }
 
     private static class TestIterator extends BatchedDocumentsIterator<String> {
-        public TestIterator(Client client, String jobId) {
+        TestIterator(Client client, String jobId) {
             super(client, jobId);
         }
 
