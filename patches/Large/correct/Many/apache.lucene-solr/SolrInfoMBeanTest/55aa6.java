diff --git a/solr/src/test/org/apache/solr/SolrInfoMBeanTest.java b/solr/src/test/org/apache/solr/SolrInfoMBeanTest.java
index 7a1063c..b625a0e 100644
--- a/solr/src/test/org/apache/solr/SolrInfoMBeanTest.java
+++ b/solr/src/test/org/apache/solr/SolrInfoMBeanTest.java
@@ -89,7 +89,7 @@
     String path = pckgname.replace('.', '/');
     Enumeration<URL> resources = cld.getResources(path);
     while (resources.hasMoreElements()) {
-      directories.add(new File(resources.nextElement().getPath()));
+      directories.add(new File(resources.nextElement().toURI()));
     }
       
     ArrayList<Class> classes = new ArrayList<Class>();
