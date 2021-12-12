diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/mvc/MvcRunConfiguration.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/mvc/MvcRunConfiguration.java
index 9d5d4dc..8d3dd99 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/mvc/MvcRunConfiguration.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/mvc/MvcRunConfiguration.java
@@ -171,7 +171,7 @@
     cmdLine = JDOMExternalizer.readString(element, "cmdLine");
 
     String sPassParentEnviroment = JDOMExternalizer.readString(element, "passParentEnv");
-    passParentEnv = StringUtil.isEmpty(sPassParentEnviroment) ? true : Boolean.parseBoolean(sPassParentEnviroment);
+    passParentEnv = StringUtil.isEmpty(sPassParentEnviroment) || Boolean.parseBoolean(sPassParentEnviroment);
 
     envs.clear();
     JDOMExternalizer.readMap(element, envs, null, "env");
@@ -242,7 +242,7 @@
 
   }
 
-  protected MvcCommandLineState createCommandLineState(@NotNull ExecutionEnvironment environment, Module module) {
+  protected RunProfileState createCommandLineState(@NotNull ExecutionEnvironment environment, @NotNull Module module) {
     return new MvcCommandLineState(environment, cmdLine, module, false);
   }
 
@@ -257,9 +257,9 @@
 
     protected String myCmdLine;
 
-    protected final Module myModule;
+    protected final @NotNull Module myModule;
 
-    public MvcCommandLineState(@NotNull ExecutionEnvironment environment, String cmdLine, Module module, boolean forTests) {
+    public MvcCommandLineState(@NotNull ExecutionEnvironment environment, String cmdLine, @NotNull Module module, boolean forTests) {
       super(environment);
       myModule = module;
       myForTests = forTests;
