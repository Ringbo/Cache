diff --git a/idea/tests/org/jetbrains/jet/completion/weighers/CompletionWeigherTest.java b/idea/tests/org/jetbrains/jet/completion/weighers/CompletionWeigherTest.java
index c6ef289..40af4b8 100644
--- a/idea/tests/org/jetbrains/jet/completion/weighers/CompletionWeigherTest.java
+++ b/idea/tests/org/jetbrains/jet/completion/weighers/CompletionWeigherTest.java
@@ -31,7 +31,7 @@
     }
 
     public void testTemplatesAndKeywordsFirst() {
-        doTest("va", "val ... = ...", "var ... = ...", "vararg", "values", "variables");
+        doTest("va", "val ... = ...", "var ... = ...", "vararg", "private", "values", "variables");
     }
 
     public void doTest(String type, @NonNls String... expected) {
