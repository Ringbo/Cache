diff --git a/core/src/main/java/cucumber/runtime/Runtime.java b/core/src/main/java/cucumber/runtime/Runtime.java
index 9d549d9..9c34ddd 100644
--- a/core/src/main/java/cucumber/runtime/Runtime.java
+++ b/core/src/main/java/cucumber/runtime/Runtime.java
@@ -59,7 +59,7 @@
         this.classLoader = classLoader;
         this.runtimeOptions = runtimeOptions;
         final Glue glue;
-        glue = optionalGlue == null ? new RuntimeGlue(new LocalizedXStreams(classLoader)) : optionalGlue;
+        glue = optionalGlue == null ? new RuntimeGlue(new LocalizedXStreams(classLoader, runtimeOptions.getConverters())) : optionalGlue;
         this.stats = new Stats(runtimeOptions.isMonochrome());
         this.bus = new EventBus(stopWatch);
         this.runner = new Runner(glue, bus, backends, runtimeOptions);
