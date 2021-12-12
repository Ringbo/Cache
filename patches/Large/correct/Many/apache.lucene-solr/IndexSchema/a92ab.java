diff --git a/src/java/org/apache/solr/schema/IndexSchema.java b/src/java/org/apache/solr/schema/IndexSchema.java
index 32da051..539af49 100644
--- a/src/java/org/apache/solr/schema/IndexSchema.java
+++ b/src/java/org/apache/solr/schema/IndexSchema.java
@@ -553,7 +553,7 @@
     } catch(Exception e) {
       // unexpected exception...
       SolrConfig.severeErrors.add( e );
-      throw new SolrException(1,"Schema Parsing Failed",e,false);
+      throw new SolrException(500,"Schema Parsing Failed",e,false);
     }
 
      analyzer = new SolrIndexAnalyzer();
@@ -588,7 +588,7 @@
     NodeList nList = (NodeList)xpath.evaluate("./filter", node, XPathConstants.NODESET);
 
     if (tokNode==null){
-      throw new SolrException(1,"analyzer without class or tokenizer & filter list");
+      throw new SolrException(500,"analyzer without class or tokenizer & filter list");
     }
     TokenizerFactory tfac = readTokenizerFactory(tokNode);
 
@@ -598,7 +598,7 @@
     NodeList nList = node.getChildNodes();
     TokenizerFactory tfac = readTokenizerFactory(nList.item(0));
      if (tfac==null) {
-       throw new SolrException(1,"TokenizerFactory must be specified first in analyzer");
+       throw new SolrException(500,"TokenizerFactory must be specified first in analyzer");
      }
     ******/
 
