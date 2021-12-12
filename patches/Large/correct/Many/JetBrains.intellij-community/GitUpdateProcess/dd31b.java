diff --git a/plugins/git4idea/src/git4idea/update/GitUpdateProcess.java b/plugins/git4idea/src/git4idea/update/GitUpdateProcess.java
index 0602ce7..f857984 100644
--- a/plugins/git4idea/src/git4idea/update/GitUpdateProcess.java
+++ b/plugins/git4idea/src/git4idea/update/GitUpdateProcess.java
@@ -205,7 +205,7 @@
       notifyImportantError(myProject, "Error updating " + rootName,
                            "Updating " + rootName + " failed with an error: " + e.getLocalizedMessage());
     } finally {
-      if (incomplete || !!compoundResult.isSuccess()) {
+      if (incomplete || !compoundResult.isSuccess()) {
         mySaver.notifyLocalChangesAreNotRestored();
       }
       else {
