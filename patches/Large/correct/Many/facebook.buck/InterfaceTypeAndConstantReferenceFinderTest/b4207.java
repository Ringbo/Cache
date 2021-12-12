diff --git a/test/com/facebook/buck/jvm/java/abi/source/InterfaceTypeAndConstantReferenceFinderTest.java b/test/com/facebook/buck/jvm/java/abi/source/InterfaceTypeAndConstantReferenceFinderTest.java
index e4bd8c6..3a8c9de 100644
--- a/test/com/facebook/buck/jvm/java/abi/source/InterfaceTypeAndConstantReferenceFinderTest.java
+++ b/test/com/facebook/buck/jvm/java/abi/source/InterfaceTypeAndConstantReferenceFinderTest.java
@@ -61,10 +61,12 @@
   }
 
   @Test
-  public void testIgnoresPrivateNestedTypes() throws IOException {
+  public void testFindsTypeReferencesInPrivateNestedTypes() throws IOException {
     findTypeReferences("class Foo {", "  private class Bar {", "    String s;", "  }", "}");
 
-    assertThat(typeReferences, Matchers.empty());
+    assertThat(
+        typeReferences,
+        Matchers.containsInAnyOrder(createSymbolicReference("java.lang.String", 3, 5)));
   }
 
   @Test
