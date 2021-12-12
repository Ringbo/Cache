diff --git a/nd4j-context/src/main/java/org/nd4j/linalg/factory/Nd4jBackend.java b/nd4j-context/src/main/java/org/nd4j/linalg/factory/Nd4jBackend.java
index c96deea..996387b 100644
--- a/nd4j-context/src/main/java/org/nd4j/linalg/factory/Nd4jBackend.java
+++ b/nd4j-context/src/main/java/org/nd4j/linalg/factory/Nd4jBackend.java
@@ -210,7 +210,7 @@
 
         }
 
-        Collections.sort(backends, new Comparator<Nd4jBackend>() {
+        Collections.sort(reflectionBackends, new Comparator<Nd4jBackend>() {
             @Override
             public int compare(Nd4jBackend o1, Nd4jBackend o2) {
                 // high-priority first
