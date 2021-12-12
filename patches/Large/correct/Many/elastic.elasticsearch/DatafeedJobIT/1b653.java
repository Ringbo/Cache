diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/integration/DatafeedJobIT.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/integration/DatafeedJobIT.java
index 51824ec..e873a14 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/integration/DatafeedJobIT.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/integration/DatafeedJobIT.java
@@ -266,7 +266,7 @@
         private boolean shouldSucceedInput;
         private boolean shouldSucceedProcessing;
 
-        public LookbackOnlyTestHelper(String jobId, String dataIndex) {
+        LookbackOnlyTestHelper(String jobId, String dataIndex) {
             this.jobId = jobId;
             this.dataIndex = dataIndex;
             this.shouldSucceedInput = true;
