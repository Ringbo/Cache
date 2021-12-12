diff --git a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/DefaultChooseByNameItemProvider.java b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/DefaultChooseByNameItemProvider.java
index 5556624..3d83478 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/DefaultChooseByNameItemProvider.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/DefaultChooseByNameItemProvider.java
@@ -51,7 +51,7 @@
     String namePattern = getNamePattern(base, pattern);
     String qualifierPattern = getQualifierPattern(base, pattern);
 
-    if (removeModelSpecificMarkup(base, pattern).isEmpty() && !base.canShowListForEmptyPattern()) return true;
+    if (removeModelSpecificMarkup(base, namePattern).isEmpty() && !base.canShowListForEmptyPattern()) return true;
 
     final ChooseByNameModel model = base.getModel();
     String matchingPattern = convertToMatchingPattern(base, namePattern);
