diff --git a/solr/core/src/java/org/apache/solr/spelling/suggest/FileDictionaryFactory.java b/solr/core/src/java/org/apache/solr/spelling/suggest/FileDictionaryFactory.java
index 07ecb43..1433347 100644
--- a/solr/core/src/java/org/apache/solr/spelling/suggest/FileDictionaryFactory.java
+++ b/solr/core/src/java/org/apache/solr/spelling/suggest/FileDictionaryFactory.java
@@ -55,7 +55,7 @@
       return new FileDictionary(new InputStreamReader(
           core.getResourceLoader().openResource(sourceLocation), StandardCharsets.UTF_8), fieldDelimiter);
     } catch (IOException e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e);
     }
   }
   
