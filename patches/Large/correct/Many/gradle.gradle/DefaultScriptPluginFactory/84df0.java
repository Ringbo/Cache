diff --git a/subprojects/core/src/main/java/org/gradle/configuration/DefaultScriptPluginFactory.java b/subprojects/core/src/main/java/org/gradle/configuration/DefaultScriptPluginFactory.java
index 51b64c1..40859bd 100755
--- a/subprojects/core/src/main/java/org/gradle/configuration/DefaultScriptPluginFactory.java
+++ b/subprojects/core/src/main/java/org/gradle/configuration/DefaultScriptPluginFactory.java
@@ -136,7 +136,7 @@
             };
             services.add(ScriptPluginFactory.class, scriptPluginFactory);
             services.add(ScriptHandlerFactory.class, scriptHandlerFactory);
-            services.add(ClassLoaderScope.class, targetScope);
+            services.add(ClassLoaderScope.class, baseScope);
             services.add(LoggingManagerInternal.class, loggingManagerFactory.create());
             services.add(Instantiator.class, instantiator);
             services.add(ScriptHandler.class, scriptHandler);
