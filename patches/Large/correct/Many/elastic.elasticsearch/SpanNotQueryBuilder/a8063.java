diff --git a/src/main/java/org/elasticsearch/index/query/SpanNotQueryBuilder.java b/src/main/java/org/elasticsearch/index/query/SpanNotQueryBuilder.java
index b339db4..c9357ba 100644
--- a/src/main/java/org/elasticsearch/index/query/SpanNotQueryBuilder.java
+++ b/src/main/java/org/elasticsearch/index/query/SpanNotQueryBuilder.java
@@ -62,7 +62,7 @@
         include.toXContent(builder, params);
         builder.field("exclude");
         exclude.toXContent(builder, params);
-        if (boost == -1) {
+        if (boost != -1) {
             builder.field("boost", boost);
         }
         builder.endObject();
