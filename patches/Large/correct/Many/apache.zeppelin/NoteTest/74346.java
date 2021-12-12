diff --git a/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NoteTest.java b/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NoteTest.java
index 29da058..3e323ef 100644
--- a/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NoteTest.java
+++ b/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NoteTest.java
@@ -112,7 +112,7 @@
   @Test
   public void putDefaultReplNameIfInterpreterSettingPresent() {
     InterpreterSetting interpreterSetting = Mockito.mock(InterpreterSetting.class);
-    when(interpreterSetting.getName()).thenReturn("spark");
+    when(interpreterSetting.getGroup()).thenReturn("spark");
     when(replLoader.getDefaultInterpreterSetting())
             .thenReturn(Optional.of(interpreterSetting));
 
@@ -126,7 +126,7 @@
   @Test
   public void addParagraphWithLastReplName() {
     InterpreterSetting interpreterSetting = Mockito.mock(InterpreterSetting.class);
-    when(interpreterSetting.getName()).thenReturn("spark");
+    when(interpreterSetting.getGroup()).thenReturn("spark");
     when(replLoader.getDefaultInterpreterSetting())
             .thenReturn(Optional.of(interpreterSetting));
 
@@ -141,7 +141,7 @@
   @Test
   public void insertParagraphWithLastReplName() {
     InterpreterSetting interpreterSetting = Mockito.mock(InterpreterSetting.class);
-    when(interpreterSetting.getName()).thenReturn("spark");
+    when(interpreterSetting.getGroup()).thenReturn("spark");
     when(replLoader.getDefaultInterpreterSetting())
             .thenReturn(Optional.of(interpreterSetting));
 
