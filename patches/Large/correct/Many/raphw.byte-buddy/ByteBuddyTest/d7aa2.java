diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTest.java
index 18ff493..b083362 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/ByteBuddyTest.java
@@ -70,7 +70,7 @@
                 .make(TypeResolutionStrategy.Active.INSTANCE)
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getConstructor().newInstance(), instanceOf(type));
+        assertThat(type.getDeclaredConstructor().newInstance(), instanceOf(type));
         assertThat(recorder.counter, is(1));
     }
 
