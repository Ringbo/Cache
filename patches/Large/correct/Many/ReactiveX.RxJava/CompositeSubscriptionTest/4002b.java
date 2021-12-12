diff --git a/rxjava-core/src/test/java/rx/subscriptions/CompositeSubscriptionTest.java b/rxjava-core/src/test/java/rx/subscriptions/CompositeSubscriptionTest.java
index 99782f6..ee2df64 100644
--- a/rxjava-core/src/test/java/rx/subscriptions/CompositeSubscriptionTest.java
+++ b/rxjava-core/src/test/java/rx/subscriptions/CompositeSubscriptionTest.java
@@ -238,7 +238,7 @@
         s.clear();
 
         assertTrue(s1.isUnsubscribed());
-        assertTrue(s1.isUnsubscribed());
+        assertTrue(s2.isUnsubscribed());
         assertFalse(s.isUnsubscribed());
 
         BooleanSubscription s3 = new BooleanSubscription();
