diff --git a/src/main/java/org/elasticsearch/index/query/WildcardQueryBuilder.java b/src/main/java/org/elasticsearch/index/query/WildcardQueryBuilder.java
index ddf90e0..01c5469 100644
--- a/src/main/java/org/elasticsearch/index/query/WildcardQueryBuilder.java
+++ b/src/main/java/org/elasticsearch/index/query/WildcardQueryBuilder.java
@@ -76,7 +76,7 @@
     @Override
     public void doXContent(XContentBuilder builder, Params params) throws IOException {
         builder.startObject(WildcardQueryParser.NAME);
-        if (boost == -1 && rewrite != null) {
+        if (boost == -1 && rewrite == null) {
             builder.field(name, wildcard);
         } else {
             builder.startObject(name);
