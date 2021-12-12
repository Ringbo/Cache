diff --git a/java/testFramework/src/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java b/java/testFramework/src/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java
index 1078d97..da4aa99 100644
--- a/java/testFramework/src/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java
+++ b/java/testFramework/src/com/intellij/codeInsight/daemon/DaemonAnalyzerTestCase.java
@@ -95,7 +95,7 @@
 import java.util.Map;
 
 public abstract class DaemonAnalyzerTestCase extends CodeInsightTestCase {
-  private final Map<String, LocalInspectionToolWrapper> myAvailableTools = new THashMap<String, LocalInspectionToolWrapper>();
+  private final Map<String, InspectionToolWrapper> myAvailableTools = new THashMap<String, InspectionToolWrapper>();
   private final FileTreeAccessFilter myFileTreeAccessFilter = new FileTreeAccessFilter();
 
   @Override
@@ -123,7 +123,7 @@
       @Override
       @NotNull
       public InspectionTool[] getInspectionTools(PsiElement element) {
-        Collection<LocalInspectionToolWrapper> values = myAvailableTools.values();
+        Collection<InspectionToolWrapper> values = myAvailableTools.values();
         return values.toArray(new InspectionTool[values.size()]);
       }
 
@@ -201,11 +201,11 @@
   }
 
   protected void enableInspectionTool(InspectionProfileEntry tool){
-    LocalInspectionToolWrapper wrapper = new LocalInspectionToolWrapper((LocalInspectionTool)tool);
+    InspectionToolWrapper wrapper = InspectionToolRegistrar.wrapTool(tool);
     final String shortName = wrapper.getShortName();
     final HighlightDisplayKey key = HighlightDisplayKey.find(shortName);
     if (key == null) {
-      HighlightDisplayKey.register(shortName, wrapper.getDisplayName(), wrapper.getID());
+      HighlightDisplayKey.register(shortName, wrapper.getDisplayName(), ((LocalInspectionToolWrapper)wrapper).getID());
     }
     myAvailableTools.put(shortName, wrapper);
   }
