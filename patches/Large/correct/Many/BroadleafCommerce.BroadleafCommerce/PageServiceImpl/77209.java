diff --git a/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java b/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java
index bfa19a3..b041bed 100644
--- a/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java
+++ b/admin/broadleaf-contentmanagement-module/src/main/java/org/broadleafcommerce/cms/page/service/PageServiceImpl.java
@@ -260,7 +260,7 @@
         // First check to see if we have a page that matches on the full locale.
         for(PageDTO page : pageDTOList) {
             if (locale != null && locale.getLocaleCode() != null) {
-                if (page.getLocaleCode().equals(locale.getLocaleCode())) {
+                if (locale.getLocaleCode().equals(page.getLocaleCode())) {
                     if (passesPageRules(page, ruleDTOs)) {
                         return page;
                     }
