diff --git a/subprojects/core/src/testFixtures/groovy/org/gradle/util/MultithreadedTestCase.java b/subprojects/core/src/testFixtures/groovy/org/gradle/util/MultithreadedTestCase.java
index 6109864..dfbe3e8 100755
--- a/subprojects/core/src/testFixtures/groovy/org/gradle/util/MultithreadedTestCase.java
+++ b/subprojects/core/src/testFixtures/groovy/org/gradle/util/MultithreadedTestCase.java
@@ -342,7 +342,7 @@
         start(new Runnable() {
             public void run() {
                 try {
-                    Thread.sleep(200L);
+                    Thread.sleep(500L);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
