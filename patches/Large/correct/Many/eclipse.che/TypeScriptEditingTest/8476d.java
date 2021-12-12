diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/TypeScriptEditingTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/TypeScriptEditingTest.java
index ee8b058..7bb7f43 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/TypeScriptEditingTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/TypeScriptEditingTest.java
@@ -121,7 +121,7 @@
     menu.runCommand(ASSISTANT, FIND_PROJECT_SYMBOL);
     assistantFindPanel.typeToInputField("testPrint");
     assistantFindPanel.clickOnActionNodeWithTextContains("testPrint");
-    editor.waitCursorPosition(23, 5);
+    editor.waitCursorPosition(23, 6);
   }
 
   @Test(priority = 2, alwaysRun = true)
