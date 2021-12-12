diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/assistant/KeyBindingsTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/assistant/KeyBindingsTest.java
index 424e958..b34acd2 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/assistant/KeyBindingsTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/assistant/KeyBindingsTest.java
@@ -89,7 +89,7 @@
     menu.runCommand(
         TestMenuCommandsConstants.Assistant.ASSISTANT,
         TestMenuCommandsConstants.Assistant.KEY_BINDINGS);
-    keyBindings.checkSearchResultKeyBinding("open", 6);
+    keyBindings.checkSearchResultKeyBinding("open", 5);
     keyBindings.clickOkButton();
   }
 
