diff --git a/solr/contrib/extraction/src/java/org/apache/solr/handler/extraction/RegexRulesPasswordProvider.java b/solr/contrib/extraction/src/java/org/apache/solr/handler/extraction/RegexRulesPasswordProvider.java
index 8e30d1a..e67efad 100644
--- a/solr/contrib/extraction/src/java/org/apache/solr/handler/extraction/RegexRulesPasswordProvider.java
+++ b/solr/contrib/extraction/src/java/org/apache/solr/handler/extraction/RegexRulesPasswordProvider.java
@@ -103,7 +103,7 @@
       }
       is.close();
     } catch (IOException e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e);
     }
     return rules;
   }
