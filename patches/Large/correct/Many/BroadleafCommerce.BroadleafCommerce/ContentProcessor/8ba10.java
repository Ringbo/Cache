diff --git a/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/web/processor/ContentProcessor.java b/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/web/processor/ContentProcessor.java
index 9ae49cc..a3387d8 100644
--- a/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/web/processor/ContentProcessor.java
+++ b/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/web/processor/ContentProcessor.java
@@ -174,7 +174,7 @@
         contentItems = getContentItems(contentName, maxResults, request, mvelParameters, currentSandbox, structuredContentType, locale, extensionFieldName, extensionFieldValue, arguments, element);
                             
         if (contentItems.size() > 0) {
-            List<Map<String,String>> contentItemFields = new ArrayList<Map<String, String>>();          
+            List<Map<String,Object>> contentItemFields = new ArrayList<Map<String, Object>>();
             
             for (StructuredContentDTO item : contentItems) {
                 if (StringUtils.isNotEmpty(fieldFilters)) {
