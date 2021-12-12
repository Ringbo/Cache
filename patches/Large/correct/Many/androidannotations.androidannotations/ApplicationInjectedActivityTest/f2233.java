diff --git a/AndroidAnnotations/functional-test-1-5-tests/src/test/java/org/androidannotations/test15/ApplicationInjectedActivityTest.java b/AndroidAnnotations/functional-test-1-5-tests/src/test/java/org/androidannotations/test15/ApplicationInjectedActivityTest.java
index 15c8d8d..4ab3ae8 100644
--- a/AndroidAnnotations/functional-test-1-5-tests/src/test/java/org/androidannotations/test15/ApplicationInjectedActivityTest.java
+++ b/AndroidAnnotations/functional-test-1-5-tests/src/test/java/org/androidannotations/test15/ApplicationInjectedActivityTest.java
@@ -27,7 +27,7 @@
 	
 	@Test
 	public void should_have_application_after_create() {
-		new SampleRoboApplication().onCreate();
+		new SampleRoboApplication_().onCreate();
 		ApplicationInjectedActivity_ activity = new ApplicationInjectedActivity_();
 		
 		activity.onCreate(null);
