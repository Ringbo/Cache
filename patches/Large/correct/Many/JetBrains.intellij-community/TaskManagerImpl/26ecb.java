diff --git a/plugins/tasks/tasks-core/src/com/intellij/tasks/impl/TaskManagerImpl.java b/plugins/tasks/tasks-core/src/com/intellij/tasks/impl/TaskManagerImpl.java
index 80d0e52..72eb5e6 100644
--- a/plugins/tasks/tasks-core/src/com/intellij/tasks/impl/TaskManagerImpl.java
+++ b/plugins/tasks/tasks-core/src/com/intellij/tasks/impl/TaskManagerImpl.java
@@ -145,7 +145,7 @@
               associatedTask.setUpdated(new Date());
               activateTask(associatedTask, true, false);              
             }
-          });
+          }, myProject.getDisposed());
           return;
         }
 
