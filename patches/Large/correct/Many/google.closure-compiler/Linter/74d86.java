diff --git a/src/com/google/javascript/jscomp/Linter.java b/src/com/google/javascript/jscomp/Linter.java
index 98f24d5..00dd14f 100644
--- a/src/com/google/javascript/jscomp/Linter.java
+++ b/src/com/google/javascript/jscomp/Linter.java
@@ -43,7 +43,7 @@
     Compiler compiler = new Compiler();
     CompilerOptions options = new CompilerOptions();
     options.setLanguageIn(LanguageMode.ECMASCRIPT6_STRICT);
-    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
+    options.setLanguageOut(LanguageMode.ECMASCRIPT5);
     options.setCodingConvention(new GoogleCodingConvention());
     options.setWarningLevel(DiagnosticGroups.MISSING_REQUIRE, CheckLevel.WARNING);
     options.setWarningLevel(DiagnosticGroups.EXTRA_REQUIRE, CheckLevel.WARNING);
