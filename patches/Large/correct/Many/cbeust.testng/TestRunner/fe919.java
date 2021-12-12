diff --git a/src/main/java/org/testng/TestRunner.java b/src/main/java/org/testng/TestRunner.java
index ae12022..d96ffab 100644
--- a/src/main/java/org/testng/TestRunner.java
+++ b/src/main/java/org/testng/TestRunner.java
@@ -279,7 +279,7 @@
     // Find all the listener factories and collect all the listeners requested in a
     // @Listeners annotation.
     //
-    List<Class<? extends ITestNGListener>> listenerClasses = Lists.newArrayList();
+    Set<Class<? extends ITestNGListener>> listenerClasses = Sets.newHashSet();
     Class<? extends ITestNGListenerFactory> listenerFactoryClass = null;
 
     for (IClass cls : getTestClasses()) {
