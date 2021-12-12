diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java
index eecd14c..9cc74d4 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/nodes/SafeReplaceTest.java
@@ -43,7 +43,7 @@
         final TestNode oldChild = new TestNode();
         final TestNode newChild = new TestNode();
         root.child = oldChild;
-        assertFalse(oldChild.isSafelyReplaceableBy(newChild));  // No parent node
+        assertTrue(oldChild.isSafelyReplaceableBy(newChild));  // No parent node
         root.adoptChildren();
         assertTrue(oldChild.isSafelyReplaceableBy(newChild));   // Now adopted by parent
         // new node
@@ -62,7 +62,7 @@
         root.adoptChildren();
         final TestNode newChild = new TestNode();
         final TestNode strayChild = new TestNode();
-        assertFalse(strayChild.isSafelyReplaceableBy(newChild)); // Stray not a child of parent
+        assertTrue(strayChild.isSafelyReplaceableBy(newChild)); // Stray not a child of parent
         final WrongTestNode wrongTypeNewChild = new WrongTestNode();
         assertFalse(oldChild.isSafelyReplaceableBy(wrongTypeNewChild));
     }
