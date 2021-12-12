diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/internal/file/FileUrlLoader.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/internal/file/FileUrlLoader.java
index 3c1abd2..6877426 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/internal/file/FileUrlLoader.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/internal/file/FileUrlLoader.java
@@ -101,7 +101,7 @@
             checkCancellable.cancel();
 
         }
-        checkCancellable = schedule(new CheckQueue(), 500);
+        checkCancellable = schedule(new CheckQueue(), 50);
     }
 
 
