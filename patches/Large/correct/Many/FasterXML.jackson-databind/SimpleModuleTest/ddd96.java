diff --git a/src/test/java/com/fasterxml/jackson/databind/module/SimpleModuleTest.java b/src/test/java/com/fasterxml/jackson/databind/module/SimpleModuleTest.java
index 239e488..134dee0 100644
--- a/src/test/java/com/fasterxml/jackson/databind/module/SimpleModuleTest.java
+++ b/src/test/java/com/fasterxml/jackson/databind/module/SimpleModuleTest.java
@@ -146,7 +146,7 @@
         }
     }
 
-    protected static class ContextVerifierModule extends Module
+    protected static class ContextVerifierModule extends com.fasterxml.jackson.databind.Module
     {
         @Override
         public String getModuleName() { return "x"; }
@@ -241,7 +241,7 @@
         SimpleModule mod = new SimpleModule("test", Version.unknownVersion());
         mod.addSerializer(new BaseSerializer());
         // and another variant here too
-        List<Module> mods = Arrays.asList((Module) mod);
+        List<SimpleModule> mods = Arrays.asList(mod);
         mapper.registerModules(mods);
         assertEquals(quote("Base:1"), mapper.writeValueAsString(new Impl1()));
         assertEquals(quote("Base:2"), mapper.writeValueAsString(new Impl2()));
@@ -340,7 +340,7 @@
 
     public void testAutoDiscovery() throws Exception
     {
-        List<Module> mods = ObjectMapper.findModules();
+        List<?> mods = ObjectMapper.findModules();
         assertEquals(0, mods.size());
     }
 }
