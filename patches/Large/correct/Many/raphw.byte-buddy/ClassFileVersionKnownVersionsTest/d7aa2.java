diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/ClassFileVersionKnownVersionsTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/ClassFileVersionKnownVersionsTest.java
index c172fdb..1419ede 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/ClassFileVersionKnownVersionsTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/ClassFileVersionKnownVersionsTest.java
@@ -110,7 +110,7 @@
                     .make()
                     .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                     .getLoaded();
-            assertThat(type.getConstructor().newInstance(), notNullValue(Object.class));
+            assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(Object.class));
         }
     }
 
