diff --git a/portal-web/test/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java b/portal-web/test/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java
index 6d85ba6..0adb470 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java
@@ -62,8 +62,7 @@
 
 				assertEquals(RuntimeVariables.replace("Delete"),
 					selenium.getText("//li[4]/span/a/span"));
-				selenium.clickAt("//li[4]/span/a/span",
-					RuntimeVariables.replace("Delete"));
+				selenium.click("//li[4]/span/a/span");
 				Thread.sleep(5000);
 				assertTrue(selenium.getConfirmation()
 								   .matches("^Are you sure you want to delete this[\\s\\S]$"));
@@ -82,8 +81,7 @@
 
 				assertEquals(RuntimeVariables.replace("Delete"),
 					selenium.getText("//li[4]/span/a/span"));
-				selenium.clickAt("//li[4]/span/a/span",
-					RuntimeVariables.replace("Delete"));
+				selenium.click("//li[4]/span/a/span");
 				Thread.sleep(5000);
 				assertTrue(selenium.getConfirmation()
 								   .matches("^Are you sure you want to delete this[\\s\\S]$"));
@@ -102,8 +100,7 @@
 
 				assertEquals(RuntimeVariables.replace("Delete"),
 					selenium.getText("//li[4]/span/a/span"));
-				selenium.clickAt("//li[4]/span/a/span",
-					RuntimeVariables.replace("Delete"));
+				selenium.click("//li[4]/span/a/span");
 				Thread.sleep(5000);
 				assertTrue(selenium.getConfirmation()
 								   .matches("^Are you sure you want to delete this[\\s\\S]$"));
@@ -122,8 +119,7 @@
 
 				assertEquals(RuntimeVariables.replace("Delete"),
 					selenium.getText("//li[4]/span/a/span"));
-				selenium.clickAt("//li[4]/span/a/span",
-					RuntimeVariables.replace("Delete"));
+				selenium.click("//li[4]/span/a/span");
 				Thread.sleep(5000);
 				assertTrue(selenium.getConfirmation()
 								   .matches("^Are you sure you want to delete this[\\s\\S]$"));
@@ -142,8 +138,7 @@
 
 				assertEquals(RuntimeVariables.replace("Delete"),
 					selenium.getText("//li[4]/span/a/span"));
-				selenium.clickAt("//li[4]/span/a/span",
-					RuntimeVariables.replace("Delete"));
+				selenium.click("//li[4]/span/a/span");
 				Thread.sleep(5000);
 				assertTrue(selenium.getConfirmation()
 								   .matches("^Are you sure you want to delete this[\\s\\S]$"));
