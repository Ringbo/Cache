diff --git a/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/CamelCxfTest.java b/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/CamelCxfTest.java
index 36aaaa7..6c55b9f 100644
--- a/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/CamelCxfTest.java
+++ b/tests/camel-itest-karaf/src/test/java/org/apache/camel/itest/karaf/CamelCxfTest.java
@@ -36,7 +36,7 @@
 
     @Configuration
     public static Option[] configure() {
-        return configure(COMPONENT);
+        return configure(COMPONENT, "cxf-jaxb");
     }
 
 }
\ No newline at end of file
