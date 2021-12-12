diff --git a/sdks/java/extensions/euphoria/euphoria-fluent/src/test/java/cz/seznam/euphoria/fluent/FluentTest.java b/sdks/java/extensions/euphoria/euphoria-fluent/src/test/java/cz/seznam/euphoria/fluent/FluentTest.java
index ed3740a..6a03cf2 100644
--- a/sdks/java/extensions/euphoria/euphoria-fluent/src/test/java/cz/seznam/euphoria/fluent/FluentTest.java
+++ b/sdks/java/extensions/euphoria/euphoria-fluent/src/test/java/cz/seznam/euphoria/fluent/FluentTest.java
@@ -18,7 +18,7 @@
 public class FluentTest {
 
   @Test
-  public void testBasics() {
+  public void testBasics() throws Exception {
     final long READ_DELAY_MS = 100L;
     ListDataSink<Set<String>> out = ListDataSink.get(1);
     Fluent.flow("Test")
