diff --git a/src/main/java/org/testng/TestNG.java b/src/main/java/org/testng/TestNG.java
index fb82d89..c426492 100644
--- a/src/main/java/org/testng/TestNG.java
+++ b/src/main/java/org/testng/TestNG.java
@@ -920,7 +920,7 @@
         parameters.add(m_serviceLoaderClassLoader);
         loadMethod = c.getMethod("load", Class.class, ClassLoader.class);
       } else {
-        loadMethod = c.getMethod("load");
+        loadMethod = c.getMethod("load", Class.class);
       }
       Iterable<ITestNGListener> loader =
           (Iterable<ITestNGListener>) loadMethod.invoke(c, parameters.toArray());
