diff --git a/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java b/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java
index 930f43c..7962cb8 100644
--- a/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java
+++ b/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java
@@ -98,7 +98,7 @@
     myCaretModelDelegate = new CaretModelWindow(myDelegate.getCaretModel(), this);
     mySelectionModelDelegate = new SelectionModelWindow(myDelegate, myDocumentWindow,this);
     myMarkupModelDelegate = new MarkupModelWindow((MarkupModelEx)myDelegate.getMarkupModel(), myDocumentWindow);
-    myFoldingModelWindow = new FoldingModelWindow((FoldingModelEx)delegate.getFoldingModel(), documentWindow, this);
+    myFoldingModelWindow = new FoldingModelWindow(delegate.getFoldingModel(), documentWindow, this);
   }
 
   public static void disposeInvalidEditors() {
@@ -210,7 +210,7 @@
   }
 
   @NotNull
-  public SoftWrapModel getSoftWrapModel() {
+  public SoftWrapModelEx getSoftWrapModel() {
     return myDelegate.getSoftWrapModel();
   }
 
