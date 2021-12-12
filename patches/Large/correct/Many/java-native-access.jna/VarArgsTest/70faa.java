diff --git a/jnalib/test/com/sun/jna/VarArgsTest.java b/jnalib/test/com/sun/jna/VarArgsTest.java
index 094ac58..e988be3 100644
--- a/jnalib/test/com/sun/jna/VarArgsTest.java
+++ b/jnalib/test/com/sun/jna/VarArgsTest.java
@@ -61,7 +61,7 @@
     }
     
     public void testAppendNullToVarargs() {
-        Object[] args = new Object[] { new Integer(1) };
+        Number[] args = new Number[] { new Integer(1) };
         assertEquals("No trailing NULL was appended to varargs list",
                      1, TestLibrary.INSTANCE.addInt32VarArgs("dd", args));
     }
