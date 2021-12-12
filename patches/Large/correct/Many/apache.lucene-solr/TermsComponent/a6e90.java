diff --git a/solr/src/java/org/apache/solr/handler/component/TermsComponent.java b/solr/src/java/org/apache/solr/handler/component/TermsComponent.java
index c685ec0..dbb7fec 100644
--- a/solr/src/java/org/apache/solr/handler/component/TermsComponent.java
+++ b/solr/src/java/org/apache/solr/handler/component/TermsComponent.java
@@ -72,7 +72,7 @@
       String lowerStr = params.get(TermsParams.TERMS_LOWER, null);
       String[] fields = params.getParams(TermsParams.TERMS_FIELD);
       if (fields != null && fields.length > 0) {
-        NamedList terms = new NamedList();
+        NamedList terms = new SimpleOrderedMap();
         rb.rsp.add("terms", terms);
         int limit = params.getInt(TermsParams.TERMS_LIMIT, 10);
         if (limit < 0) {
