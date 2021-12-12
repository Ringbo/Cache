diff --git a/src/main/java/com/google/devtools/build/lib/packages/PackageFactory.java b/src/main/java/com/google/devtools/build/lib/packages/PackageFactory.java
index 73ff55d..5a37b9d 100644
--- a/src/main/java/com/google/devtools/build/lib/packages/PackageFactory.java
+++ b/src/main/java/com/google/devtools/build/lib/packages/PackageFactory.java
@@ -274,7 +274,7 @@
       this.globCache = globCache;
     }
 
-    private class Token extends Globber.Token {
+    private static class Token extends Globber.Token {
       public final List<String> includes;
       public final List<String> excludes;
       public final boolean excludeDirs;
@@ -935,11 +935,11 @@
     if (val instanceof TriState) {
       switch ((TriState) val) {
         case AUTO:
-          return new Integer(-1);
+          return Integer.valueOf(-1);
         case YES:
-          return new Integer(1);
+          return Integer.valueOf(1);
         case NO:
-          return new Integer(0);
+          return Integer.valueOf(0);
       }
     }
 
