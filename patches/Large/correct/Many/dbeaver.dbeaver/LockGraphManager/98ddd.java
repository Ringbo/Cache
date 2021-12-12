diff --git a/plugins/org.jkiss.dbeaver.ext.ui.locks/src/org/jkiss/dbeaver/ext/ui/locks/manage/LockGraphManager.java b/plugins/org.jkiss.dbeaver.ext.ui.locks/src/org/jkiss/dbeaver/ext/ui/locks/manage/LockGraphManager.java
index 24c9111..a5835c5 100644
--- a/plugins/org.jkiss.dbeaver.ext.ui.locks/src/org/jkiss/dbeaver/ext/ui/locks/manage/LockGraphManager.java
+++ b/plugins/org.jkiss.dbeaver.ext.ui.locks/src/org/jkiss/dbeaver/ext/ui/locks/manage/LockGraphManager.java
@@ -174,7 +174,7 @@
 		
 		for(LOCK_TYPE root : roots) {
 			
-			if (root.waitThis().size() >= 0)
+			if (root.waitThis().size() > 0)
 			createGraph(root);
 		}
 		
