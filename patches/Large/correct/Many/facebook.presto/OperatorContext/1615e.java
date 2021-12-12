diff --git a/presto-main/src/main/java/com/facebook/presto/operator/OperatorContext.java b/presto-main/src/main/java/com/facebook/presto/operator/OperatorContext.java
index 472b3ce..129964d 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/OperatorContext.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/OperatorContext.java
@@ -250,7 +250,7 @@
                 }
             });
         }
-        long newReservation = memoryReservation.getAndAdd(bytes);
+        long newReservation = memoryReservation.addAndGet(bytes);
         if (newReservation > maxMemoryReservation) {
             memoryReservation.getAndAdd(-bytes);
             throw new ExceededMemoryLimitException(getMaxMemorySize());
@@ -263,7 +263,7 @@
             return false;
         }
 
-        long newReservation = memoryReservation.getAndAdd(bytes);
+        long newReservation = memoryReservation.addAndGet(bytes);
         if (newReservation > maxMemoryReservation) {
             memoryReservation.getAndAdd(-bytes);
             return false;
