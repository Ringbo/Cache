diff --git a/core/server/src/main/java/alluxio/master/journal/JournalProtoUtils.java b/core/server/src/main/java/alluxio/master/journal/JournalProtoUtils.java
index 782f443..d66355a 100644
--- a/core/server/src/main/java/alluxio/master/journal/JournalProtoUtils.java
+++ b/core/server/src/main/java/alluxio/master/journal/JournalProtoUtils.java
@@ -72,7 +72,7 @@
       case COMPLETE_STORE:
         return entry.getCompleteStore();
       case CREATE_STORE:
-        return entry.getCompleteStore();
+        return entry.getCreateStore();
       case DELETE_STORE:
         return entry.getDeleteStore();
       case MERGE_STORE:
