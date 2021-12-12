diff --git a/base/src/com/thoughtworks/go/util/SystemEnvironment.java b/base/src/com/thoughtworks/go/util/SystemEnvironment.java
index ef4d8dc..39cdd45 100644
--- a/base/src/com/thoughtworks/go/util/SystemEnvironment.java
+++ b/base/src/com/thoughtworks/go/util/SystemEnvironment.java
@@ -619,7 +619,7 @@
     }
 
     public String getBundledPluginAbsolutePath() {
-        return new File(get(PLUGIN_BUNDLE_PATH)).getAbsolutePath();
+        return new File(get(PLUGIN_GO_PROVIDED_PATH)).getAbsolutePath();
     }
 
     public <T> void reset(GoSystemProperty<T> systemProperty) {
