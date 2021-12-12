diff --git a/platform/core-api/src/com/intellij/psi/stubs/StubIndexKey.java b/platform/core-api/src/com/intellij/psi/stubs/StubIndexKey.java
index 8ea413a..1af1b18 100644
--- a/platform/core-api/src/com/intellij/psi/stubs/StubIndexKey.java
+++ b/platform/core-api/src/com/intellij/psi/stubs/StubIndexKey.java
@@ -28,7 +28,7 @@
     super(name);
   }
 
-  public static <K, Psi extends PsiElement> StubIndexKey<K, Psi> createIndexKey(@NonNls String name) {
+  public static synchronized <K, Psi extends PsiElement> StubIndexKey<K, Psi> createIndexKey(@NonNls String name) {
     return new StubIndexKey<K, Psi>(name);
   }
 
