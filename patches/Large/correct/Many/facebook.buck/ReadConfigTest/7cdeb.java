diff --git a/test/com/facebook/buck/skylark/function/ReadConfigTest.java b/test/com/facebook/buck/skylark/function/ReadConfigTest.java
index 0dfb61b..da49a2b 100644
--- a/test/com/facebook/buck/skylark/function/ReadConfigTest.java
+++ b/test/com/facebook/buck/skylark/function/ReadConfigTest.java
@@ -64,19 +64,20 @@
   @Test
   public void defaultValueIsReturned() throws Exception {
     assertThat(
-        evaluate("value = read_config('foo', 'bar', 'baz')").lookup("value"), equalTo("baz"));
+        evaluate("value = read_config('foo', 'bar', 'baz')").moduleLookup("value"), equalTo("baz"));
   }
 
   @Test
   public void noneIsReturnedWhenFieldIsNotPresent() throws Exception {
     assertThat(
-        evaluate("value = read_config('foo', 'bar')").lookup("value"), equalTo(Runtime.NONE));
+        evaluate("value = read_config('foo', 'bar')").moduleLookup("value"), equalTo(Runtime.NONE));
   }
 
   @Test
   public void configValueIsReturnedIfExists() throws Exception {
     rawConfig = ImmutableMap.of("foo", ImmutableMap.of("bar", "value"));
-    assertThat(evaluate("value = read_config('foo', 'bar')").lookup("value"), equalTo("value"));
+    assertThat(
+        evaluate("value = read_config('foo', 'bar')").moduleLookup("value"), equalTo("value"));
   }
 
   private Environment evaluate(String expression) throws IOException, InterruptedException {
