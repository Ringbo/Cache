diff --git a/platform/util/testSrc/com/intellij/util/SmartListTest.java b/platform/util/testSrc/com/intellij/util/SmartListTest.java
index 035e040..c474e82 100644
--- a/platform/util/testSrc/com/intellij/util/SmartListTest.java
+++ b/platform/util/testSrc/com/intellij/util/SmartListTest.java
@@ -79,7 +79,7 @@
 
     l.set(2, 3);
     assertEquals(3, l.size());
-    assertEquals(++modCount, l.getModificationCount());
+    assertEquals(modCount, l.getModificationCount());
     assertEquals("[1, 2, 3]", l.toString());
 
     l.clear();
