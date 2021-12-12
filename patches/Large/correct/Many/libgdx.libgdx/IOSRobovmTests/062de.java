diff --git a/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java b/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java
index 28a75c9..80f7772 100644
--- a/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java
+++ b/tests/gdx-tests-iosrobovm/src/com/badlogic/gdx/tests/IOSRobovmTests.java
@@ -29,7 +29,7 @@
 	protected IOSApplication createApplication() {
 		IOSApplicationConfiguration config = new IOSApplicationConfiguration();
 		config.useAccelerometer = false;
-		return new IOSApplication(new BulletTestCollection(), config);
+		return new IOSApplication(new Box2DTestCollection(), config);
 	}
 
 	public static void main(String[] argv) {
