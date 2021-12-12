diff --git a/jpa/spi/src/main/java/org/jboss/as/jpa/JpaMessages.java b/jpa/spi/src/main/java/org/jboss/as/jpa/JpaMessages.java
index a734b84..0d46830 100644
--- a/jpa/spi/src/main/java/org/jboss/as/jpa/JpaMessages.java
+++ b/jpa/spi/src/main/java/org/jboss/as/jpa/JpaMessages.java
@@ -100,7 +100,7 @@
      */
     @Message(id = 11424, value = "Container managed entity manager can only be closed by the container " +
             "(auto-cleared at tx/invocation end and closed when owning component is closed.)")
-    IllegalArgumentException cannotCloseTransactionContainerEntityManger();
+    IllegalStateException cannotCloseTransactionContainerEntityManger();
 
     /**
      * Creates an exception indicating the inability to create an instance of the adapter class represented by the
