diff --git a/src/java/org/apache/solr/update/UpdateHandler.java b/src/java/org/apache/solr/update/UpdateHandler.java
index b3c66a7..ea3c9c6 100644
--- a/src/java/org/apache/solr/update/UpdateHandler.java
+++ b/src/java/org/apache/solr/update/UpdateHandler.java
@@ -73,7 +73,7 @@
           commitCallbacks.add(listener);
           log.info("added SolrEventListener for postCommit: " + listener);
         } catch (Exception e) {
-          throw new SolrException(1,"error parsing event listevers", e, false);
+          throw new SolrException(500,"error parsing event listevers", e, false);
         }
       }
     }
@@ -88,7 +88,7 @@
           optimizeCallbacks.add(listener);
           log.info("added SolarEventListener for postOptimize: " + listener);
         } catch (Exception e) {
-          throw new SolrException(1,"error parsing event listeners", e, false);
+          throw new SolrException(500,"error parsing event listeners", e, false);
         }
       }
     }
