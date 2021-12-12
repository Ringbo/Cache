diff --git a/idea/tests/org/jetbrains/kotlin/idea/references/BuiltInsReferenceResolverTest.java b/idea/tests/org/jetbrains/kotlin/idea/references/BuiltInsReferenceResolverTest.java
index b660dc5..7ad145c 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/references/BuiltInsReferenceResolverTest.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/references/BuiltInsReferenceResolverTest.java
@@ -116,7 +116,7 @@
     }
 
     private void doTest() throws Exception {
-        JetReference reference = (JetReference) configureByFile(getTestName(true) + ".kt");
+        PsiPolyVariantReference reference = (PsiPolyVariantReference) configureByFile(getTestName(true) + ".kt");
         PsiElement resolved = reference.resolve();
         assertNotNull(resolved);
         assertEquals(1, reference.multiResolve(false).length);
