diff --git a/wsagent/che-core-api-project/src/main/java/org/eclipse/che/api/project/server/ProjectRegistry.java b/wsagent/che-core-api-project/src/main/java/org/eclipse/che/api/project/server/ProjectRegistry.java
index 454645d..0d8bdc9 100644
--- a/wsagent/che-core-api-project/src/main/java/org/eclipse/che/api/project/server/ProjectRegistry.java
+++ b/wsagent/che-core-api-project/src/main/java/org/eclipse/che/api/project/server/ProjectRegistry.java
@@ -344,7 +344,7 @@
         //.che folder is reserved for internal use
         if (!".che".equals(folder.getName())
             && !projects.containsKey(folder.getVirtualFile().getPath().toString())) {
-          putProject(null, folder, true, false);
+          putProject(null, folder, true, true);
         }
       }
     } catch (ServerException e) {
