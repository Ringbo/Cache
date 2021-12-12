diff --git a/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java b/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java
index 27ef480..4cd0293 100644
--- a/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java
+++ b/components/camel-atom/src/test/java/org/apache/camel/component/atom/AtomGoodBlogsTest.java
@@ -40,7 +40,7 @@
 
         // First we register a blog service in our bean registry
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("blogService", new BlogService());
+        registry.bind("blogService", new BlogService());
 
         // Then we create the camel context with our bean registry
         context = new DefaultCamelContext(registry);
