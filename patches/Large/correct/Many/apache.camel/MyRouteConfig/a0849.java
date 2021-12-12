diff --git a/examples/camel-example-spring-javaconfig/src/main/java/org/apache/camel/example/spring/javaconfig/MyRouteConfig.java b/examples/camel-example-spring-javaconfig/src/main/java/org/apache/camel/example/spring/javaconfig/MyRouteConfig.java
index 914bd8d..ec06a2f 100644
--- a/examples/camel-example-spring-javaconfig/src/main/java/org/apache/camel/example/spring/javaconfig/MyRouteConfig.java
+++ b/examples/camel-example-spring-javaconfig/src/main/java/org/apache/camel/example/spring/javaconfig/MyRouteConfig.java
@@ -37,8 +37,9 @@
      * Allow this route to be run as an application
      *
      * @param args
+     * @throws Exception 
      */
-    public static void main(String[] args) {
+    public static void main(String[] args) throws Exception {
         new Main().run(args);
     }
     
