diff --git a/src/test/java/com/zaxxer/hikari/TestConcurrentBag.java b/src/test/java/com/zaxxer/hikari/TestConcurrentBag.java
index a943487..397dc08 100644
--- a/src/test/java/com/zaxxer/hikari/TestConcurrentBag.java
+++ b/src/test/java/com/zaxxer/hikari/TestConcurrentBag.java
@@ -103,15 +103,15 @@
       Assert.assertEquals(0, bag.values(8).size());
 
       HikariPool pool = TestElf.getPool(ds);
-      PoolBagEntry reserved = new PoolBagEntry(null, TestElf.getPool(ds));
+      PoolBagEntry reserved = new PoolBagEntry(null, 0, TestElf.getPool(ds));
       bag.add(reserved);
       bag.reserve(reserved);      // reserved
 
-      PoolBagEntry inuse = new PoolBagEntry(null, pool);
+      PoolBagEntry inuse = new PoolBagEntry(null, 0, pool);
       bag.add(inuse);
       bag.borrow(2, TimeUnit.MILLISECONDS); // in use
       
-      PoolBagEntry notinuse = new PoolBagEntry(null, pool);
+      PoolBagEntry notinuse = new PoolBagEntry(null, 0, pool);
       bag.add(notinuse); // not in use
 
       bag.dumpState();
@@ -135,7 +135,7 @@
 
       bag.close();
       try {
-         PoolBagEntry bagEntry = new PoolBagEntry(null, pool);
+         PoolBagEntry bagEntry = new PoolBagEntry(null, 0, pool);
          bag.add(bagEntry);
          Assert.assertNotEquals(bagEntry, bag.borrow(100, TimeUnit.MILLISECONDS));
       }
