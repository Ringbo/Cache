diff --git a/python/testSrc/com/jetbrains/python/PyQuickFixTest.java b/python/testSrc/com/jetbrains/python/PyQuickFixTest.java
index 5ebbd6b..eb49376 100644
--- a/python/testSrc/com/jetbrains/python/PyQuickFixTest.java
+++ b/python/testSrc/com/jetbrains/python/PyQuickFixTest.java
@@ -293,7 +293,7 @@
   }
 
   public void testAddEncoding() {                      //PY-491
-    doInspectionTest("AddEncoding.py", PyByteLiteralInspection.class,
+    doInspectionTest("AddEncoding.py", PyMandatoryEncodingInspection.class,
                      PyBundle.message("QFIX.add.encoding"), true, true);
   }
 
