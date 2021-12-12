diff --git a/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/selenium/LiferaySeleniumHelper.java b/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/selenium/LiferaySeleniumHelper.java
index c28fcdd..23022f3 100644
--- a/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/selenium/LiferaySeleniumHelper.java
+++ b/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/selenium/LiferaySeleniumHelper.java
@@ -192,7 +192,7 @@
 		for (Element eventElement : eventElements) {
 			String level = eventElement.attributeValue("level");
 
-			if (level.equals("ERROR")) {
+			if (level.equals("ERROR") || level.equals("FATAL")) {
 				String timestamp = eventElement.attributeValue("timestamp");
 
 				if (_errorTimestamps.contains(timestamp)) {
