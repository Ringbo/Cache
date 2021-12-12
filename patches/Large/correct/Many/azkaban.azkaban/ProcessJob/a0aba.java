diff --git a/azkaban-common/src/main/java/azkaban/jobExecutor/ProcessJob.java b/azkaban-common/src/main/java/azkaban/jobExecutor/ProcessJob.java
index 369c3c8..0a4a1fc 100644
--- a/azkaban-common/src/main/java/azkaban/jobExecutor/ProcessJob.java
+++ b/azkaban-common/src/main/java/azkaban/jobExecutor/ProcessJob.java
@@ -386,7 +386,7 @@
    *
    * @param effectiveUser user/proxy user running the job
    */
-  private void assignUserDirOwnership(final String effectiveUser) throws IOException {
+  private void assignUserDirOwnership(final String effectiveUser) throws Exception {
     final ExecuteAsUser executeAsUser = new ExecuteAsUser(
         this.sysProps.getString(AZKABAN_SERVER_NATIVE_LIB_FOLDER));
     final String groupName = this.sysProps.getString(AZKABAN_SERVER_GROUP_NAME, "azkaban");
@@ -395,8 +395,8 @@
     info("Change current working directory ownership to " + effectiveUser + ":" + groupName + ".");
     final int result = executeAsUser.execute("root", changeOwnershipCommand);
     if (result != 0) {
-      error("Failed to change current working directory ownership. Error code: " + Integer
-          .toString(result));
+      handleError("Failed to change current working directory ownership. Error code: " + Integer
+          .toString(result), null);
     }
   }
 
