diff --git a/nd4j-tests/src/test/java/org/nd4j/linalg/BaseNd4jTest.java b/nd4j-tests/src/test/java/org/nd4j/linalg/BaseNd4jTest.java
index 0590f77..37420f9 100644
--- a/nd4j-tests/src/test/java/org/nd4j/linalg/BaseNd4jTest.java
+++ b/nd4j-tests/src/test/java/org/nd4j/linalg/BaseNd4jTest.java
@@ -69,7 +69,7 @@
      * given command line arguments
      */
     public static Nd4jBackend getDefaultBackend() {
-        String clazz = System.getProperty(DEFAULT_BACKED,JCublasBackend.class.getName());
+        String clazz = System.getProperty(DEFAULT_BACKED,JblasBackend.class.getName());
         try {
             return (Nd4jBackend) Class.forName(clazz).newInstance();
         } catch (Exception e) {
