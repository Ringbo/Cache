diff --git a/examples/camel-example-guice-jms/src/main/java/org/apache/camel/example/guice/jms/MyRouteBuilder.java b/examples/camel-example-guice-jms/src/main/java/org/apache/camel/example/guice/jms/MyRouteBuilder.java
index ee39b1c..c2c8e08 100644
--- a/examples/camel-example-guice-jms/src/main/java/org/apache/camel/example/guice/jms/MyRouteBuilder.java
+++ b/examples/camel-example-guice-jms/src/main/java/org/apache/camel/example/guice/jms/MyRouteBuilder.java
@@ -30,8 +30,9 @@
      * Allow this route to be run as an application
      *
      * @param args
+     * @throws Exception 
      */
-    public static void main(String[] args) {
+    public static void main(String[] args) throws Exception {
         new Main().run(args);
     }
 
