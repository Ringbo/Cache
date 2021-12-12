diff --git a/java/debugger/impl/src/com/intellij/debugger/settings/DebuggerLaunchingConfigurable.java b/java/debugger/impl/src/com/intellij/debugger/settings/DebuggerLaunchingConfigurable.java
index 15b35e2..e73a0ba 100644
--- a/java/debugger/impl/src/com/intellij/debugger/settings/DebuggerLaunchingConfigurable.java
+++ b/java/debugger/impl/src/com/intellij/debugger/settings/DebuggerLaunchingConfigurable.java
@@ -77,7 +77,7 @@
     final DebuggerSettings currentSettings = DebuggerSettings.getInstance();
     final DebuggerSettings debuggerSettings = currentSettings.clone();
     getSettingsTo(debuggerSettings);
-    return !debuggerSettings.equals(currentSettings) && Registry.is("debugger.mayBringFrameToFrontOnBreakpoint") != myFocusAppCheckBox.isSelected();
+    return !debuggerSettings.equals(currentSettings) || Registry.is("debugger.mayBringFrameToFrontOnBreakpoint") != myFocusAppCheckBox.isSelected();
   }
 
   public String getDisplayName() {
