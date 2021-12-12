diff --git a/src/org/mockito/internal/progress/NewOngoingStubbing.java b/src/org/mockito/internal/progress/NewOngoingStubbing.java
index ed17815..8a81095 100644
--- a/src/org/mockito/internal/progress/NewOngoingStubbing.java
+++ b/src/org/mockito/internal/progress/NewOngoingStubbing.java
@@ -42,7 +42,7 @@
      *
      * @return ongoingStubbing object that allows stubbing consecutive calls
      */
-    NewOngoingStubbing<T> thenReturn(Object value);
+    NewOngoingStubbing<T> thenReturn(T value);
 
     /**
      * Sets consecutive return values to be returned when the method is called. E.g:
@@ -57,7 +57,7 @@
      *
      * @return ongoingStubbing object that allows stubbing consecutive calls
      */
-    NewOngoingStubbing<T> thenReturn(Object value, Object... values);
+    NewOngoingStubbing<T> thenReturn(T value, T... values);
 
     /**
      * Sets Throwable objects to be thrown when the method is called. E.g:
