diff --git a/solr/src/test/org/apache/solr/TestGroupingSearch.java b/solr/src/test/org/apache/solr/TestGroupingSearch.java
index 09ab2a5..2f4775e 100644
--- a/solr/src/test/org/apache/solr/TestGroupingSearch.java
+++ b/solr/src/test/org/apache/solr/TestGroupingSearch.java
@@ -526,8 +526,7 @@
       Map<String,Object> resultSet = new LinkedHashMap<String,Object>();
       group.put("doclist", resultSet);
       resultSet.put("numFound", grp.docs.size());
-      resultSet.put("start", start);
-
+      resultSet.put("start", group_offset);
       List docs = new ArrayList();
       resultSet.put("docs", docs);
       for (int j=group_offset; j<grp.docs.size(); j++) {
