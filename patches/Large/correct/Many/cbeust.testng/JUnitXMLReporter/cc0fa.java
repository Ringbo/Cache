diff --git a/src/main/java/org/testng/reporters/JUnitXMLReporter.java b/src/main/java/org/testng/reporters/JUnitXMLReporter.java
index 4d97bed..1338b06 100755
--- a/src/main/java/org/testng/reporters/JUnitXMLReporter.java
+++ b/src/main/java/org/testng/reporters/JUnitXMLReporter.java
@@ -192,7 +192,7 @@
   private Set<String> getPackages(ITestContext context) {
     Set<String> result = Sets.newHashSet();
     for (ITestNGMethod m : context.getAllTestMethods()) {
-      Package pkg = m.getMethod().getDeclaringClass().getPackage();
+      Package pkg = m.getConstructorOrMethod().getDeclaringClass().getPackage();
       if (pkg != null) {
         result.add(pkg.getName());
       }
