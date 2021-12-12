diff --git a/plugins/git4idea/src/git4idea/rebase/GitRebaseLineListener.java b/plugins/git4idea/src/git4idea/rebase/GitRebaseLineListener.java
index b5ab7ce..62aabee 100644
--- a/plugins/git4idea/src/git4idea/rebase/GitRebaseLineListener.java
+++ b/plugins/git4idea/src/git4idea/rebase/GitRebaseLineListener.java
@@ -61,7 +61,7 @@
         assert myStatus == null;
         myStatus = Status.FINISHED;
       }
-      else if (line.startsWith("Automatic cherry-pick failed. ")) {
+      else if (line.startsWith("Automatic cherry-pick failed") || line.startsWith("When you have resolved this problem")) {
         assert myStatus == null || myStatus == Status.ERROR;
         myStatus = Status.CONFLICT;
       }
@@ -69,7 +69,7 @@
         assert myStatus == null;
         myStatus = myProgressLine == null ? Status.CANCELLED : Status.ERROR;
       }
-      else if (line.startsWith("fatal") || line.startsWith("error: ")) {
+      else if (line.startsWith("fatal") || line.startsWith("error: ") || line.startsWith("Cannot rebase")) {
         if (myStatus != Status.CONFLICT) {
           myStatus = Status.ERROR;
         }
@@ -97,7 +97,7 @@
     else {
       total = current = 0;
     }
-    return new Result(myStatus == null ? Status.ERROR : myStatus, total, current);
+    return new Result(myStatus == null ? Status.FINISHED : myStatus, total, current);
   }
 
   /**
