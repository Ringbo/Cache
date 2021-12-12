diff --git a/src/com/facebook/buck/jvm/java/DefaultJavaLibrary.java b/src/com/facebook/buck/jvm/java/DefaultJavaLibrary.java
index 6817522..8f6aefc 100644
--- a/src/com/facebook/buck/jvm/java/DefaultJavaLibrary.java
+++ b/src/com/facebook/buck/jvm/java/DefaultJavaLibrary.java
@@ -396,7 +396,7 @@
     // Add any exported deps.
     for (BuildRule exported : getExportedDeps()) {
       if (exported instanceof JavaLibrary) {
-        builder.addAll(((JavaLibrary) exported).getTransitiveClasspaths());
+        builder.addAll(((JavaLibrary) exported).getImmediateClasspaths());
       }
     }
 
