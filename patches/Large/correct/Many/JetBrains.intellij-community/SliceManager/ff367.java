diff --git a/java/java-impl/src/com/intellij/slicer/SliceManager.java b/java/java-impl/src/com/intellij/slicer/SliceManager.java
index 22c65e9..a8f7690 100644
--- a/java/java-impl/src/com/intellij/slicer/SliceManager.java
+++ b/java/java-impl/src/com/intellij/slicer/SliceManager.java
@@ -121,7 +121,7 @@
   public void slice(@NotNull PsiElement element, boolean dataFlowToThis, @NotNull SliceHandler handler) {
     String dialogTitle = getElementDescription((dataFlowToThis ? BACK_TOOLWINDOW_ID : FORTH_TOOLWINDOW_ID) + " ", element, null);
 
-    dialogTitle = Pattern.compile("(<style>.*</style>)|<[^<>]*>").matcher(dialogTitle).replaceAll("");
+    dialogTitle = Pattern.compile("(<style>.*</style>)|<[^<>]*>", Pattern.DOTALL).matcher(dialogTitle).replaceAll("");
     SliceAnalysisParams params = handler.askForParams(element, dataFlowToThis, myStoredSettings, dialogTitle);
     if (params == null) return;
 
