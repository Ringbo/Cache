diff --git a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java
index e1b7c34..4c70fb9 100644
--- a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java
+++ b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java
@@ -521,7 +521,7 @@
 	
 					if (page3.getRepositoryDirectory() != null)
 					{
-						spoon.saveToRepository(jobMeta);
+						spoon.saveToRepository(jobMeta, false);
 					} else
 					{
 						spoon.saveToFile(jobMeta);
@@ -704,7 +704,7 @@
 						boolean ok;
 						if (spoon.getRepository() != null)
 						{
-							ok = spoon.saveToRepository(transMeta);
+							ok = spoon.saveToRepository(transMeta, false);
 						} else
 						{
 							ok = spoon.saveToFile(transMeta);
