diff --git a/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java b/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java
index 56637ff..c582c1d 100644
--- a/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java
+++ b/domain/src/com/thoughtworks/go/domain/materials/perforce/P4MaterialUpdater.java
@@ -78,7 +78,7 @@
 
     private BuildCommand constructClient(String workingDir, String clientName) {
         String clientArgs = "Client: " + clientName + "\n\n"
-                + "Root: " + new File(workingDir).getAbsolutePath() + "\n\n"
+                + "Root: " + workingDir + "\n\n"
                 + "Options: clobber rmdir\n\n"
                 + "LineEnd: local\n\n"
                 + "View:\n"
@@ -87,7 +87,7 @@
     }
 
     private BuildCommand sync(String workingDir, String revision) {
-        return exec("p4", "-d", workingDir, "sync", "@" + parseLong(revision)).setCommandEnvVars(envVars());
+        return exec("p4", "-d", workingDir, "sync", "-f", "@" + parseLong(revision)).setCommandEnvVars(envVars());
     }
 
     private BuildCommand cleanWorkingDir(String workingDir) {
