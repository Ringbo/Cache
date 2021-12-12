diff --git a/components/camel-testng/src/test/java/org/apache/camel/testng/patterns/FilterCreateCamelContextPerClassTest.java b/components/camel-testng/src/test/java/org/apache/camel/testng/patterns/FilterCreateCamelContextPerClassTest.java
index 2c812ad..d2d91bb 100644
--- a/components/camel-testng/src/test/java/org/apache/camel/testng/patterns/FilterCreateCamelContextPerClassTest.java
+++ b/components/camel-testng/src/test/java/org/apache/camel/testng/patterns/FilterCreateCamelContextPerClassTest.java
@@ -42,7 +42,7 @@
         // we override this method and return true, to tell Camel test-kit that
         // it should only create CamelContext once (per class), so we will
         // re-use the CamelContext between each test method in this class
-        return false;
+        return true;
     }
 
     @Test
