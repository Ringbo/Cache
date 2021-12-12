diff --git a/job/src/main/java/org/apache/kylin/job/tools/CubeMigrationCLI.java b/job/src/main/java/org/apache/kylin/job/tools/CubeMigrationCLI.java
index e3f7c11..ca756d1 100644
--- a/job/src/main/java/org/apache/kylin/job/tools/CubeMigrationCLI.java
+++ b/job/src/main/java/org/apache/kylin/job/tools/CubeMigrationCLI.java
@@ -76,7 +76,7 @@
 
     public static void main(String[] args) throws IOException, InterruptedException {
 
-        if (args.length != 6) {
+        if (args.length != 7) {
             usage();
             System.exit(1);
         }
@@ -123,7 +123,7 @@
         renameFoldersInHdfs(cube);
         changeHtableHost(cube);
         addCubeIntoProject(cubeName, projectName);
-        if (Boolean.valueOf(copyAcl).booleanValue() == true) {
+        if (Boolean.parseBoolean(copyAcl) == true) {
             copyACL(cube);
         }
 
