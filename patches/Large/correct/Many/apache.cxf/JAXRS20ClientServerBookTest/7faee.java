diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRS20ClientServerBookTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRS20ClientServerBookTest.java
index 6d924ac..f1838f9 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRS20ClientServerBookTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRS20ClientServerBookTest.java
@@ -484,7 +484,7 @@
     
     private static class CustomInvocationCallback implements InvocationCallback<List<Book>> {
         private Holder<List<Book>> holder;
-        public CustomInvocationCallback(Holder<List<Book>> holder) {
+        CustomInvocationCallback(Holder<List<Book>> holder) {
             this.holder = holder;
         }
         
@@ -503,7 +503,7 @@
     }
     private static class GenericInvocationCallback<T> implements InvocationCallback<T> {
         private Holder<T> holder;
-        public GenericInvocationCallback(Holder<T> holder) {
+        GenericInvocationCallback(Holder<T> holder) {
             this.holder = holder;
         }
         
