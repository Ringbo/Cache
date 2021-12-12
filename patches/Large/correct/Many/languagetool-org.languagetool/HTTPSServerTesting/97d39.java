diff --git a/languagetool-server/src/test/java/org/languagetool/server/HTTPSServerTesting.java b/languagetool-server/src/test/java/org/languagetool/server/HTTPSServerTesting.java
index 04c2a78..eb9ddfb 100644
--- a/languagetool-server/src/test/java/org/languagetool/server/HTTPSServerTesting.java
+++ b/languagetool-server/src/test/java/org/languagetool/server/HTTPSServerTesting.java
@@ -77,7 +77,7 @@
   private class TestRunnable implements Runnable {
     private final int threadNumber;
 
-    public TestRunnable(int threadNumber) {
+    TestRunnable(int threadNumber) {
       this.threadNumber = threadNumber;
     }
 
