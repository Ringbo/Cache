diff --git a/idea/src/org/jetbrains/jet/plugin/internal/codewindow/BytecodeToolwindow.java b/idea/src/org/jetbrains/jet/plugin/internal/codewindow/BytecodeToolwindow.java
index 7ec778b9..71739c2 100644
--- a/idea/src/org/jetbrains/jet/plugin/internal/codewindow/BytecodeToolwindow.java
+++ b/idea/src/org/jetbrains/jet/plugin/internal/codewindow/BytecodeToolwindow.java
@@ -71,7 +71,7 @@
         myProject = project;
         myEditor = EditorFactory.getInstance().createEditor(EditorFactory.getInstance().createDocument(""), project, JavaFileType.INSTANCE, true);
         add(myEditor.getComponent());
-        myUpdateAlarm = new Alarm(Alarm.ThreadToUse.SWING_THREAD);
+        myUpdateAlarm = new Alarm(Alarm.ThreadToUse.SWING_THREAD, this);
         myUpdateAlarm.addRequest(new Runnable() {
             @Override
             public void run() {
