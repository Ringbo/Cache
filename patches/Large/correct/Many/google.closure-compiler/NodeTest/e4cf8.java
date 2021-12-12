diff --git a/test/com/google/javascript/rhino/NodeTest.java b/test/com/google/javascript/rhino/NodeTest.java
index 5b5ad2b..6ad4d06 100644
--- a/test/com/google/javascript/rhino/NodeTest.java
+++ b/test/com/google/javascript/rhino/NodeTest.java
@@ -107,13 +107,13 @@
 
   public void testCheckTreeEqualsBooleanSame() {
     Node node1 = new Node(1);
-    assertEquals(true, node1.checkTreeEqualsSilent(node1));
+    assertEquals(true, node1.isEquivalentTo(node1));
   }
 
   public void testCheckTreeEqualsBooleanDifferent() {
     Node node1 = new Node(1);
     Node node2 = new Node(2);
-    assertEquals(false, node1.checkTreeEqualsSilent(node2));
+    assertEquals(false, node1.isEquivalentTo(node2));
   }
 
   public void testCheckTreeEqualsImplDifferentIncProp() {
@@ -130,7 +130,7 @@
     node1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
     Node node2 = Node.newString(Token.NAME, "f");
     node2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
-    assertTrue(node1.checkTreeTypeAwareEqualsSilent(node2));
+    assertTrue(node1.isEquivalentToTyped(node2));
   }
 
   public void testCheckTreeTypeAwareEqualsSameNull() {
@@ -138,7 +138,7 @@
     JSTypeRegistry registry = new JSTypeRegistry(testErrorReporter);
     Node node1 = Node.newString(Token.NAME, "f");
     Node node2 = Node.newString(Token.NAME, "f");
-    assertTrue(node1.checkTreeTypeAwareEqualsSilent(node2));
+    assertTrue(node1.isEquivalentToTyped(node2));
   }
 
   public void testCheckTreeTypeAwareEqualsDifferent() {
@@ -148,7 +148,7 @@
     node1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
     Node node2 = Node.newString(Token.NAME, "f");
     node2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
-    assertFalse(node1.checkTreeTypeAwareEqualsSilent(node2));
+    assertFalse(node1.isEquivalentToTyped(node2));
   }
 
   public void testCheckTreeTypeAwareEqualsDifferentNull() {
@@ -157,7 +157,7 @@
     Node node1 = Node.newString(Token.NAME, "f");
     node1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
     Node node2 = Node.newString(Token.NAME, "f");
-    assertFalse(node1.checkTreeTypeAwareEqualsSilent(node2));
+    assertFalse(node1.isEquivalentToTyped(node2));
   }
 
   public void testVarArgs1() {
