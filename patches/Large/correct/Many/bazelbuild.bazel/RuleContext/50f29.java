diff --git a/src/main/java/com/google/devtools/build/lib/analysis/RuleContext.java b/src/main/java/com/google/devtools/build/lib/analysis/RuleContext.java
index 9d21ec6..12916b3 100644
--- a/src/main/java/com/google/devtools/build/lib/analysis/RuleContext.java
+++ b/src/main/java/com/google/devtools/build/lib/analysis/RuleContext.java
@@ -284,7 +284,7 @@
         + "in %s configuration in order to access it.%s",
         rule.getRuleClass(), name, FragmentCollection.getConfigurationName(config),
         additionalErrorMessage);
-    return getConfiguration().getFragment(fragment);
+    return getConfiguration(config).getFragment(fragment);
   }
 
   @Nullable
@@ -295,7 +295,8 @@
 
   @Nullable
   public Fragment getSkylarkFragment(String name, ConfigurationTransition config) {
-    Class<? extends Fragment> fragmentClass = getConfiguration().getSkylarkFragmentByName(name);
+    Class<? extends Fragment> fragmentClass =
+        getConfiguration(config).getSkylarkFragmentByName(name);
     if (fragmentClass == null) {
       return null;
     }
