diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/tree/io/PageMetaIO.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/tree/io/PageMetaIO.java
index ea6f1ed..83a37ec 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/tree/io/PageMetaIO.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/tree/io/PageMetaIO.java
@@ -70,7 +70,7 @@
         setReuseListRoot(buf, 0);
         setLastSuccessfulFullBackupId(buf, -1);
         setLastSuccessfulBackupId(buf, -1);
-        setNextBackupId(buf, 0);
+        setNextBackupId(buf, 1);
     }
 
     /**
