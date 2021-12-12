diff --git a/platform/lang-impl/src/com/intellij/psi/impl/DocumentCommitThread.java b/platform/lang-impl/src/com/intellij/psi/impl/DocumentCommitThread.java
index 5176c95..32a2e38 100644
--- a/platform/lang-impl/src/com/intellij/psi/impl/DocumentCommitThread.java
+++ b/platform/lang-impl/src/com/intellij/psi/impl/DocumentCommitThread.java
@@ -563,7 +563,7 @@
     int attempts = 0;
     int delay = 100;
     synchronized (documentsToCommit) {
-      while(!documentsToCommit.isEmpty()) {
+      while(!documentsToCommit.isEmpty() || currentTask != null) {
         documentsToCommit.wait(delay);
         if (delay * attempts > timeout) {
           throw new RuntimeException("timeout");
