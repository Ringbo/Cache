diff --git a/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/WorkspaceRuntimes.java b/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/WorkspaceRuntimes.java
index 2cf0add..114cc86 100644
--- a/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/WorkspaceRuntimes.java
+++ b/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/WorkspaceRuntimes.java
@@ -815,7 +815,7 @@
           publishWorkspaceStatusEvent(
               workspaceId,
               STOPPED,
-              RUNNING,
+              status,
               "Error occurs on workspace runtime stop. Error: " + event.getError());
           setAbnormalStopAttributes(workspaceId, event.getError());
         }
@@ -832,7 +832,8 @@
       } catch (NotFoundException | ServerException | ConflictException e) {
         LOG.warn(
             format(
-                "Cannot set error status of the workspace %s. Error is: %s", workspaceId, error));
+                "Cannot set error status of the workspace %s. Error status is: %s. Cause: %s",
+                workspaceId, error, e.getMessage()));
       }
     }
   }
