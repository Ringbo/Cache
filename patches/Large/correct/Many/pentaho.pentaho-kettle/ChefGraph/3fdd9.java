diff --git a/src/be/ibridge/kettle/chef/ChefGraph.java b/src/be/ibridge/kettle/chef/ChefGraph.java
index 51a549b..a6cda53 100644
--- a/src/be/ibridge/kettle/chef/ChefGraph.java
+++ b/src/be/ibridge/kettle/chef/ChefGraph.java
@@ -1507,7 +1507,7 @@
                 
 				newJobMeta.setFilename( exactFilename );
                 newJobMeta.clearChanged();
-                spoon.addChefGraph(jobMeta);
+                spoon.addChefGraph(newJobMeta);
 			}
 			catch(Throwable e)
 			{
