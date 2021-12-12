diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java
index 249f727..0cc4e6e 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrIndexServiceImpl.java
@@ -302,7 +302,7 @@
                     }
                 }
             } catch (Exception e) {
-                LOG.trace("Could not get value for property[" + field.getQualifiedFieldName() + "] for product id["
+                LOG.error("Could not get value for property[" + field.getQualifiedFieldName() + "] for product id["
                         + product.getId() + "]", e);
             }
         }
