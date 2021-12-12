diff --git a/src/main/java/org/junit/runners/BlockJUnit4ClassRunner.java b/src/main/java/org/junit/runners/BlockJUnit4ClassRunner.java
index b4499e7..09c8fd5 100644
--- a/src/main/java/org/junit/runners/BlockJUnit4ClassRunner.java
+++ b/src/main/java/org/junit/runners/BlockJUnit4ClassRunner.java
@@ -49,7 +49,7 @@
  * @since 4.5
  */
 public class BlockJUnit4ClassRunner extends ParentRunner<FrameworkMethod> {
-    private ConcurrentHashMap<FrameworkMethod, Description> fMethodDescriptions = new ConcurrentHashMap<FrameworkMethod, Description>();
+    private final ConcurrentHashMap<FrameworkMethod, Description> fMethodDescriptions = new ConcurrentHashMap<FrameworkMethod, Description>();
     /**
      * Creates a BlockJUnit4ClassRunner to run {@code klass}
      *
@@ -80,7 +80,7 @@
         if (description == null) {
             description = Description.createTestDescription(getTestClass().getJavaClass(),
                     testName(method), method.getAnnotations());
-            fMethodDescriptions.put(method, description);
+            fMethodDescriptions.putIfAbsent(method, description);
         }
 
         return description;
