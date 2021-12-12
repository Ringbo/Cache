diff --git a/src/com/facebook/buck/lua/AbstractLuaScriptStarter.java b/src/com/facebook/buck/lua/AbstractLuaScriptStarter.java
index 63f71ab..4b2efb3 100644
--- a/src/com/facebook/buck/lua/AbstractLuaScriptStarter.java
+++ b/src/com/facebook/buck/lua/AbstractLuaScriptStarter.java
@@ -43,7 +43,7 @@
 @BuckStyleTuple
 abstract class AbstractLuaScriptStarter implements Starter {
 
-  private static final String STARTER = "com/facebook/buck/lua/starter.lua.in";
+  private static final String STARTER = "starter.lua.in";
 
   abstract ProjectFilesystem getProjectFilesystem();
 
@@ -71,7 +71,8 @@
 
   private String getPureStarterTemplate() {
     try {
-      return Resources.toString(Resources.getResource(STARTER), Charsets.UTF_8);
+      return Resources.toString(
+          Resources.getResource(AbstractLuaScriptStarter.class, STARTER), Charsets.UTF_8);
     } catch (IOException e) {
       throw new RuntimeException(e);
     }
