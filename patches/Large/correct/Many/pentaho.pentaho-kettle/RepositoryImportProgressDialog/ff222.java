diff --git a/src/be/ibridge/kettle/repository/dialog/RepositoryImportProgressDialog.java b/src/be/ibridge/kettle/repository/dialog/RepositoryImportProgressDialog.java
index 742f210..319dce3 100644
--- a/src/be/ibridge/kettle/repository/dialog/RepositoryImportProgressDialog.java
+++ b/src/be/ibridge/kettle/repository/dialog/RepositoryImportProgressDialog.java
@@ -392,7 +392,7 @@
 																					 );
 							int answer = md.open();
 							overwrite = answer==0;
-							askOverwrite = md.getToggleState();
+							askOverwrite = !md.getToggleState();
 						}
 						
 						if (id<=0 || overwrite)
