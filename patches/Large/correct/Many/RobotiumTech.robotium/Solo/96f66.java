diff --git a/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Solo.java b/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Solo.java
index 5abad17..c66b90e 100644
--- a/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Solo.java
+++ b/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Solo.java
@@ -1580,7 +1580,7 @@
 	 */
 	
 	public void typeTextInWebElement(By by, String text, int match){
-		clickOnWebElement(by);
+		clickOnWebElement(by, match);
 		waiter.waitForWebElement(by, match, SMALLTIMEOUT, false);
 		instrumentation.sendStringSync(text);
 	}
