diff --git a/src/com/facebook/buck/lua/AbstractNativeExecutableStarter.java b/src/com/facebook/buck/lua/AbstractNativeExecutableStarter.java
index b07ac3a..de18f66 100644
--- a/src/com/facebook/buck/lua/AbstractNativeExecutableStarter.java
+++ b/src/com/facebook/buck/lua/AbstractNativeExecutableStarter.java
@@ -71,8 +71,7 @@
 @BuckStyleTuple
 abstract class AbstractNativeExecutableStarter implements Starter, NativeLinkTarget {
 
-  private static final String NATIVE_STARTER_CXX_SOURCE =
-      "com/facebook/buck/lua/native-starter.cpp.in";
+  private static final String NATIVE_STARTER_CXX_SOURCE = "native-starter.cpp.in";
 
   abstract ProjectFilesystem getProjectFilesystem();
 
@@ -106,7 +105,9 @@
 
   private String getNativeStarterCxxSourceTemplate() {
     try {
-      return Resources.toString(Resources.getResource(NATIVE_STARTER_CXX_SOURCE), Charsets.UTF_8);
+      return Resources.toString(
+          Resources.getResource(AbstractNativeExecutableStarter.class, NATIVE_STARTER_CXX_SOURCE),
+          Charsets.UTF_8);
     } catch (IOException e) {
       throw new RuntimeException(e);
     }
