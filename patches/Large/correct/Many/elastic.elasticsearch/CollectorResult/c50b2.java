diff --git a/core/src/main/java/org/elasticsearch/search/profile/CollectorResult.java b/core/src/main/java/org/elasticsearch/search/profile/CollectorResult.java
index 4949c63..8da14d2 100644
--- a/core/src/main/java/org/elasticsearch/search/profile/CollectorResult.java
+++ b/core/src/main/java/org/elasticsearch/search/profile/CollectorResult.java
@@ -123,8 +123,8 @@
     @Override
     public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
         builder = builder.startObject()
-                .field(NAME.getPreferredName(), toString())
-                .field(REASON.getPreferredName(), reason)
+                .field(NAME.getPreferredName(), getName())
+                .field(REASON.getPreferredName(), getReason())
                 .field(TIME.getPreferredName(), String.format(Locale.US, "%.10gms", (double) (getTime() / 1000000.0)));
 
         if (!children.isEmpty()) {
