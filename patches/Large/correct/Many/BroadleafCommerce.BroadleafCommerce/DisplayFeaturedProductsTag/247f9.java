diff --git a/BroadleafCommerce/BroadleafCommerceFrameworkWeb/src/main/java/org/broadleafcommerce/catalog/web/taglib/DisplayFeaturedProductsTag.java b/BroadleafCommerce/BroadleafCommerceFrameworkWeb/src/main/java/org/broadleafcommerce/catalog/web/taglib/DisplayFeaturedProductsTag.java
index 9e77e72..1f34dfd 100644
--- a/BroadleafCommerce/BroadleafCommerceFrameworkWeb/src/main/java/org/broadleafcommerce/catalog/web/taglib/DisplayFeaturedProductsTag.java
+++ b/BroadleafCommerce/BroadleafCommerceFrameworkWeb/src/main/java/org/broadleafcommerce/catalog/web/taglib/DisplayFeaturedProductsTag.java
@@ -50,7 +50,7 @@
 	    	
 	    	while (i.hasNext()) {
 	    		Product p = i.next();
-	    		if (p.getIsFeaturedProduct()) {
+	    		if (p.isFeaturedProduct()) {
 	    			featuredProducts.add(p);
 	    		}
 	    	}
