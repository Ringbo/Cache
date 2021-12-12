diff --git a/subprojects/language-native/src/main/java/org/gradle/language/rc/plugins/WindowsResourcesPlugin.java b/subprojects/language-native/src/main/java/org/gradle/language/rc/plugins/WindowsResourcesPlugin.java
index 12f590e..c2dcce8 100644
--- a/subprojects/language-native/src/main/java/org/gradle/language/rc/plugins/WindowsResourcesPlugin.java
+++ b/subprojects/language-native/src/main/java/org/gradle/language/rc/plugins/WindowsResourcesPlugin.java
@@ -34,7 +34,7 @@
 public class WindowsResourcesPlugin implements Plugin<Project> {
     public void apply(Project project) {
         project.apply(Collections.singletonMap("plugin", NativeComponentPlugin.class));
-        project.apply(Collections.singletonMap("plugin", WindowsResourcesPlugin.class));
+        project.apply(Collections.singletonMap("plugin", WindowsResourceScriptPlugin.class));
     }
 
 }
