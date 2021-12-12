diff --git a/src/main/java/com/blade/Blade.java b/src/main/java/com/blade/Blade.java
index 240c0b7..ee9f8a2 100644
--- a/src/main/java/com/blade/Blade.java
+++ b/src/main/java/com/blade/Blade.java
@@ -849,7 +849,7 @@
      */
     public Blade start(Class<?> mainCls, String... args) {
         try {
-            Assert.packageNotEmpty(bootClass,"your main class is empty of package.");
+            Assert.packageNotEmpty(mainCls,"your main class is empty of package.");
             this.loadConfig(args);
 
             this.bootClass = mainCls;
