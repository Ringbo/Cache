diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java
index a51ab71..8042693 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java
@@ -540,7 +540,7 @@
                     }
 
                     // This is the entire tree of every category defined on the product
-                    buildFullCategoryHierarchy(document, cache, categoryId);
+                    buildFullCategoryHierarchy(document, cache, categoryId, new HashSet<Long>());
                 }
             }
         } finally {
