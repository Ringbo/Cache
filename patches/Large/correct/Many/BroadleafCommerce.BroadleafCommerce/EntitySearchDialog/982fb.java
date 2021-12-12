diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntitySearchDialog.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntitySearchDialog.java
index a543442..1772bb9 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntitySearchDialog.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntitySearchDialog.java
@@ -47,7 +47,7 @@
 	protected SearchItemSelectedHandler handler;
 
     public EntitySearchDialog(ListGridDataSource dataSource) {
-        this(dataSource, false);
+        this(dataSource, true);
     }
 	
 	public EntitySearchDialog(ListGridDataSource dataSource, boolean autoFetch) {
