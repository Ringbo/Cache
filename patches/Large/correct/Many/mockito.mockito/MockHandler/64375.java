diff --git a/src/org/mockito/internal/MockHandler.java b/src/org/mockito/internal/MockHandler.java
index 6350bbd..608c587 100644
--- a/src/org/mockito/internal/MockHandler.java
+++ b/src/org/mockito/internal/MockHandler.java
@@ -137,16 +137,16 @@
     }
 
     private abstract class BaseStubbing implements NewOngoingStubbing<T>, DeprecatedOngoingStubbing<T> {
-        public NewOngoingStubbing<T> thenReturn(Object value) {
+        public NewOngoingStubbing<T> thenReturn(T value) {
             return thenAnswer(new Returns(value));
         }
 
-        public NewOngoingStubbing<T> thenReturn(Object value, Object... values) {
+        public NewOngoingStubbing<T> thenReturn(T value, T... values) {
             NewOngoingStubbing<T> stubbing = thenReturn(value);            
             if (values == null) {
                 return stubbing.thenReturn(null);
             }
-            for (Object v: values) {
+            for (T v: values) {
                 stubbing = stubbing.thenReturn(v);
             }
             return stubbing;
@@ -171,7 +171,7 @@
             return stubbing;
         }        
 
-        public DeprecatedOngoingStubbing<T> toReturn(Object value) {
+        public DeprecatedOngoingStubbing<T> toReturn(T value) {
             return toAnswer(new Returns(value));
         }
 
