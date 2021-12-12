diff --git a/jpa/locking-optimistic/src/test/java/org/javaee7/jpa/locking/optimistic/LockingOptimisticTest.java b/jpa/locking-optimistic/src/test/java/org/javaee7/jpa/locking/optimistic/LockingOptimisticTest.java
index 47befac..1325b4b 100644
--- a/jpa/locking-optimistic/src/test/java/org/javaee7/jpa/locking/optimistic/LockingOptimisticTest.java
+++ b/jpa/locking-optimistic/src/test/java/org/javaee7/jpa/locking/optimistic/LockingOptimisticTest.java
@@ -39,7 +39,7 @@
             .addAsResource("META-INF/persistence.xml")
             .addAsResource("META-INF/load.sql")
             .addAsWebInfResource(
-                new StringAsset(beansXml.createAlternatives()
+                new StringAsset(beansXml.getOrCreateAlternatives()
                     .clazz(MovieBeanAlternative.class.getName()).up().exportAsString()),
                 beansXml.getDescriptorName());
         System.out.println(war.toString(true));
