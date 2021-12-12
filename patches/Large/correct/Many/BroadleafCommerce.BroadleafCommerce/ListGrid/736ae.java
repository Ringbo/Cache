diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/form/component/ListGrid.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/form/component/ListGrid.java
index 90168b0..4d4dce5 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/form/component/ListGrid.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/form/component/ListGrid.java
@@ -405,7 +405,7 @@
     }
     
     public Boolean getHideIdColumn() {
-        return hideIdColumn == null ? false : hideIdColumn;
+        return hideIdColumn == null ? true : hideIdColumn;
     }
 
     /* ************************** */
