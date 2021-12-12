diff --git a/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompiler.java b/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompiler.java
index 6ba96ea..9455087 100644
--- a/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompiler.java
+++ b/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompiler.java
@@ -42,7 +42,7 @@
         });
 
         ArrayList<File> routes = Lists.newArrayList();
-        CollectionUtils.filter(sources, secondaryRoutes, new Spec<File>() {
+        CollectionUtils.filter(sources, routes, new Spec<File>() {
             @Override
             public boolean isSatisfiedBy(File file) {
                 return file.getName().equals("routes");
