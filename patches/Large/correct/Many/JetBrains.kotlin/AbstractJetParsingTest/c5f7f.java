diff --git a/compiler/tests/org/jetbrains/kotlin/parsing/AbstractJetParsingTest.java b/compiler/tests/org/jetbrains/kotlin/parsing/AbstractJetParsingTest.java
index ebcd9ad..569754d 100644
--- a/compiler/tests/org/jetbrains/kotlin/parsing/AbstractJetParsingTest.java
+++ b/compiler/tests/org/jetbrains/kotlin/parsing/AbstractJetParsingTest.java
@@ -62,7 +62,7 @@
             if (!methodName.startsWith("get") && !methodName.startsWith("find") ||
                 methodName.equals("getReference") ||
                 methodName.equals("getReferences") ||
-                methodName.equals("getUseScope") ||
+                methodName.startsWith("getUseScope") ||
                 methodName.equals("getPresentation")) {
                 continue;
             }
