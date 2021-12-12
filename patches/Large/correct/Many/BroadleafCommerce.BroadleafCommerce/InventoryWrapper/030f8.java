diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/InventoryWrapper.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/InventoryWrapper.java
index f65400b..c6c966c 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/InventoryWrapper.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/InventoryWrapper.java
@@ -51,6 +51,6 @@
     }
 
     public void wrapSummary(Sku sku, Integer quantity, HttpServletRequest request) {
-        wrapDetails(sku, quantityAvailable, request);
+        wrapDetails(sku, quantity, request);
     }
 }
