diff --git a/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java b/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java
index c3ba905..f62315c 100644
--- a/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java
+++ b/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java
@@ -320,7 +320,7 @@
     note.runAll();
 
     // wait for finish
-    while(p3.isTerminated() == false) {
+    while(p3.isTerminated() == false || p3.getResult() == null) {
       Thread.yield();
     }
 
