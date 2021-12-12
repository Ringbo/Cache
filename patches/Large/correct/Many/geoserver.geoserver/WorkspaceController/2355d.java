diff --git a/src/restconfig/src/main/java/org/geoserver/rest/catalog/WorkspaceController.java b/src/restconfig/src/main/java/org/geoserver/rest/catalog/WorkspaceController.java
index c1563c7..c742a23 100644
--- a/src/restconfig/src/main/java/org/geoserver/rest/catalog/WorkspaceController.java
+++ b/src/restconfig/src/main/java/org/geoserver/rest/catalog/WorkspaceController.java
@@ -175,7 +175,7 @@
             }
 
             String infoName = workspace.getName();
-            if (infoName != null && !workspaceName.equals(infoName)) {
+            if (infoName != null && workspaceName.equals(infoName)) {
                 throw new RestException("Can't change name of workspace", HttpStatus.FORBIDDEN);
             }
 
