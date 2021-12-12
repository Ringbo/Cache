diff --git a/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java b/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java
index 03620c7..8a582ad 100644
--- a/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java
+++ b/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java
@@ -169,10 +169,10 @@
 
     // setFrame < minFrame should clamp to minFrame
     animator.setFrame(100);
-    assertEquals(200, animator.getFrame());
+    assertEquals(200f, animator.getFrame());
 
     animator.setFrame(900);
-    assertEquals(800, animator.getFrame());
+    assertEquals(800f, animator.getFrame());
   }
 
   @Test(expected = IllegalArgumentException.class)
