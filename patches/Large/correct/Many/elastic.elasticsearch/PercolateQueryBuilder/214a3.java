diff --git a/modules/percolator/src/main/java/org/elasticsearch/percolator/PercolateQueryBuilder.java b/modules/percolator/src/main/java/org/elasticsearch/percolator/PercolateQueryBuilder.java
index 97a65a2..90d7983 100644
--- a/modules/percolator/src/main/java/org/elasticsearch/percolator/PercolateQueryBuilder.java
+++ b/modules/percolator/src/main/java/org/elasticsearch/percolator/PercolateQueryBuilder.java
@@ -184,7 +184,7 @@
         }
         document = in.readOptionalBytesReference();
         if (document != null) {
-            if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+            if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                 documentXContentType = XContentType.readFrom(in);
             } else {
                 documentXContentType = XContentFactory.xContentType(document);
@@ -210,7 +210,7 @@
             out.writeBoolean(false);
         }
         out.writeOptionalBytesReference(document);
-        if (document != null && out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+        if (document != null && out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
             documentXContentType.writeTo(out);
         }
     }
