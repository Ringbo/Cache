diff --git a/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/DefaultJarFile.java b/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/DefaultJarFile.java
index 049582d..e7c7d7c 100644
--- a/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/DefaultJarFile.java
+++ b/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/DefaultJarFile.java
@@ -25,7 +25,7 @@
     private File file;
 
     public DefaultJarFile(ComponentSpecIdentifier identifier) {
-        super(identifier, DefaultJarFile.class);
+        super(identifier, JarFile.class);
     }
 
     @Override
