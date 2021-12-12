diff --git a/src/test/java/reactor/core/publisher/MonoDelayElementTest.java b/src/test/java/reactor/core/publisher/MonoDelayElementTest.java
index be6791f..ae46e5d 100644
--- a/src/test/java/reactor/core/publisher/MonoDelayElementTest.java
+++ b/src/test/java/reactor/core/publisher/MonoDelayElementTest.java
@@ -161,7 +161,7 @@
 		catch (Throwable e) {
 			Throwable t = Exceptions.unwrap(e);
 
-			assertThat(t).isNotEqualTo(e)
+			assertThat(t).isEqualTo(e)
 		                 .isInstanceOf(RejectedExecutionException.class)
 		                 .hasMessage("Scheduler unavailable");
 
