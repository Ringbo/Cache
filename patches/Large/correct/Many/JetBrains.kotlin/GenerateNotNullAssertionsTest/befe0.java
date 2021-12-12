diff --git a/compiler/tests/org/jetbrains/kotlin/codegen/GenerateNotNullAssertionsTest.java b/compiler/tests/org/jetbrains/kotlin/codegen/GenerateNotNullAssertionsTest.java
index d30c89b..d07adce 100644
--- a/compiler/tests/org/jetbrains/kotlin/codegen/GenerateNotNullAssertionsTest.java
+++ b/compiler/tests/org/jetbrains/kotlin/codegen/GenerateNotNullAssertionsTest.java
@@ -137,7 +137,7 @@
         loadFile("notNullAssertions/javaMultipleSubstitutions.kt");
         String text = generateToText();
 
-        assertEquals(3, StringUtil.getOccurrenceCount(text, "checkExpressionValueIsNotNull"));
+        assertEquals(0, StringUtil.getOccurrenceCount(text, "checkExpressionValueIsNotNull"));
         assertEquals(3, StringUtil.getOccurrenceCount(text, "checkParameterIsNotNull"));
     }
 
