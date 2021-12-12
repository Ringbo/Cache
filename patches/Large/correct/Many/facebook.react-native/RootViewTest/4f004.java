diff --git a/ReactAndroid/src/test/java/com/facebook/react/RootViewTest.java b/ReactAndroid/src/test/java/com/facebook/react/RootViewTest.java
index 2eb7f5e..05d679a 100644
--- a/ReactAndroid/src/test/java/com/facebook/react/RootViewTest.java
+++ b/ReactAndroid/src/test/java/com/facebook/react/RootViewTest.java
@@ -65,7 +65,7 @@
 
   @Before
   public void setUp() {
-    final long ts = SystemClock.nanoTime();
+    final long ts = SystemClock.uptimeMillis();
     PowerMockito.mockStatic(Arguments.class);
     PowerMockito.when(Arguments.createArray()).thenAnswer(new Answer<Object>() {
       @Override
@@ -80,7 +80,7 @@
       }
     });
     PowerMockito.mockStatic(SystemClock.class);
-    PowerMockito.when(SystemClock.nanoTime()).thenAnswer(new Answer<Object>() {
+    PowerMockito.when(SystemClock.uptimeMillis()).thenAnswer(new Answer<Object>() {
       @Override
       public Object answer(InvocationOnMock invocation) throws Throwable {
         return ts;
@@ -116,7 +116,7 @@
     rootView.startReactApplication(instanceManager, "");
     rootView.simulateAttachForTesting();
 
-    long ts = SystemClock.nanoTime();
+    long ts = SystemClock.uptimeMillis();
 
     // Test ACTION_DOWN event
     rootView.onTouchEvent(
