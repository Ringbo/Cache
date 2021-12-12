diff --git a/BroadleafCommerce/BroadleafCommerceAdmin/src/main/java/org/broadleafcommerce/admin/catalog/service/AdminCatalogService.java b/BroadleafCommerce/BroadleafCommerceAdmin/src/main/java/org/broadleafcommerce/admin/catalog/service/AdminCatalogService.java
index ac45dad..6cd7f40 100644
--- a/BroadleafCommerce/BroadleafCommerceAdmin/src/main/java/org/broadleafcommerce/admin/catalog/service/AdminCatalogService.java
+++ b/BroadleafCommerce/BroadleafCommerceAdmin/src/main/java/org/broadleafcommerce/admin/catalog/service/AdminCatalogService.java
@@ -123,7 +123,7 @@
         	}
         	index++;
         }
-        if(cat.getAllParentCategories().indexOf(cat.getDefaultParentCategory()) < 0){
+        if(cat.getDefaultParentCategory() != null && cat.getAllParentCategories().indexOf(cat.getDefaultParentCategory()) < 0){
 //        	cat.getAllParentCategories().add(cat.getDefaultParentCategory());
         	cat.getDefaultParentCategory().getAllChildCategories().add(cat);
         	catalogService.saveCategory(cat.getDefaultParentCategory());
