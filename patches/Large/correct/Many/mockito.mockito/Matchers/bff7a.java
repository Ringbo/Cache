diff --git a/src/org/mockito/Matchers.java b/src/org/mockito/Matchers.java
index 16f1b5b..7a89556 100644
--- a/src/org/mockito/Matchers.java
+++ b/src/org/mockito/Matchers.java
@@ -359,7 +359,7 @@
      * @return <code>null</code>.
      */
     public static <T> T isA(Class<T> clazz) {
-        return reportMatcher(new InstanceOf(clazz)).<T>returnNull();
+        return reportMatcher(new InstanceOf(clazz)).<T>returnFor(clazz);
     }
 
     /**
@@ -476,7 +476,7 @@
      * @return <code>null</code>.
      */
     public static <T> T eq(T value) {
-        return reportMatcher(new Equals(value)).<T>returnNull();
+        return (T) reportMatcher(new Equals(value)).<T>returnFor((Class) value.getClass());
     }  
 
     /**
@@ -513,7 +513,7 @@
      * @return <code>null</code>.
      */
     public static <T> T same(T value) {
-        return reportMatcher(new Same(value)).<T>returnNull();
+        return (T) reportMatcher(new Same(value)).<T>returnFor((Class) value.getClass());
     }
 
     /**
