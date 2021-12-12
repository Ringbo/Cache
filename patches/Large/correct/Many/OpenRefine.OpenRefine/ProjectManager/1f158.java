diff --git a/main/src/com/google/refine/ProjectManager.java b/main/src/com/google/refine/ProjectManager.java
index c9743dd..284b347 100644
--- a/main/src/com/google/refine/ProjectManager.java
+++ b/main/src/com/google/refine/ProjectManager.java
@@ -212,7 +212,10 @@
 
                 if (project != null) {
                     boolean hasUnsavedChanges =
-                        metadata.getModified().getTime() > project.getLastSave().getTime();
+                        metadata.getModified().getTime() >= project.getLastSave().getTime();
+                    // We use >= instead of just > to avoid the case where a newly created project
+                    // has the same modified and last save times, resulting in the project not getting
+                    // saved at all.
 
                     if (hasUnsavedChanges) {
                         long msecsOverdue = startTimeOfSave.getTime() - project.getLastSave().getTime();
