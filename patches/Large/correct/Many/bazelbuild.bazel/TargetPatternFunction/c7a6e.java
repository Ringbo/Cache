diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/TargetPatternFunction.java b/src/main/java/com/google/devtools/build/lib/skyframe/TargetPatternFunction.java
index 6e631ed..b17a282 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/TargetPatternFunction.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/TargetPatternFunction.java
@@ -105,7 +105,7 @@
       Package pkg;
       try {
         PackageValue pkgValue =
-            (PackageValue) env.getValueOrThrow(pkgKey, NoSuchThingException.class);
+            (PackageValue) env.getValueOrThrow(pkgKey, NoSuchPackageException.class);
         if (pkgValue == null) {
           throw new MissingDepException();
         }
