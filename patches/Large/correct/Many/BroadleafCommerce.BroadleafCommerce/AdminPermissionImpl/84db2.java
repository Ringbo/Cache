diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/security/domain/AdminPermissionImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/security/domain/AdminPermissionImpl.java
index 12ded9c..38e93b1 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/security/domain/AdminPermissionImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/security/domain/AdminPermissionImpl.java
@@ -271,7 +271,7 @@
                 childPermissions.add(permission);
             }
         }
-        return allChildPermissions;
+        return childPermissions;
     }
 
     @Override
