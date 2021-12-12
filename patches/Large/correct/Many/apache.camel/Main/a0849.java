diff --git a/components/camel-guice/src/main/java/org/apache/camel/guice/Main.java b/components/camel-guice/src/main/java/org/apache/camel/guice/Main.java
index 5a0857a..c9c18c0 100644
--- a/components/camel-guice/src/main/java/org/apache/camel/guice/Main.java
+++ b/components/camel-guice/src/main/java/org/apache/camel/guice/Main.java
@@ -59,7 +59,7 @@
 */
     }
 
-    public static void main(String... args) {
+    public static void main(String... args) throws Exception {
         Main main = new Main();
         instance = main;
         main.run(args);
