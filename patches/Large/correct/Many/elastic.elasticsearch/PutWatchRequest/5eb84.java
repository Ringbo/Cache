diff --git a/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/put/PutWatchRequest.java b/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/put/PutWatchRequest.java
index 8112008..8ec809d 100644
--- a/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/put/PutWatchRequest.java
+++ b/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/put/PutWatchRequest.java
@@ -140,7 +140,7 @@
         id = in.readString();
         source = in.readBytesReference();
         active = in.readBoolean();
-        if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType = XContentType.readFrom(in);
         } else {
             xContentType = XContentFactory.xContentType(source);
@@ -153,7 +153,7 @@
         out.writeString(id);
         out.writeBytesReference(source);
         out.writeBoolean(active);
-        if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             xContentType.writeTo(out);
         }
     }
