diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleTest.java
index 62f6b28..e214c31 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleTest.java
@@ -88,7 +88,7 @@
     public void testBootPath() throws Exception {
         ClassFileLocator classFileLocator = ClassFileLocator.ForModule.ofBootLayer();
         assertThat(classFileLocator.locate(Object.class.getName()).isResolved(), is(true));
-        assertThat(classFileLocator.locate(getClass().getName()).isResolved(), is(true));
+        assertThat(classFileLocator.locate(getClass().getName()).isResolved(), is(false));
     }
 
     @Test
