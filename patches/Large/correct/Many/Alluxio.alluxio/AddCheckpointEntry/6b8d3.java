diff --git a/servers/src/main/java/tachyon/master/file/journal/AddCheckpointEntry.java b/servers/src/main/java/tachyon/master/file/journal/AddCheckpointEntry.java
index 7061cb6..cecbef8 100644
--- a/servers/src/main/java/tachyon/master/file/journal/AddCheckpointEntry.java
+++ b/servers/src/main/java/tachyon/master/file/journal/AddCheckpointEntry.java
@@ -35,7 +35,7 @@
     mWorkerId = workerId;
     mFileId = fileId;
     mLength = length;
-    mCheckpointPath = checkpointPath.getPath();
+    mCheckpointPath = checkpointPath.toString();
     mOpTimeMs = opTimeMs;
   }
 
