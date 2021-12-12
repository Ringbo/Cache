diff --git a/portal-test/src/com/liferay/portal/kernel/test/rule/callback/SynchronousDestinationTestCallback.java b/portal-test/src/com/liferay/portal/kernel/test/rule/callback/SynchronousDestinationTestCallback.java
index 3d9d3dd..87baa45 100644
--- a/portal-test/src/com/liferay/portal/kernel/test/rule/callback/SynchronousDestinationTestCallback.java
+++ b/portal-test/src/com/liferay/portal/kernel/test/rule/callback/SynchronousDestinationTestCallback.java
@@ -123,7 +123,7 @@
 				_asyncServiceDestinations.add(destination);
 
 				messageBus.replace(
-					createSynchronousDestination(destinationName));
+					createSynchronousDestination(destinationName), false);
 			}
 
 			if (destination == null) {
