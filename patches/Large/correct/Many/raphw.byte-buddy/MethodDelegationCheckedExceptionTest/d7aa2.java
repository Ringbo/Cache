diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationCheckedExceptionTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationCheckedExceptionTest.java
index 143032e..d1ed42f 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationCheckedExceptionTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationCheckedExceptionTest.java
@@ -8,7 +8,7 @@
     public void testUndeclaredCheckedException() throws Exception {
         implement(Foo.class, MethodDelegation.to(Foo.class))
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .bar();
     }
