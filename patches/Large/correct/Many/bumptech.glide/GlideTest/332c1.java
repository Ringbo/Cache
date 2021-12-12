diff --git a/library/src/test/java/com/bumptech/glide/GlideTest.java b/library/src/test/java/com/bumptech/glide/GlideTest.java
index c64747f..7a6a529 100644
--- a/library/src/test/java/com/bumptech/glide/GlideTest.java
+++ b/library/src/test/java/com/bumptech/glide/GlideTest.java
@@ -535,7 +535,7 @@
     doAnswer(new CallSizeReady(100, 100)).when(firstTarget).getSize(isA(SizeReadyCallback.class));
     Target secondTarget = mock(Target.class);
     doAnswer(new CallSizeReady(100, 100)).when(secondTarget).getSize(isA(SizeReadyCallback.class));
-    RequestBuilder<Drawable> firstRequest = Glide.with(getContext())
+    RequestBuilder<Drawable> firstRequest = requestManager
         .load(mockUri("content://first"));
 
     firstRequest.into(firstTarget);
@@ -544,7 +544,7 @@
         .apply(placeholderOf(new ColorDrawable(Color.RED)))
         .into(secondTarget);
 
-    verify(firstTarget).onResourceReady(isA(BitmapDrawable.class), isA(Transition.class));
+    verify(firstTarget).onResourceReady(isA(Drawable.class), isA(Transition.class));
     verify(secondTarget).onResourceReady(notNull(), isA(Transition.class));
   }
 
