diff --git a/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/datastore/DatastoreV1.java b/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/datastore/DatastoreV1.java
index 5843333..04f02fc 100644
--- a/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/datastore/DatastoreV1.java
+++ b/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/datastore/DatastoreV1.java
@@ -737,7 +737,8 @@
 
       @StartBundle
       public void startBundle(StartBundleContext c) throws Exception {
-        datastore = datastoreFactory.getDatastore(c.getPipelineOptions(), v1Options.getProjectId());
+        datastore = datastoreFactory.getDatastore(c.getPipelineOptions(), v1Options.getProjectId(),
+                v1Options.getLocalhost());
       }
 
       @ProcessElement
