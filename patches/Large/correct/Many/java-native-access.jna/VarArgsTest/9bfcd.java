diff --git a/test/com/sun/jna/VarArgsTest.java b/test/com/sun/jna/VarArgsTest.java
index aeb1473..a10938a 100644
--- a/test/com/sun/jna/VarArgsTest.java
+++ b/test/com/sun/jna/VarArgsTest.java
@@ -43,7 +43,7 @@
         public int addVarArgs(String fmt, Number... args);
         public String returnStringVarArgs(String fmt, Object... args);
         public void modifyStructureVarArgs(String fmt, Object arg1, Object... args);
-        public String returnStringVarArgs(String... args);
+        public String returnStringVarArgs2(String... args);
     }
     TestLibrary lib;
     @Override
@@ -93,7 +93,7 @@
     public void testStringVarArgsFull() {
         Object[] args = new Object[] { "Test" };
         assertEquals("Did not return correct string", args[0],
-                     lib.returnStringVarArgs("", "Test"));
+                     lib.returnStringVarArgs2("", "Test"));
     }
 
     public void testAppendNullToVarargs() {
