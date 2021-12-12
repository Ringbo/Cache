diff --git a/controller/src/main/java/org/jboss/as/controller/services/path/PathManagerService.java b/controller/src/main/java/org/jboss/as/controller/services/path/PathManagerService.java
index 61dfea3..e5d4bd6 100644
--- a/controller/src/main/java/org/jboss/as/controller/services/path/PathManagerService.java
+++ b/controller/src/main/java/org/jboss/as/controller/services/path/PathManagerService.java
@@ -88,7 +88,7 @@
             synchronized (pathEntries) {
                 pathEntry = pathEntries.get(relativeTo);
                 if (pathEntry == null) {
-                    throw MESSAGES.pathEntryNotFound(path);
+                    throw MESSAGES.pathEntryNotFound(relativeTo);
                 }
                 return RelativePathService.doResolve(pathEntry.resolvePath(), path);
             }
