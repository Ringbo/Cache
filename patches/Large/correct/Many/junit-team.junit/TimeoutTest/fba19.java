diff --git a/src/test/java/org/junit/tests/running/methods/TimeoutTest.java b/src/test/java/org/junit/tests/running/methods/TimeoutTest.java
index 15efcd2..2cf7b95 100644
--- a/src/test/java/org/junit/tests/running/methods/TimeoutTest.java
+++ b/src/test/java/org/junit/tests/running/methods/TimeoutTest.java
@@ -172,7 +172,7 @@
                 if (fStall)
                     for (; ; ) ;   
                 try {
-                    Thread.sleep (50);
+                    Thread.sleep (500);
                 } catch (InterruptedException e) {
                 }
             }
