diff --git a/core/src/main/java/org/elasticsearch/index/query/MoreLikeThisQueryBuilder.java b/core/src/main/java/org/elasticsearch/index/query/MoreLikeThisQueryBuilder.java
index ee0eff2..9f083ea 100644
--- a/core/src/main/java/org/elasticsearch/index/query/MoreLikeThisQueryBuilder.java
+++ b/core/src/main/java/org/elasticsearch/index/query/MoreLikeThisQueryBuilder.java
@@ -228,7 +228,7 @@
             type = in.readOptionalString();
             if (in.readBoolean()) {
                 doc = (BytesReference) in.readGenericValue();
-                if (in.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+                if (in.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                     xContentType = XContentType.readFrom(in);
                 } else {
                     xContentType = XContentFactory.xContentType(doc);
@@ -250,7 +250,7 @@
             out.writeBoolean(doc != null);
             if (doc != null) {
                 out.writeGenericValue(doc);
-                if (out.getVersion().after(Version.V_5_3_0_UNRELEASED)) { // TODO update to onOrAfter after backporting
+                if (out.getVersion().onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                     xContentType.writeTo(out);
                 }
             } else {
