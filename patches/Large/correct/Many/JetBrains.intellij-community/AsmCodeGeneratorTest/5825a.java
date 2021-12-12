diff --git a/plugins/ui-designer/testSrc/com/intellij/uiDesigner/core/AsmCodeGeneratorTest.java b/plugins/ui-designer/testSrc/com/intellij/uiDesigner/core/AsmCodeGeneratorTest.java
index a99f7da..8739a81 100644
--- a/plugins/ui-designer/testSrc/com/intellij/uiDesigner/core/AsmCodeGeneratorTest.java
+++ b/plugins/ui-designer/testSrc/com/intellij/uiDesigner/core/AsmCodeGeneratorTest.java
@@ -41,7 +41,7 @@
  */
 public class AsmCodeGeneratorTest extends TestCase {
   private MyNestedFormLoader myNestedFormLoader;
-  private MyClassLoader myClassLoader;
+  private ClassLoader myClassLoader;
 
   @Override
   protected void setUp() throws Exception {
@@ -109,7 +109,7 @@
     fos.close();
     */
 
-    return myClassLoader.doDefineClass(className, patchedData);
+    return ((MyClassLoader)myClassLoader).doDefineClass(className, patchedData);
   }
 
   private static byte[] getVerifiedPatchedData(final AsmCodeGenerator codeGenerator) {
@@ -325,7 +325,7 @@
       File.separatorChar + "formEmbedding" + File.separatorChar + "Ideadev14081" + File.separatorChar;
     AsmCodeGenerator embeddedClassGenerator = initCodeGenerator("Embedded.form", "Embedded", testDataPath);
     byte[] embeddedPatchedData = getVerifiedPatchedData(embeddedClassGenerator);
-    myClassLoader.doDefineClass("Embedded", embeddedPatchedData);
+    ((MyClassLoader)myClassLoader).doDefineClass("Embedded", embeddedPatchedData);
     myNestedFormLoader.registerNestedForm("Embedded.form", testDataPath + "Embedded.form");
     AsmCodeGenerator mainClassGenerator = initCodeGenerator("Main.form", "Main", testDataPath);
     byte[] mainPatchedData = getVerifiedPatchedData(mainClassGenerator);
@@ -336,7 +336,7 @@
     fos.close();
     */
 
-    final Class mainClass = myClassLoader.doDefineClass("Main", mainPatchedData);
+    final Class mainClass = ((MyClassLoader)myClassLoader).doDefineClass("Main", mainPatchedData);
     Object instance = mainClass.newInstance();
     assert instance != null : mainClass;
   }
