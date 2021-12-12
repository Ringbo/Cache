diff --git a/junit/src/test/java/cucumber/runtime/junit/RuntimeOptionsFactoryTest.java b/junit/src/test/java/cucumber/runtime/junit/RuntimeOptionsFactoryTest.java
index b26310c..604d4f8 100644
--- a/junit/src/test/java/cucumber/runtime/junit/RuntimeOptionsFactoryTest.java
+++ b/junit/src/test/java/cucumber/runtime/junit/RuntimeOptionsFactoryTest.java
@@ -113,7 +113,7 @@
         RuntimeOptionsFactory runtimeOptionsFactory = new RuntimeOptionsFactory(SubClassWithMonoChromeTrue.class);
         RuntimeOptions runtimeOptions = runtimeOptionsFactory.create();
 
-        assertFalse(runtimeOptions.isMonochrome());
+        assertTrue(runtimeOptions.isMonochrome());
     }
 
 
@@ -166,12 +166,12 @@
         // empty
     }
 
-    @Cucumber.Options(monochrome = false)
+    @Cucumber.Options(monochrome = true)
     static class SubClassWithMonoChromeTrue extends BaseClassWithMonoChromeFalse {
         // empty
     }
 
-    @Cucumber.Options(monochrome = true)
+    @Cucumber.Options(monochrome = false)
     static class BaseClassWithMonoChromeFalse {
         // empty
     }
