diff --git a/core/src/main/java/org/elasticsearch/plugins/PluginInfo.java b/core/src/main/java/org/elasticsearch/plugins/PluginInfo.java
index 9c0ae89..943f901 100644
--- a/core/src/main/java/org/elasticsearch/plugins/PluginInfo.java
+++ b/core/src/main/java/org/elasticsearch/plugins/PluginInfo.java
@@ -81,7 +81,7 @@
         this.description = in.readString();
         this.version = in.readString();
         this.classname = in.readString();
-        if (in.getVersion().after(Version.V_5_4_0_UNRELEASED)) {
+        if (in.getVersion().onOrAfter(Version.V_5_4_0_UNRELEASED)) {
             hasNativeController = in.readBoolean();
         } else {
             hasNativeController = false;
@@ -94,7 +94,7 @@
         out.writeString(description);
         out.writeString(version);
         out.writeString(classname);
-        if (out.getVersion().after(Version.V_5_4_0_UNRELEASED)) {
+        if (out.getVersion().onOrAfter(Version.V_5_4_0_UNRELEASED)) {
             out.writeBoolean(hasNativeController);
         }
     }
