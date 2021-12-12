diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/UriPropertyValidator.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/UriPropertyValidator.java
index 3a3b640..6075e91 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/UriPropertyValidator.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/UriPropertyValidator.java
@@ -91,7 +91,7 @@
             return new PropertyValidationResult(false, ERROR_KEY_BEGIN_WITH_SLASH);
         }
 
-        if (!allowTrailingSlash && value.endsWith("/")) {
+        if (!allowTrailingSlash && value.endsWith("/") && value.length() > 1) {
             return new PropertyValidationResult(false, ERROR_KEY_CANNOT_END_WITH_SLASH);
         }
 
