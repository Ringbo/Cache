diff --git a/src/test/java/org/elasticsearch/stresstest/fullrestart/FullRestartStressTest.java b/src/test/java/org/elasticsearch/stresstest/fullrestart/FullRestartStressTest.java
index 151d644..1d15e89 100644
--- a/src/test/java/org/elasticsearch/stresstest/fullrestart/FullRestartStressTest.java
+++ b/src/test/java/org/elasticsearch/stresstest/fullrestart/FullRestartStressTest.java
@@ -172,7 +172,7 @@
             for (int b = 0; b < numberOfBulks; b++) {
                 BulkRequestBuilder bulk = client.client().prepareBulk();
                 for (int k = 0; k < bulkSize; k++) {
-                    StringBuffer sb = new StringBuffer();
+                    StringBuilder sb = new StringBuilder();
                     XContentBuilder json = XContentFactory.jsonBuilder().startObject()
                             .field("field", "value" + ThreadLocalRandom.current().nextInt());
 
