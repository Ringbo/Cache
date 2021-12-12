diff --git a/src/main/org/testng/internal/annotations/AnnotationHelper.java b/src/main/org/testng/internal/annotations/AnnotationHelper.java
index 76a6fdf..ebe344e 100644
--- a/src/main/org/testng/internal/annotations/AnnotationHelper.java
+++ b/src/main/org/testng/internal/annotations/AnnotationHelper.java
@@ -145,7 +145,7 @@
     result.setFakeConfiguration(true);
     result.setAlwaysRun(bs.getAlwaysRun());
     result.setDependsOnGroups(bs.getDependsOnGroups());
-    result.setDependsOnMethods(bs.getDependsOnGroups());
+    result.setDependsOnMethods(bs.getDependsOnMethods());
     result.setDescription(bs.getDescription());
     result.setEnabled(bs.getEnabled());
     result.setGroups(bs.getGroups());
