diff --git a/python/src/com/jetbrains/python/documentation/doctest/PyDocstringParserDefinition.java b/python/src/com/jetbrains/python/documentation/doctest/PyDocstringParserDefinition.java
index 69fc044..86448fe 100644
--- a/python/src/com/jetbrains/python/documentation/doctest/PyDocstringParserDefinition.java
+++ b/python/src/com/jetbrains/python/documentation/doctest/PyDocstringParserDefinition.java
@@ -27,7 +27,7 @@
   @NotNull
   @Override
   public PsiParser createParser(Project project) {
-    return new PyDocstingParser();
+    return new PyDocstringParser();
   }
 
 
