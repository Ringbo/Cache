diff --git a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/libraries/FlexDefinitionProcessor.java b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/libraries/FlexDefinitionProcessor.java
index 5277122..a4e24df 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/libraries/FlexDefinitionProcessor.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/libraries/FlexDefinitionProcessor.java
@@ -16,7 +16,7 @@
 import java.nio.charset.CodingErrorAction;
 import java.util.Map;
 
-public class FlexDefinitionProcessor implements DefinitionProcessor {
+class FlexDefinitionProcessor implements DefinitionProcessor {
   private static final String STYLE_PROTO_CHAIN = "mx.styles:StyleProtoChain";
   private static final String SKINNABLE_COMPONENT = "spark.components.supportClasses:SkinnableComponent";
   private static final String MX_CORE = "mx.core:";
@@ -41,7 +41,7 @@
       flipDefinition(definition, definitionMap, SKINNABLE_COMPONENT);
     }
     else if (StringUtil.equals(name, "mx.containers:Panel")) {
-      definition.doAbcData.abcModifier = new MethodAccessModifier("setControlBar", "addChildAt", null, false);
+      definition.doAbcData.abcModifier = new MethodAccessModifier("setControlBar", vGreaterOrEquals4_5 ? "addChildAt" : null, null, false);
     }
     else {
       final boolean mxCore = StringUtil.startsWith(name, MX_CORE);
