diff --git a/util/src/com/intellij/util/io/PagePool.java b/util/src/com/intellij/util/io/PagePool.java
index 2449073..69d6e97 100644
--- a/util/src/com/intellij/util/io/PagePool.java
+++ b/util/src/com/intellij/util/io/PagePool.java
@@ -251,7 +251,7 @@
           else {
             synchronized (finalizationLock) {
               try {
-                finalizationLock.wait();
+                finalizationLock.wait(10);
               }
               catch (InterruptedException e) {
                 throw new RuntimeException(e);
