diff --git a/base/src/com/thoughtworks/go/util/SystemEnvironment.java b/base/src/com/thoughtworks/go/util/SystemEnvironment.java
index 7efcfae..36e75a5 100644
--- a/base/src/com/thoughtworks/go/util/SystemEnvironment.java
+++ b/base/src/com/thoughtworks/go/util/SystemEnvironment.java
@@ -618,7 +618,7 @@
     }
 
     public String getBundledPluginAbsolutePath() {
-        return new File(get(PLUGIN_BUNDLE_PATH)).getAbsolutePath();
+        return new File(get(PLUGIN_GO_PROVIDED_PATH)).getAbsolutePath();
     }
 
     public <T> void reset(GoSystemProperty<T> systemProperty) {
