diff --git a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
index f4184d1..33ec8a5 100644
--- a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
+++ b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
@@ -39,6 +39,6 @@
 
     context = new Plugin.Context(new SonarRuntime(Version.parse("5.4"), SonarProduct.SONARLINT, null));
     new XooPlugin().define(context);
-    assertThat(context.getExtensions()).hasSize(41).doesNotContain(CpdTokenizerSensor.class);
+    assertThat(context.getExtensions()).hasSize(39).doesNotContain(CpdTokenizerSensor.class);
   }
 }
