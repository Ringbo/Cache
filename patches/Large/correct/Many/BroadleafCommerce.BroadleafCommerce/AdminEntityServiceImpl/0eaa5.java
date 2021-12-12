diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/AdminEntityServiceImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/AdminEntityServiceImpl.java
index 3383c9d..1bd3979 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/AdminEntityServiceImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/AdminEntityServiceImpl.java
@@ -422,7 +422,7 @@
                     tab.setOrder(tabOrder);
                     tabMap.put(tab.getTitle(), tab);
                     drs.setUnselectedTabMetadata(tabMap);
-                    drs.setTotalRecords(1);
+                    drs.setTotalRecords(0);
                     drs.setStartIndex(0);
                     drs.setBatchId(1);
                     drs.setClassMetaData(null);
