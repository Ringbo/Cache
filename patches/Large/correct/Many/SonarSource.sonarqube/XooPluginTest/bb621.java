diff --git a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
index e810074..193f3b9 100644
--- a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
+++ b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/XooPluginTest.java
@@ -27,6 +27,6 @@
 
   @Test
   public void provide_extensions() {
-    assertThat(new XooPlugin().getExtensions()).hasSize(14);
+    assertThat(new XooPlugin().getExtensions()).hasSize(17);
   }
 }
