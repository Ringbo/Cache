diff --git a/solr/src/java/org/apache/solr/handler/component/PivotFacetHelper.java b/solr/src/java/org/apache/solr/handler/component/PivotFacetHelper.java
index b47be4f..c00add5 100644
--- a/solr/src/java/org/apache/solr/handler/component/PivotFacetHelper.java
+++ b/solr/src/java/org/apache/solr/handler/component/PivotFacetHelper.java
@@ -102,7 +102,7 @@
     List<NamedList<Object>> values = new ArrayList<NamedList<Object>>( superFacets.size() );
     for (Map.Entry<String, Integer> kv : superFacets) {
       // Only sub-facet if parent facet has positive count - still may not be any values for the sub-field though
-      if (kv.getValue() > minMatch ) {
+      if (kv.getValue() >= minMatch ) {
         // don't reuse the same BytesRef  each time since we will be constructing Term
         // objects that will most likely be cached.
         BytesRef termval = new BytesRef();
@@ -122,7 +122,7 @@
           SimpleFacets sf = getFacetImplementation(rb.req, subset, rb.req.getParams());
           
           NamedList<Integer> nl = sf.getTermCounts(subField);
-          if (nl.size() > minMatch ) {
+          if (nl.size() >= minMatch ) {
             pivot.add( "pivot", doPivots( nl, subField, nextField, fnames, rb, subset, minMatch ) );
             values.add( pivot ); // only add response if there are some counts
           }
