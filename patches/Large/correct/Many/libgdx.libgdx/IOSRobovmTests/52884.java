diff --git a/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java b/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java
index c1846fc..dffd56d 100644
--- a/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java
+++ b/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java
@@ -13,7 +13,7 @@
 	@Override
 	protected IOSApplication createApplication() {
 		IOSApplicationConfiguration config = new IOSApplicationConfiguration();
-		return new IOSApplication(new MultitouchTest(), config);
+		return new IOSApplication(new BulletTestCollection(), config);
 	}
 
 	public static void main(String[] argv) {
