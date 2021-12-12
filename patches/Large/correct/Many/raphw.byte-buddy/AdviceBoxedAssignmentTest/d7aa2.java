diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceBoxedAssignmentTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceBoxedAssignmentTest.java
index b3b5d9e..2e95ad4 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceBoxedAssignmentTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceBoxedAssignmentTest.java
@@ -53,7 +53,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getConstructor().newInstance()), is(expected));
+        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getDeclaredConstructor().newInstance()), is(expected));
     }
 
     @SuppressWarnings("all")
