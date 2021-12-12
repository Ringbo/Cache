diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/CSharpFileEditingTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/CSharpFileEditingTest.java
index c1d9e7b..48c7977 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/CSharpFileEditingTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/languageserver/CSharpFileEditingTest.java
@@ -110,7 +110,7 @@
     editor.launchAutocomplete();
     editor.enterAutocompleteProposal("Build ");
     editor.typeTextIntoEditor("();");
-    editor.waitAllMarkersInvisibility(INFO);
+    editor.waitAllMarkersInvisibility(ERROR);
   }
 
   private void createDotNetAppFromWizard() {
