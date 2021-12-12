diff --git a/solr/core/src/java/org/apache/solr/spelling/suggest/fst/AnalyzingInfixLookupFactory.java b/solr/core/src/java/org/apache/solr/spelling/suggest/fst/AnalyzingInfixLookupFactory.java
index c37219b..49edb60 100644
--- a/solr/core/src/java/org/apache/solr/spelling/suggest/fst/AnalyzingInfixLookupFactory.java
+++ b/solr/core/src/java/org/apache/solr/spelling/suggest/fst/AnalyzingInfixLookupFactory.java
@@ -135,7 +135,7 @@
         }
         };
     } catch (IOException e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e);
     }
   }
 
