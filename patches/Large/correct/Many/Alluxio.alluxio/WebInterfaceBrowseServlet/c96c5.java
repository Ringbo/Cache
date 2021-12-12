diff --git a/main/src/main/java/tachyon/web/WebInterfaceBrowseServlet.java b/main/src/main/java/tachyon/web/WebInterfaceBrowseServlet.java
index d2294f9..8a0555f 100644
--- a/main/src/main/java/tachyon/web/WebInterfaceBrowseServlet.java
+++ b/main/src/main/java/tachyon/web/WebInterfaceBrowseServlet.java
@@ -180,7 +180,7 @@
     request.setAttribute("invalidPathError", "");
     List<ClientFileInfo> filesInfo = null;
     String currentPath = request.getParameter("path");
-    if (currentPath.isEmpty()) {
+    if (currentPath == null || currentPath.isEmpty()) {
       currentPath = Constants.PATH_SEPARATOR;
     }
     request.setAttribute("currentPath", currentPath);
