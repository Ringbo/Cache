diff --git a/src/main/java/com/google/devtools/build/lib/analysis/config/BuildOptions.java b/src/main/java/com/google/devtools/build/lib/analysis/config/BuildOptions.java
index 9272188c..46842ae 100644
--- a/src/main/java/com/google/devtools/build/lib/analysis/config/BuildOptions.java
+++ b/src/main/java/com/google/devtools/build/lib/analysis/config/BuildOptions.java
@@ -153,7 +153,7 @@
    */
   public <T extends FragmentOptions> T get(Class<T> optionsClass) {
     FragmentOptions options = fragmentOptionsMap.get(optionsClass);
-    Preconditions.checkNotNull(options);
+    Preconditions.checkNotNull(options, "fragment options unavailable: " + optionsClass.getName());
     return optionsClass.cast(options);
   }
 
