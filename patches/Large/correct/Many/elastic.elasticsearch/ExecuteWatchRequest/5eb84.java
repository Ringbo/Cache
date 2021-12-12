diff --git a/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/execute/ExecuteWatchRequest.java b/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/execute/ExecuteWatchRequest.java
index adb93e8..b0e1696 100644
--- a/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/execute/ExecuteWatchRequest.java
+++ b/plugin/src/main/java/org/elasticsearch/xpack/watcher/transport/actions/execute/ExecuteWatchRequest.java
@@ -250,7 +250,7 @@
         }
         if (in.readBoolean()) {
             watchSource = in.readBytesReference();
-            if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+            if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                 xContentType = XContentType.readFrom(in);
             } else {
                 xContentType = XContentFactory.xContentType(watchSource);
@@ -282,7 +282,7 @@
         out.writeBoolean(watchSource != null);
         if (watchSource != null) {
             out.writeBytesReference(watchSource);
-            if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+            if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                 xContentType.writeTo(out);
             }
         }
