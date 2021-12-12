diff --git a/xml/dom-tests/tests/com/intellij/util/xml/stubs/DomStubBuilderTest.java b/xml/dom-tests/tests/com/intellij/util/xml/stubs/DomStubBuilderTest.java
index b8c1e46..1c09cd0 100644
--- a/xml/dom-tests/tests/com/intellij/util/xml/stubs/DomStubBuilderTest.java
+++ b/xml/dom-tests/tests/com/intellij/util/xml/stubs/DomStubBuilderTest.java
@@ -98,7 +98,7 @@
     VirtualFile file = psiFile.getVirtualFile();
     assertTrue(loader.canHaveStub(file));
     ObjectStubTree stubTree = loader.readFromVFile(getProject(), file);
-    assertNull(stubTree); // no stubs for invalid XML
+    assertNotNull(stubTree);
   }
 
   public void testInclusion() {
