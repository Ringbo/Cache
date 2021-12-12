diff --git a/ProjectAPI/src/org/gephi/project/io/LoadTask.java b/ProjectAPI/src/org/gephi/project/io/LoadTask.java
index 3c25de1..45b1349 100644
--- a/ProjectAPI/src/org/gephi/project/io/LoadTask.java
+++ b/ProjectAPI/src/org/gephi/project/io/LoadTask.java
@@ -56,7 +56,7 @@
     public void run() {
         try {
             Progress.start(progressTicket);
-            Progress.setDisplayName(progressTicket, NbBundle.getMessage(SaveTask.class, "LoadTask.name"));
+            Progress.setDisplayName(progressTicket, NbBundle.getMessage(LoadTask.class, "LoadTask.name"));
             FileObject fileObject = FileUtil.toFileObject(file);
             if (FileUtil.isArchiveFile(fileObject)) {
                 //Unzip
