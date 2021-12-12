diff --git a/portal-web/test/functional/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java b/portal-web/test/functional/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java
index e0182c0..aa9fac2 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portlet/pagecomments/comment/addcomment/TearDownPageCommentTest.java
@@ -49,7 +49,7 @@
 					RuntimeVariables.replace("Delete"));
 				selenium.waitForConfirmation(
 					"Are you sure you want to delete this? It will be deleted immediately.");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 
 				boolean pageComment2Present = selenium.isElementPresent(
 						"//li[4]/span/a/span");
@@ -66,7 +66,7 @@
 					RuntimeVariables.replace("Delete"));
 				selenium.waitForConfirmation(
 					"Are you sure you want to delete this? It will be deleted immediately.");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 
 				boolean pageComment3Present = selenium.isElementPresent(
 						"//li[4]/span/a/span");
@@ -83,7 +83,7 @@
 					RuntimeVariables.replace("Delete"));
 				selenium.waitForConfirmation(
 					"Are you sure you want to delete this? It will be deleted immediately.");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 
 				boolean pageComment4Present = selenium.isElementPresent(
 						"//li[4]/span/a/span");
@@ -100,7 +100,7 @@
 					RuntimeVariables.replace("Delete"));
 				selenium.waitForConfirmation(
 					"Are you sure you want to delete this? It will be deleted immediately.");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 
 				boolean pageComment5Present = selenium.isElementPresent(
 						"//li[4]/span/a/span");
@@ -117,7 +117,7 @@
 					RuntimeVariables.replace("Delete"));
 				selenium.waitForConfirmation(
 					"Are you sure you want to delete this? It will be deleted immediately.");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 
 			case 2:
 			case 3:
