diff --git a/src/test/java/reactor/core/publisher/MonoFirstTest.java b/src/test/java/reactor/core/publisher/MonoFirstTest.java
index ee6acc9..a2b5ea6 100644
--- a/src/test/java/reactor/core/publisher/MonoFirstTest.java
+++ b/src/test/java/reactor/core/publisher/MonoFirstTest.java
@@ -93,7 +93,7 @@
 		Assert.assertTrue(f instanceof MonoFirst);
 		MonoFirst<Integer> s = (MonoFirst<Integer>) f;
 		Assert.assertTrue(s.array != null);
-		Assert.assertTrue(s.array.length == 3);
+		Assert.assertTrue(s.array.length == 2);
 
 		f.subscribeWith(AssertSubscriber.create())
 		 .assertValues(1)
