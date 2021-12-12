diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/setup/AppController.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/setup/AppController.java
index 915d9ac..8b07a2f 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/setup/AppController.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/setup/AppController.java
@@ -100,7 +100,7 @@
 
         for (String sectionTitle : pages.keySet()){
 	        if (SecurityManager.getInstance().isUserAuthorizedToViewSection(pages.get(sectionTitle)[0])){
-                buildHistoryNewItem(pageKey);
+                buildHistoryNewItem(sectionTitle);
 			    break;
 	    	}
 		}
