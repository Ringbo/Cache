diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/dashboard/CreateFactoryTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/dashboard/CreateFactoryTest.java
index 8e83eb6..2fce45c 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/dashboard/CreateFactoryTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/dashboard/CreateFactoryTest.java
@@ -202,7 +202,7 @@
     // enter factory name with a less than 3 symbols
     createFactoryPage.typeFactoryName(generate("", 2));
     createFactoryPage.waitErrorMessage(TOO_SHORT_NAME_MESAAGE);
-    assertTrue(createFactoryPage.isCreateFactoryButtonEnabled());
+    assertFalse(createFactoryPage.isCreateFactoryButtonEnabled());
 
     // enter factory name with exactly 3 symbols
     createFactoryPage.typeFactoryName(MIN_FACTORY_NAME);
@@ -212,12 +212,12 @@
     // enter factory name with special symbols
     createFactoryPage.typeFactoryName(SPECIAL_SYMBOLS_NAME);
     createFactoryPage.waitErrorMessage(SPECIAL_SYMBOLS_ERROR_MESSAGE);
-    assertTrue(createFactoryPage.isCreateFactoryButtonEnabled());
+    assertFalse(createFactoryPage.isCreateFactoryButtonEnabled());
 
     // enter factory name with more than 20 symbols
     createFactoryPage.typeFactoryName(generate("", 21));
     createFactoryPage.waitErrorMessage(TOO_LONG_NAME_MESSAGE);
-    assertTrue(createFactoryPage.isCreateFactoryButtonEnabled());
+    assertFalse(createFactoryPage.isCreateFactoryButtonEnabled());
 
     // enter factory name with exactly 20 symbols
     createFactoryPage.typeFactoryName(MAX_FACTORY_NAME);
