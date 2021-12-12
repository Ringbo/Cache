diff --git a/jta/user-transaction/src/test/java/org/javaee7/jta/UserTransactionTest.java b/jta/user-transaction/src/test/java/org/javaee7/jta/UserTransactionTest.java
index 41fb57e..a0cf1b2 100644
--- a/jta/user-transaction/src/test/java/org/javaee7/jta/UserTransactionTest.java
+++ b/jta/user-transaction/src/test/java/org/javaee7/jta/UserTransactionTest.java
@@ -23,8 +23,7 @@
     @Deployment
     public static Archive<?> deploy() {
         return ShrinkWrap.create(JavaArchive.class)
-                         .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
-        // WF 8.0.0.Beta1 needs the beans.xml file. Shouldn't be the case with JavaEE 7
+                         .addAsManifestResource("beans.xml");
     }
 
     @Inject UserTransaction ut;
