diff --git a/compiler/frontend/src/org/jetbrains/kotlin/parsing/JetParsing.java b/compiler/frontend/src/org/jetbrains/kotlin/parsing/JetParsing.java
index 4da0e23..ac36f3d 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/parsing/JetParsing.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/parsing/JetParsing.java
@@ -870,7 +870,7 @@
 
         TokenSet valueArgsRecoverySet = TokenSet.create(COLON, LBRACE, SEMICOLON, RPAR);
         if (at(LPAR)) {
-            parseValueParameterList(false, valueArgsRecoverySet);
+            parseValueParameterList(false, /*typeRequired = */ true, valueArgsRecoverySet);
         }
         else {
             errorWithRecovery("Expecting '('", valueArgsRecoverySet);
