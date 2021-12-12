diff --git a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
index b8e8441..e0b4d91 100644
--- a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
+++ b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
@@ -36,7 +36,7 @@
     SonarRuntime runtime = SonarRuntimeImpl.forSonarLint(Version.parse("5.4"));
     Plugin.Context context = new Plugin.Context(runtime);
     new XooPlugin().define(context);
-    assertThat(context.getExtensions()).hasSize(43).doesNotContain(CpdTokenizerSensor.class);
+    assertThat(context.getExtensions()).hasSize(44).doesNotContain(CpdTokenizerSensor.class);
   }
 
   @Test
@@ -44,6 +44,6 @@
     SonarRuntime runtime = SonarRuntimeImpl.forSonarQube(Version.parse("5.5"), SonarQubeSide.SCANNER);
     Plugin.Context context = new Plugin.Context(runtime);
     new XooPlugin().define(context);
-    assertThat(context.getExtensions()).hasSize(46).contains(CpdTokenizerSensor.class);
+    assertThat(context.getExtensions()).hasSize(47).contains(CpdTokenizerSensor.class);
   }
 }
