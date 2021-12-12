diff --git a/core/src/main/java/org/elasticsearch/action/termvectors/TermVectorsRequest.java b/core/src/main/java/org/elasticsearch/action/termvectors/TermVectorsRequest.java
index cba14fe..de2577f 100644
--- a/core/src/main/java/org/elasticsearch/action/termvectors/TermVectorsRequest.java
+++ b/core/src/main/java/org/elasticsearch/action/termvectors/TermVectorsRequest.java
@@ -499,7 +499,7 @@
 
         if (in.readBoolean()) {
             doc = in.readBytesReference();
-            if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+            if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                 xContentType = XContentType.readFrom(in);
             } else {
                 xContentType = XContentFactory.xContentType(doc);
@@ -544,7 +544,7 @@
         out.writeBoolean(doc != null);
         if (doc != null) {
             out.writeBytesReference(doc);
-            if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+            if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                 xContentType.writeTo(out);
             }
         }
