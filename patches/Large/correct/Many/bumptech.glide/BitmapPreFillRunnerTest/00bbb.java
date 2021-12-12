diff --git a/library/src/test/java/com/bumptech/glide/load/engine/prefill/BitmapPreFillRunnerTest.java b/library/src/test/java/com/bumptech/glide/load/engine/prefill/BitmapPreFillRunnerTest.java
index 6c1bafb..d00b031 100644
--- a/library/src/test/java/com/bumptech/glide/load/engine/prefill/BitmapPreFillRunnerTest.java
+++ b/library/src/test/java/com/bumptech/glide/load/engine/prefill/BitmapPreFillRunnerTest.java
@@ -129,7 +129,7 @@
   public void testPreFillHandlerDoesNotPostIfHasNoBitmapsToAllocate() {
     BitmapPreFillRunner handler = getHandler(new HashMap<PreFillType, Integer>());
     handler.run();
-    verify(mainHandler, never()).postDelayed(any(Runnable.class), anyInt());
+    verify(mainHandler, never()).postDelayed(any(Runnable.class), anyLong());
   }
 
   @Test
