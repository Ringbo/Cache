diff --git a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/HostLanguageTest.java b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/HostLanguageTest.java
index 42e462e..08d27fa 100644
--- a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/HostLanguageTest.java
+++ b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/HostLanguageTest.java
@@ -39,7 +39,7 @@
 
     @Test
     public void testHostLanguage() {
-        Context context = Context.newBuilder("java").setOption("java.AllowClassLoading", "true").build();
+        Context context = Context.newBuilder("java").option("java.AllowClassLoading", "true").build();
         Language language = context.getEngine().getLanguage("java");
 
         assertTrue(language.isHost());
