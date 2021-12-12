diff --git a/core/src/main/java/org/elasticsearch/action/ingest/PutPipelineRequest.java b/core/src/main/java/org/elasticsearch/action/ingest/PutPipelineRequest.java
index a28950b..f5d5ab2 100644
--- a/core/src/main/java/org/elasticsearch/action/ingest/PutPipelineRequest.java
+++ b/core/src/main/java/org/elasticsearch/action/ingest/PutPipelineRequest.java
@@ -80,7 +80,7 @@
         super.readFrom(in);
         id = in.readString();
         source = in.readBytesReference();
-        if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType = XContentType.readFrom(in);
         } else {
             xContentType = XContentFactory.xContentType(source);
@@ -92,7 +92,7 @@
         super.writeTo(out);
         out.writeString(id);
         out.writeBytesReference(source);
-        if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType.writeTo(out);
         }
     }
