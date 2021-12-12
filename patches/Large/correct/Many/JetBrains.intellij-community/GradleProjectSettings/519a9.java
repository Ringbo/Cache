diff --git a/plugins/gradle/src/org/jetbrains/plugins/gradle/settings/GradleProjectSettings.java b/plugins/gradle/src/org/jetbrains/plugins/gradle/settings/GradleProjectSettings.java
index ba3b3e5..4633213 100644
--- a/plugins/gradle/src/org/jetbrains/plugins/gradle/settings/GradleProjectSettings.java
+++ b/plugins/gradle/src/org/jetbrains/plugins/gradle/settings/GradleProjectSettings.java
@@ -220,7 +220,7 @@
     @Override
     public ThreeState fromString(@NotNull String value) {
       if (StringUtil.isEmpty(value)) return ThreeState.UNSURE;
-      return ThreeState.fromBoolean(Boolean.getBoolean(value));
+      return ThreeState.fromBoolean(Boolean.valueOf(value));
     }
 
     @Nullable
