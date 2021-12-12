diff --git a/plugin/src/main/java/org/elasticsearch/xpack/monitoring/action/MonitoringBulkDoc.java b/plugin/src/main/java/org/elasticsearch/xpack/monitoring/action/MonitoringBulkDoc.java
index ce65aa0..abb9cc3 100644
--- a/plugin/src/main/java/org/elasticsearch/xpack/monitoring/action/MonitoringBulkDoc.java
+++ b/plugin/src/main/java/org/elasticsearch/xpack/monitoring/action/MonitoringBulkDoc.java
@@ -48,7 +48,7 @@
         type = in.readOptionalString();
         id = in.readOptionalString();
         source = in.readBytesReference();
-        if (source != BytesArray.EMPTY && in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (source != BytesArray.EMPTY && in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType = XContentType.readFrom(in);
         } else {
             xContentType = XContentFactory.xContentType(source);
@@ -62,8 +62,7 @@
         out.writeOptionalString(type);
         out.writeOptionalString(id);
         out.writeBytesReference(source);
-        if (source != null && source != BytesArray.EMPTY && out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to
-            // onOrAfter after backporting
+        if (source != null && source != BytesArray.EMPTY && out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType.writeTo(out);
         }
     }
