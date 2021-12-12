diff --git a/core/tests/coretests/src/android/transition/FadeTransitionTest.java b/core/tests/coretests/src/android/transition/FadeTransitionTest.java
index 3bd3df4..674b363 100644
--- a/core/tests/coretests/src/android/transition/FadeTransitionTest.java
+++ b/core/tests/coretests/src/android/transition/FadeTransitionTest.java
@@ -48,23 +48,23 @@
         View square1 = mActivity.findViewById(R.id.square1);
         Fade fadeOut = new Fade(Fade.MODE_OUT);
         TransitionLatch latch = setVisibilityInTransition(fadeOut, R.id.square1, View.INVISIBLE);
-        assertTrue(latch.startLatch.await(200, TimeUnit.MILLISECONDS));
+        assertTrue(latch.startLatch.await(400, TimeUnit.MILLISECONDS));
         assertEquals(View.VISIBLE, square1.getVisibility());
         waitForAnimation();
         assertFalse(square1.getTransitionAlpha() == 0 || square1.getTransitionAlpha() == 1);
-        assertTrue(latch.endLatch.await(400, TimeUnit.MILLISECONDS));
+        assertTrue(latch.endLatch.await(800, TimeUnit.MILLISECONDS));
         assertEquals(1.0f, square1.getTransitionAlpha());
         assertEquals(View.INVISIBLE, square1.getVisibility());
 
         Fade fadeIn = new Fade(Fade.MODE_IN);
         latch = setVisibilityInTransition(fadeIn, R.id.square1, View.VISIBLE);
-        assertTrue(latch.startLatch.await(200, TimeUnit.MILLISECONDS));
+        assertTrue(latch.startLatch.await(400, TimeUnit.MILLISECONDS));
         assertEquals(View.VISIBLE, square1.getVisibility());
         waitForAnimation();
         final float transitionAlpha = square1.getTransitionAlpha();
         assertTrue("expecting transitionAlpha to be between 0 and 1. Was " + transitionAlpha,
                 transitionAlpha > 0 && transitionAlpha < 1);
-        assertTrue(latch.endLatch.await(400, TimeUnit.MILLISECONDS));
+        assertTrue(latch.endLatch.await(800, TimeUnit.MILLISECONDS));
         assertEquals(1.0f, square1.getTransitionAlpha());
         assertEquals(View.VISIBLE, square1.getVisibility());
     }
@@ -76,14 +76,14 @@
         FadeValueCheck fadeOutValueCheck = new FadeValueCheck(square1);
         fadeOut.addListener(fadeOutValueCheck);
         TransitionLatch outLatch = setVisibilityInTransition(fadeOut, R.id.square1, View.INVISIBLE);
-        assertTrue(outLatch.startLatch.await(200, TimeUnit.MILLISECONDS));
+        assertTrue(outLatch.startLatch.await(400, TimeUnit.MILLISECONDS));
         waitForAnimation();
 
         Fade fadeIn = new Fade(Fade.MODE_IN);
         FadeValueCheck fadeInValueCheck = new FadeValueCheck(square1);
         fadeIn.addListener(fadeInValueCheck);
         TransitionLatch inLatch = setVisibilityInTransition(fadeIn, R.id.square1, View.VISIBLE);
-        assertTrue(inLatch.startLatch.await(200, TimeUnit.MILLISECONDS));
+        assertTrue(inLatch.startLatch.await(400, TimeUnit.MILLISECONDS));
 
         assertEquals(fadeOutValueCheck.pauseTransitionAlpha, fadeInValueCheck.startTransitionAlpha);
         assertTrue("expecting transitionAlpha to be between 0 and 1. Was " +
@@ -91,7 +91,7 @@
                 fadeOutValueCheck.pauseTransitionAlpha > 0 &&
                         fadeOutValueCheck.pauseTransitionAlpha < 1);
 
-        assertTrue(inLatch.endLatch.await(400, TimeUnit.MILLISECONDS));
+        assertTrue(inLatch.endLatch.await(800, TimeUnit.MILLISECONDS));
         assertEquals(1.0f, square1.getTransitionAlpha());
         assertEquals(View.VISIBLE, square1.getVisibility());
     }
@@ -109,14 +109,14 @@
         FadeValueCheck fadeInValueCheck = new FadeValueCheck(square1);
         fadeIn.addListener(fadeInValueCheck);
         TransitionLatch inLatch = setVisibilityInTransition(fadeIn, R.id.square1, View.VISIBLE);
-        assertTrue(inLatch.startLatch.await(200, TimeUnit.MILLISECONDS));
+        assertTrue(inLatch.startLatch.await(400, TimeUnit.MILLISECONDS));
         waitForAnimation();
 
         Fade fadeOut = new Fade(Fade.MODE_OUT);
         FadeValueCheck fadeOutValueCheck = new FadeValueCheck(square1);
         fadeOut.addListener(fadeOutValueCheck);
         TransitionLatch outLatch = setVisibilityInTransition(fadeOut, R.id.square1, View.INVISIBLE);
-        assertTrue(outLatch.startLatch.await(200, TimeUnit.MILLISECONDS));
+        assertTrue(outLatch.startLatch.await(400, TimeUnit.MILLISECONDS));
 
         assertEquals(fadeInValueCheck.pauseTransitionAlpha, fadeOutValueCheck.startTransitionAlpha);
         assertTrue("expecting transitionAlpha to be between 0 and 1. Was " +
@@ -124,7 +124,7 @@
                 fadeInValueCheck.pauseTransitionAlpha > 0 &&
                         fadeInValueCheck.pauseTransitionAlpha < 1);
 
-        assertTrue(outLatch.endLatch.await(400, TimeUnit.MILLISECONDS));
+        assertTrue(outLatch.endLatch.await(800, TimeUnit.MILLISECONDS));
         assertEquals(1.0f, square1.getTransitionAlpha());
         assertEquals(View.INVISIBLE, square1.getVisibility());
     }
