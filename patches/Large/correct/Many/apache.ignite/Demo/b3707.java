diff --git a/examples/schema-import/src/main/java/org/apache/ignite/schema/Demo.java b/examples/schema-import/src/main/java/org/apache/ignite/schema/Demo.java
index d822d6f..8b68cbc 100644
--- a/examples/schema-import/src/main/java/org/apache/ignite/schema/Demo.java
+++ b/examples/schema-import/src/main/java/org/apache/ignite/schema/Demo.java
@@ -59,7 +59,7 @@
         System.out.println(">>> Start demo...");
 
         // Start Ignite node.
-        try (Ignite ignite = Ignition.start()) {
+        try (Ignite ignite = Ignition.start("examples/config/example-ignite.xml")) {
             // Configure cache store.
             CacheConfiguration<PersonKey, Person> cfg =
                 CacheConfig.cache("PersonCache", new H2DemoStoreFactory<PersonKey, Person>());
