diff --git a/test/com/facebook/buck/thrift/ThriftLibraryIntegrationTest.java b/test/com/facebook/buck/thrift/ThriftLibraryIntegrationTest.java
index b94c5ca..9d9dcdd 100644
--- a/test/com/facebook/buck/thrift/ThriftLibraryIntegrationTest.java
+++ b/test/com/facebook/buck/thrift/ThriftLibraryIntegrationTest.java
@@ -88,7 +88,9 @@
             "compiler = " + compiler,
             "compiler2 = " + compiler,
             "cpp_library = //thrift:fake",
-            "cpp_reflection_library = //thrift:fake")
+            "cpp_reflection_library = //thrift:fake",
+            "[project]",
+            "thrift_target_types_enabled = true")
         .build();
 
     TypeCoercerFactory typeCoercerFactory = new DefaultTypeCoercerFactory(
