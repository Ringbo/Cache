diff --git a/shell/src/main/java/alluxio/cli/fs/command/LsCommand.java b/shell/src/main/java/alluxio/cli/fs/command/LsCommand.java
index 2be6fb3..78d46bc 100644
--- a/shell/src/main/java/alluxio/cli/fs/command/LsCommand.java
+++ b/shell/src/main/java/alluxio/cli/fs/command/LsCommand.java
@@ -127,7 +127,7 @@
     SORT_FIELD_COMPARATORS.put("name",
         Comparator.comparing(URIStatus::getName, String.CASE_INSENSITIVE_ORDER));
     SORT_FIELD_COMPARATORS.put("path", Comparator.comparing(URIStatus::getPath));
-    SORT_FIELD_COMPARATORS.put("size", Comparator.comparingLong(URIStatus::getBlockSizeBytes));
+    SORT_FIELD_COMPARATORS.put("size", Comparator.comparingLong(URIStatus::getLength));
   }
 
   /**
