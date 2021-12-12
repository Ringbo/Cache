diff --git a/idea/src/org/jetbrains/jet/plugin/caches/resolve/IDELightClassGenerationSupport.java b/idea/src/org/jetbrains/jet/plugin/caches/resolve/IDELightClassGenerationSupport.java
index c34c8e1..12f6e12 100644
--- a/idea/src/org/jetbrains/jet/plugin/caches/resolve/IDELightClassGenerationSupport.java
+++ b/idea/src/org/jetbrains/jet/plugin/caches/resolve/IDELightClassGenerationSupport.java
@@ -85,7 +85,7 @@
         for (JetFile file : files) {
             FqName fqName = JetPsiUtil.getFQName(file);
 
-            assert QualifiedNamesUtil.isSubpackageOf(fqn, fqName) : "Registered package is not a subpackage of actually declared package:\n" +
+            assert QualifiedNamesUtil.isSubpackageOf(fqName, fqn) : "Registered package is not a subpackage of actually declared package:\n" +
                                                                     "in index: " + fqn + "\n" +
                                                                     "declared: " + fqName;
             FqName subpackage = QualifiedNamesUtil.plusOneSegment(fqn, fqName);
