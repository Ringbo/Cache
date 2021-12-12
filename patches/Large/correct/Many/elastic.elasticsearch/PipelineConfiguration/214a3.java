diff --git a/core/src/main/java/org/elasticsearch/ingest/PipelineConfiguration.java b/core/src/main/java/org/elasticsearch/ingest/PipelineConfiguration.java
index 3e874a0..d58d76f 100644
--- a/core/src/main/java/org/elasticsearch/ingest/PipelineConfiguration.java
+++ b/core/src/main/java/org/elasticsearch/ingest/PipelineConfiguration.java
@@ -118,7 +118,7 @@
     }
 
     public static PipelineConfiguration readFrom(StreamInput in) throws IOException {
-        if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             return new PipelineConfiguration(in.readString(), in.readBytesReference(), XContentType.readFrom(in));
         } else {
             final String id = in.readString();
@@ -135,7 +135,7 @@
     public void writeTo(StreamOutput out) throws IOException {
         out.writeString(id);
         out.writeBytesReference(config);
-        if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType.writeTo(out);
         }
     }
