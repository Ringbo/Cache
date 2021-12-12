diff --git a/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/list/FlowCursorListTest.java b/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/list/FlowCursorListTest.java
index ee82bb2..b311559 100644
--- a/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/list/FlowCursorListTest.java
+++ b/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/list/FlowCursorListTest.java
@@ -57,7 +57,7 @@
 
         assertEquals(TestQueryModel.class, cursorList.table());
         assertTrue(cursorList.cachingEnabled());
-        assertEquals(0, cursorList.cacheSize());
+        assertEquals(50, cursorList.cacheSize());
 
         cursorList.close();
     }
