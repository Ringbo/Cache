diff --git a/src/test/java/com/zaxxer/hikari/pool/TestConcurrentBag.java b/src/test/java/com/zaxxer/hikari/pool/TestConcurrentBag.java
index 5187588..bfc2686 100644
--- a/src/test/java/com/zaxxer/hikari/pool/TestConcurrentBag.java
+++ b/src/test/java/com/zaxxer/hikari/pool/TestConcurrentBag.java
@@ -89,7 +89,7 @@
       PrintStream ps = new PrintStream(baos, true);
       TestElf.setSlf4jTargetStream(ConcurrentBag.class, ps);
 
-      bag.requite(reserved);
+      bag.recycle(reserved);
 
       bag.remove(notinuse);
       Assert.assertTrue(new String(baos.toByteArray()).contains("not borrowed or reserved"));
