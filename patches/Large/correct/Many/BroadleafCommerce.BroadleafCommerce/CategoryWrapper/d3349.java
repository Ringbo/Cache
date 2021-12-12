diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/CategoryWrapper.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/CategoryWrapper.java
index 63315f0..410c470 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/CategoryWrapper.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/CategoryWrapper.java
@@ -111,7 +111,7 @@
             categoryAttributes = new ArrayList<CategoryAttributeWrapper>();
             for (CategoryAttribute attribute : category.getCategoryAttributes()) {
                 CategoryAttributeWrapper wrapper = (CategoryAttributeWrapper) context.getBean(CategoryAttributeWrapper.class.getName());
-                wrapper.wrapDetails(attribute, request);
+                wrapper.wrapSummary(attribute, request);
                 categoryAttributes.add(wrapper);
             }
         }
