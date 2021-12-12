diff --git a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/mxml/MxmlWriter.java b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/mxml/MxmlWriter.java
index 7c9408f..32f4756 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/mxml/MxmlWriter.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/mxml/MxmlWriter.java
@@ -37,7 +37,7 @@
 import static com.intellij.flex.uiDesigner.mxml.PropertyProcessor.PRIMITIVE;
 
 public class MxmlWriter {
-  private static final Pattern FLEX_SDK_ABSTRACT_CLASSES = Pattern.compile("^(mx|spark)\\.(.*)?[^\\.]+Classes\\.[^.]+$");
+  private static final Pattern FLEX_SDK_ABSTRACT_CLASSES = Pattern.compile("^(mx|spark)\\.(.*)?Base$");
 
   static final int EMPTY_CLASS_OR_PROPERTY_NAME = 0;
 
@@ -379,7 +379,7 @@
     }
   }
 
-  private boolean isProjectComponent(ClassBackedElementDescriptor descriptor) {
+  private static boolean isProjectComponent(ClassBackedElementDescriptor descriptor) {
     final JSClass jsClass = (JSClass)descriptor.getDeclaration();
     assert jsClass != null;
     PsiFile psiFile = jsClass.getContainingFile();
