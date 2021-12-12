diff --git a/src/be/ibridge/kettle/job/JobMeta.java b/src/be/ibridge/kettle/job/JobMeta.java
index 6875667..1dbe21c 100644
--- a/src/be/ibridge/kettle/job/JobMeta.java
+++ b/src/be/ibridge/kettle/job/JobMeta.java
@@ -673,7 +673,7 @@
             // Read objects from the shared XML file & the repository
             try
             {
-                sharedObjectsFile = XMLHandler.getTagValue(jobnode, "info", "shared_objects_file"); //$NON-NLS-1$ //$NON-NLS-2$
+                sharedObjectsFile = XMLHandler.getTagValue(jobnode, "shared_objects_file"); //$NON-NLS-1$ //$NON-NLS-2$
                 readSharedObjects(rep);
             }
             catch(Exception e)
