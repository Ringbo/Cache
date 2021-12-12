diff --git a/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/polls/ViewQuestionGraphsTest.java b/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/polls/ViewQuestionGraphsTest.java
index 10f7a40..5553347 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/polls/ViewQuestionGraphsTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/polls/ViewQuestionGraphsTest.java
@@ -47,7 +47,7 @@
 			selenium.getText("//a[contains(.,'Area')]"));
 		selenium.clickAt("//a[contains(.,'Area')]",
 			RuntimeVariables.replace("Area"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.selectPopUp("");
 		selenium.waitForVisible("//body/img");
 		assertTrue(selenium.isVisible("//body/img"));
@@ -58,7 +58,7 @@
 			selenium.getText("//a[contains(.,'Horizontal Bar')]"));
 		selenium.clickAt("//a[contains(.,'Horizontal Bar')]",
 			RuntimeVariables.replace("Horizontal Bar"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.selectPopUp("");
 		selenium.waitForVisible("//body/img");
 		assertTrue(selenium.isVisible("//body/img"));
@@ -69,7 +69,7 @@
 			selenium.getText("//a[contains(.,'Line')]"));
 		selenium.clickAt("//a[contains(.,'Line')]",
 			RuntimeVariables.replace("Line"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.selectPopUp("");
 		selenium.waitForVisible("//body/img");
 		assertTrue(selenium.isVisible("//body/img"));
@@ -80,7 +80,7 @@
 			selenium.getText("//a[contains(.,'Pie')]"));
 		selenium.clickAt("//a[contains(.,'Pie')]",
 			RuntimeVariables.replace("Pie"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.selectPopUp("");
 		selenium.waitForVisible("//body/img");
 		assertTrue(selenium.isVisible("//body/img"));
@@ -91,7 +91,7 @@
 			selenium.getText("//a[contains(.,'Vertical Bar')]"));
 		selenium.clickAt("//a[contains(.,'Vertical Bar')]",
 			RuntimeVariables.replace("Vertical Bar"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.selectPopUp("");
 		selenium.waitForVisible("//body/img");
 		assertTrue(selenium.isVisible("//body/img"));
