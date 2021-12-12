diff --git a/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionInTextFieldTest.java b/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionInTextFieldTest.java
index 13481b6..24ad2be 100644
--- a/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionInTextFieldTest.java
+++ b/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionInTextFieldTest.java
@@ -58,7 +58,8 @@
   @JSTestOptions({JSTestOption.WithFlexSdk})
   public void testChangeSignatureParameterTypeCell() throws Exception {
     configureByFiles(null, BASE_PATH + getTestName(false) + "_2.js2");
-    JSExpressionCodeFragment fragment = JSParameterTableModel.createParameterTypeCellFragment("", myProject);
+    JSExpressionCodeFragment fragment = JSParameterTableModel.createParameterTypeCellFragment("", myProject,
+                                                                                              JavaScriptSupportLoader.ECMA_SCRIPT_L4);
     String[] included = new String[]{"Z111", "Z222", "int", "String", "uint", "Number", "EventDispatcher", "void", "*"};
     String[] excluded = ArrayUtil.mergeArrays(DEFALUT_VALUES, "public", "function", "while");
     checkTextFieldCompletion(fragment, included, excluded, "EventDispatcher", BASE_PATH + getTestName(false) + ".txt");
@@ -67,7 +68,8 @@
   @JSTestOptions({JSTestOption.WithFlexSdk})
   public void testChangeSignatureDefaultValueCell() throws Exception {
     configureByFiles(null, BASE_PATH + getTestName(false) + "_2.js2");
-    JSExpressionCodeFragment fragment = JSParameterTableModel.createDefaultValueCellFragment("", createFakeClass());
+    JSExpressionCodeFragment fragment = JSParameterTableModel.createDefaultValueCellFragment("", createFakeClass(),
+                                                                                             JavaScriptSupportLoader.ECMA_SCRIPT_L4);
     String[] included = DEFALUT_VALUES;
     // TODO classes should be removed from completion list
     included = ArrayUtil.mergeArrays(included, "Z111", "Z222", "int", "String", "uint", "Number", "EventDispatcher");
@@ -78,7 +80,8 @@
   @JSTestOptions({JSTestOption.WithFlexSdk})
   public void testChangeSignatureInitializerCell() throws Exception {
     configureByFiles(null, BASE_PATH + getTestName(false) + "_2.js2");
-    JSExpressionCodeFragment fragment = JSParameterTableModel.createInitializerCellFragment("", createFakeClass());
+    JSExpressionCodeFragment fragment = JSParameterTableModel.createInitializerCellFragment("", createFakeClass(),
+                                                                                            JavaScriptSupportLoader.ECMA_SCRIPT_L4);
     String[] included = DEFALUT_VALUES;
     // TODO classes should be removed from completion list
     included = ArrayUtil.mergeArrays(included, "Z111", "Z222", "int", "String", "uint", "Number", "EventDispatcher");
