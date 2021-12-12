diff --git a/test/com/facebook/buck/skylark/function/SkylarkNativeModuleTest.java b/test/com/facebook/buck/skylark/function/SkylarkNativeModuleTest.java
index 16598f9..34e2968 100644
--- a/test/com/facebook/buck/skylark/function/SkylarkNativeModuleTest.java
+++ b/test/com/facebook/buck/skylark/function/SkylarkNativeModuleTest.java
@@ -63,7 +63,7 @@
 
   @Test
   public void defaultValueIsReturned() throws Exception {
-    assertThat(evaluate("pkg = package_name()").lookup("pkg"), equalTo("my/package"));
+    assertThat(evaluate("pkg = package_name()").moduleLookup("pkg"), equalTo("my/package"));
   }
 
   private Environment evaluate(String expression) throws IOException, InterruptedException {
