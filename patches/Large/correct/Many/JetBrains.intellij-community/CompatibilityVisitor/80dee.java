diff --git a/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java b/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java
index 70ef2af..6182fbf 100644
--- a/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java
+++ b/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java
@@ -264,8 +264,7 @@
     registerForAllMatchingVersions(level -> UnsupportedFeaturesUtil.raiseHasNoArgsUnderFinally(node, level),
                                    " not support this syntax. Raise with no arguments can only be used in an except block",
                                    node,
-                                   null,
-                                   false);
+                                   null);
 
     // raise 1, 2, 3
     registerForAllMatchingVersions(level -> UnsupportedFeaturesUtil.raiseHasMoreThenOneArg(node, level),
