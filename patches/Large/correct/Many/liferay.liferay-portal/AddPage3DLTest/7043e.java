diff --git a/portal-web/test/com/liferay/portalweb/portal/dbupgrade/transfersampledatalatest/documentlibrary/pagescopelarcp/AddPage3DLTest.java b/portal-web/test/com/liferay/portalweb/portal/dbupgrade/transfersampledatalatest/documentlibrary/pagescopelarcp/AddPage3DLTest.java
index 2206536..6f4ee14e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/dbupgrade/transfersampledatalatest/documentlibrary/pagescopelarcp/AddPage3DLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/dbupgrade/transfersampledatalatest/documentlibrary/pagescopelarcp/AddPage3DLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
@@ -94,7 +94,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("//input[@id='_156_name_en_US']")) {
+				if (selenium.isVisible("//input[@name='_156_name_en_US']")) {
 					break;
 				}
 			}
@@ -104,7 +104,7 @@
 			Thread.sleep(1000);
 		}
 
-		selenium.type("//input[@id='_156_name_en_US']",
+		selenium.type("//input[@name='_156_name_en_US']",
 			RuntimeVariables.replace("DL Page3 Name"));
 		selenium.clickAt("//input[@value='Add Page']",
 			RuntimeVariables.replace("Add Page"));
