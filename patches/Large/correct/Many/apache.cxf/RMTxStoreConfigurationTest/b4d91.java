diff --git a/rt/ws/rm/src/test/java/org/apache/cxf/ws/rm/persistence/jdbc/RMTxStoreConfigurationTest.java b/rt/ws/rm/src/test/java/org/apache/cxf/ws/rm/persistence/jdbc/RMTxStoreConfigurationTest.java
index 770dce6..dcaabcc 100644
--- a/rt/ws/rm/src/test/java/org/apache/cxf/ws/rm/persistence/jdbc/RMTxStoreConfigurationTest.java
+++ b/rt/ws/rm/src/test/java/org/apache/cxf/ws/rm/persistence/jdbc/RMTxStoreConfigurationTest.java
@@ -56,8 +56,8 @@
         assertNotNull(manager);
         RMTxStore store = (RMTxStore)manager.getStore();
                 
-        assertTrue(store.isTableExistsError(new SQLException("Table exists", "I6000", 288, null)));
+        assertTrue(store.isTableExistsError(new SQLException("Table exists", "I6000", 288)));
         
-        assertFalse(store.isTableExistsError(new SQLException("Unknown error", "00000", -1, null)));
+        assertFalse(store.isTableExistsError(new SQLException("Unknown error", "00000", -1)));
     }
 }
