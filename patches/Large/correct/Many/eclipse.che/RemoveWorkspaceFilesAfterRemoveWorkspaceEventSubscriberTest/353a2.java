diff --git a/plugins/plugin-docker/che-plugin-docker-machine/src/test/java/org/eclipse/che/plugin/docker/machine/cleaner/RemoveWorkspaceFilesAfterRemoveWorkspaceEventSubscriberTest.java b/plugins/plugin-docker/che-plugin-docker-machine/src/test/java/org/eclipse/che/plugin/docker/machine/cleaner/RemoveWorkspaceFilesAfterRemoveWorkspaceEventSubscriberTest.java
index 3eb3f90..251507c 100644
--- a/plugins/plugin-docker/che-plugin-docker-machine/src/test/java/org/eclipse/che/plugin/docker/machine/cleaner/RemoveWorkspaceFilesAfterRemoveWorkspaceEventSubscriberTest.java
+++ b/plugins/plugin-docker/che-plugin-docker-machine/src/test/java/org/eclipse/che/plugin/docker/machine/cleaner/RemoveWorkspaceFilesAfterRemoveWorkspaceEventSubscriberTest.java
@@ -64,6 +64,6 @@
         removeWorkspaceFilesAfterRemoveWorkspaceEventSubscriber.onEvent(event);
 
         verify(event, timeout(2000)).getWorkspace();
-        verify(workspaceFilesCleaner).clear(workspace);
+        verify(workspaceFilesCleaner, timeout(2000)).clear(workspace);
     }
 }
