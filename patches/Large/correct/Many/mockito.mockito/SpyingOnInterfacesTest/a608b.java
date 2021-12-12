diff --git a/src/test/java/org/mockitousage/spies/SpyingOnInterfacesTest.java b/src/test/java/org/mockitousage/spies/SpyingOnInterfacesTest.java
index 22d6b26..dd800d9 100644
--- a/src/test/java/org/mockitousage/spies/SpyingOnInterfacesTest.java
+++ b/src/test/java/org/mockitousage/spies/SpyingOnInterfacesTest.java
@@ -64,7 +64,7 @@
 
     @Test
     public void shouldAllowDelegatingToDefaultMethod() throws Exception {
-        assumeTrue(ClassFileVersion.forCurrentJavaVersion().isAtLeast(ClassFileVersion.JAVA_V8));
+        assumeTrue(ClassFileVersion.forThisVm().isAtLeast(ClassFileVersion.JAVA_V8));
 
         Class<?> type = new ByteBuddy()
                 .makeInterface()
@@ -86,7 +86,7 @@
 
     @Test
     public void shouldAllowSpyingOnDefaultMethod() throws Exception {
-        assumeTrue(ClassFileVersion.forCurrentJavaVersion().isAtLeast(ClassFileVersion.JAVA_V8));
+        assumeTrue(ClassFileVersion.forThisVm().isAtLeast(ClassFileVersion.JAVA_V8));
 
         Class<?> iFace = new ByteBuddy()
                 .makeInterface()
