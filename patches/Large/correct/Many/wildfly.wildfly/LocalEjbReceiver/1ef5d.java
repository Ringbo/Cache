diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/remote/LocalEjbReceiver.java b/ejb3/src/main/java/org/jboss/as/ejb3/remote/LocalEjbReceiver.java
index b40f905..d6c4c54 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/remote/LocalEjbReceiver.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/remote/LocalEjbReceiver.java
@@ -309,7 +309,7 @@
         }
 
         public Object getResult() throws Exception {
-            throw (Exception) LocalEjbReceiver.clone(invocation.getInvokedMethod().getReturnType(), resultCloner, exception, allowPassByReference);
+            throw (Exception) LocalEjbReceiver.clone(resultCloner, exception);
         }
 
         public void discardResult() {
