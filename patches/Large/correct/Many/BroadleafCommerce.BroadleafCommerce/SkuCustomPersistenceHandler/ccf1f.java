diff --git a/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java b/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java
index 09d91a1..5c88937 100644
--- a/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java
+++ b/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java
@@ -266,7 +266,7 @@
         //but there's a bug preventing this behavior from completely working correctly
         List<String> removeKeys = new ArrayList<String>();
         for (Map.Entry<String, FieldMetadata> entry : map.entrySet()) {
-            if (entry.getKey().contains("defaultProduct.")) {
+            if (entry.getKey().contains("defaultProduct.") || entry.getKey().contains("product.")) {
                 removeKeys.add(entry.getKey());
             }
         }
