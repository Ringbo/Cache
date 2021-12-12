diff --git a/platform/testGuiFramework/src/com/intellij/testGuiFramework/fixtures/IdeFrameFixture.java b/platform/testGuiFramework/src/com/intellij/testGuiFramework/fixtures/IdeFrameFixture.java
index bd9de03..72b2685 100644
--- a/platform/testGuiFramework/src/com/intellij/testGuiFramework/fixtures/IdeFrameFixture.java
+++ b/platform/testGuiFramework/src/com/intellij/testGuiFramework/fixtures/IdeFrameFixture.java
@@ -371,7 +371,7 @@
     MouseEvent fakeMainMenuMouseEvent =
       new MouseEvent(jMenuBar, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, MouseInfo.getPointerInfo().getLocation().x,
                      MouseInfo.getPointerInfo().getLocation().y, 1, false);
-    DumbService.getInstance(getProject()).runReadActionInSmartMode(() -> actionManager.tryToExecute(mainMenuAction, fakeMainMenuMouseEvent, null, ActionPlaces.MAIN_MENU, true));
+    DumbService.getInstance(getProject()).smartInvokeLater(() -> actionManager.tryToExecute(mainMenuAction, fakeMainMenuMouseEvent, null, ActionPlaces.MAIN_MENU, true));
   }
 
   /**
