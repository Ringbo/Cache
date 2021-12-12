diff --git a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/CodenvyEditor.java b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/CodenvyEditor.java
index 4ce9877..9386383 100644
--- a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/CodenvyEditor.java
+++ b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/CodenvyEditor.java
@@ -1818,8 +1818,7 @@
               try {
                 javaDocPopupHtmlText = getJavaDocPopupText();
               } catch (StaleElementReferenceException e) {
-                LOG.error(
-                    "Can not get java doc HTML text from autocomplete context menu in editor");
+                LOG.warn("Can not get java doc HTML text from autocomplete context menu in editor");
               }
               return javaDocPopupHtmlText.length() > 0
                   && verifyJavaDoc(javaDocPopupHtmlText, expectedText);
@@ -1862,7 +1861,7 @@
     try {
       srcLink = element.getAttribute("src");
     } catch (StaleElementReferenceException ex) {
-      LOG.error("src link in the context java doc window does not attached");
+      LOG.warn("src link in the context java doc window does not attached");
     }
     return srcLink;
   }
