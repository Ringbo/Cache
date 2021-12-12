diff --git a/camel-core/src/main/java/org/apache/camel/component/file/GenericFileProducer.java b/camel-core/src/main/java/org/apache/camel/component/file/GenericFileProducer.java
index 4d700e3..625adfc 100644
--- a/camel-core/src/main/java/org/apache/camel/component/file/GenericFileProducer.java
+++ b/camel-core/src/main/java/org/apache/camel/component/file/GenericFileProducer.java
@@ -102,7 +102,7 @@
                         // we override the target so we do this by deleting it so the temp file can be renamed later
                         // with success as the existing target file have been deleted
                         if (log.isTraceEnabled()) {
-                            log.trace("Deleting existing file: " + tempTarget);
+                            log.trace("Deleting existing file: " + target);
                         }
                         if (!operations.deleteFile(target)) {
                             throw new GenericFileOperationFailedException("Cannot delete file: " + target);
