diff --git a/core/src/main/java/org/elasticsearch/action/ingest/SimulatePipelineRequest.java b/core/src/main/java/org/elasticsearch/action/ingest/SimulatePipelineRequest.java
index 362d2e7..200b83f 100644
--- a/core/src/main/java/org/elasticsearch/action/ingest/SimulatePipelineRequest.java
+++ b/core/src/main/java/org/elasticsearch/action/ingest/SimulatePipelineRequest.java
@@ -103,7 +103,7 @@
         id = in.readOptionalString();
         verbose = in.readBoolean();
         source = in.readBytesReference();
-        if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType = XContentType.readFrom(in);
         } else {
             xContentType = XContentFactory.xContentType(source);
@@ -116,7 +116,7 @@
         out.writeOptionalString(id);
         out.writeBoolean(verbose);
         out.writeBytesReference(source);
-        if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType.writeTo(out);
         }
     }
