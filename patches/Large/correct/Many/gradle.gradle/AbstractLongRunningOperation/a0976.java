diff --git a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java
index ea49744..bac9118 100644
--- a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java
+++ b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java
@@ -83,7 +83,7 @@
         return getThis();
     }
 
-    public LongRunningOperation withCancellationToken(CancellationToken cancellationToken) {
+    public T withCancellationToken(CancellationToken cancellationToken) {
         operationParamsBuilder.setCancellationToken(Preconditions.checkNotNull(cancellationToken));
         return getThis();
     }
