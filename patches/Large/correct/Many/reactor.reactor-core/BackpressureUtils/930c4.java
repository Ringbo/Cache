diff --git a/src/main/java/reactor/core/util/BackpressureUtils.java b/src/main/java/reactor/core/util/BackpressureUtils.java
index 74af1dc..e830cce 100644
--- a/src/main/java/reactor/core/util/BackpressureUtils.java
+++ b/src/main/java/reactor/core/util/BackpressureUtils.java
@@ -425,7 +425,7 @@
 	 *
 	 */
 	public static void reportSubscriptionSet() {
-		throw Exceptions.argumentIsNullException();
+		throw Exceptions.duplicateOnSubscribeException();
 	}
 
 	/**
