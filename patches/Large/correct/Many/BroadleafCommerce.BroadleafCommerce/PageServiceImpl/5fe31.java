diff --git a/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java b/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java
index 49c9ed2..9fda605 100644
--- a/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java
+++ b/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java
@@ -622,7 +622,7 @@
     
     private List<PageDTO> getPageListFromCache(String key) {
         Element cacheElement = getPageCache().get(key);
-        if (cacheElement != null) {
+        if (cacheElement != null && cacheElement.getValue() != null) {
             return (List<PageDTO>) getPageCache().get(key).getValue();
         }
         return null;
