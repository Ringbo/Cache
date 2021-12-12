diff --git a/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java b/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java
index be68f93..0a0f182 100644
--- a/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java
+++ b/subprojects/core/src/main/groovy/org/gradle/cache/internal/DefaultFileLockManager.java
@@ -247,7 +247,7 @@
                 }
 
                 throw new LockTimeoutException(String.format("Timeout waiting to lock %s. It is currently in use by another Gradle instance.%nOwner PID: %s%nOur PID: %s%nOwner Operation: %s%nOur operation: %s%nLock file: %s",
-                        displayName, metaDataProvider.getProcessIdentifier(), ownerPid, ownerOperation, operationDisplayName, lockFile));
+                        displayName, ownerPid, metaDataProvider.getProcessIdentifier(), ownerOperation, operationDisplayName, lockFile));
             }
 
             try {
