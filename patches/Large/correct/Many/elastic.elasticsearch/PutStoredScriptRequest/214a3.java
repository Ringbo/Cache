diff --git a/core/src/main/java/org/elasticsearch/action/admin/cluster/storedscripts/PutStoredScriptRequest.java b/core/src/main/java/org/elasticsearch/action/admin/cluster/storedscripts/PutStoredScriptRequest.java
index 28c70dc..7488580 100644
--- a/core/src/main/java/org/elasticsearch/action/admin/cluster/storedscripts/PutStoredScriptRequest.java
+++ b/core/src/main/java/org/elasticsearch/action/admin/cluster/storedscripts/PutStoredScriptRequest.java
@@ -137,7 +137,7 @@
 
         id = in.readOptionalString();
         content = in.readBytesReference();
-        if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType = XContentType.readFrom(in);
         } else {
             xContentType = XContentFactory.xContentType(content);
@@ -151,7 +151,7 @@
         out.writeString(lang == null ? "" : lang);
         out.writeOptionalString(id);
         out.writeBytesReference(content);
-        if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType.writeTo(out);
         }
     }
