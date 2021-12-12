diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/preferences/CheckErrorsWarningsTabTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/preferences/CheckErrorsWarningsTabTest.java
index 4f9e256..7c31f6b 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/preferences/CheckErrorsWarningsTabTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/preferences/CheckErrorsWarningsTabTest.java
@@ -98,13 +98,13 @@
     consoles.closeProcessesArea();
     menu.runCommand(TestMenuCommandsConstants.Profile.PROFILE_MENU, PREFERENCES);
     changeAllSettingsInErrorsWarningsTab(Preferences.DropDownValueForErrorWaitingWidget.WARNING);
-    Assert.assertEquals(editor.getMarkersQuantity(WARNING_OVERVIEW), 13);
+    Assert.assertEquals(editor.getMarkersQuantity(WARNING_OVERVIEW), 12);
     Assert.assertEquals(editor.getMarkersQuantity(WARNING), 22);
 
     editor.waitAnnotationsAreNotPresent(ERROR_OVERVIEW);
     menu.runCommand(TestMenuCommandsConstants.Profile.PROFILE_MENU, PREFERENCES);
     changeAllSettingsInErrorsWarningsTab(Preferences.DropDownValueForErrorWaitingWidget.ERROR);
-    Assert.assertEquals(editor.getMarkersQuantity(ERROR_OVERVIEW), 13);
+    Assert.assertEquals(editor.getMarkersQuantity(ERROR_OVERVIEW), 12);
     Assert.assertEquals(editor.getMarkersQuantity(ERROR), 22);
     editor.waitAnnotationsAreNotPresent(WARNING_OVERVIEW);
     menu.runCommand(TestMenuCommandsConstants.Profile.PROFILE_MENU, PREFERENCES);
