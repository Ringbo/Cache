diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleWeaklyReferencedTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleWeaklyReferencedTest.java
index 151a2dc..0d81250 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleWeaklyReferencedTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/ClassFileLocatorForModuleWeaklyReferencedTest.java
@@ -99,7 +99,7 @@
     public void testLocateModules() throws Exception {
         ClassFileLocator classFileLocator = new ClassFileLocator.ForModule.WeaklyReferenced(JavaModule.ofType(Object.class).unwrap());
         assertThat(classFileLocator.locate(Object.class.getName()).isResolved(), is(true));
-        assertThat(classFileLocator.locate(getClass().getName()).isResolved(), is(true));
+        assertThat(classFileLocator.locate(getClass().getName()).isResolved(), is(false));
     }
 
     @Test
