diff --git a/tooling/archetypes/camel-archetype-java/src/main/resources/archetype-resources/src/main/java/MyRouteBuilder.java b/tooling/archetypes/camel-archetype-java/src/main/resources/archetype-resources/src/main/java/MyRouteBuilder.java
index c9761e5..b4e724d 100644
--- a/tooling/archetypes/camel-archetype-java/src/main/resources/archetype-resources/src/main/java/MyRouteBuilder.java
+++ b/tooling/archetypes/camel-archetype-java/src/main/resources/archetype-resources/src/main/java/MyRouteBuilder.java
@@ -31,7 +31,7 @@
     /**
      * A main() so we can easily run these routing rules in our IDE
      */
-    public static void main(String... args) {
+    public static void main(String... args) throws Exception {
         Main.main(args);
     }
 
