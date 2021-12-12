diff --git a/guava-testlib/src/com/google/common/testing/NullPointerTester.java b/guava-testlib/src/com/google/common/testing/NullPointerTester.java
index 3f7028a..1142056 100644
--- a/guava-testlib/src/com/google/common/testing/NullPointerTester.java
+++ b/guava-testlib/src/com/google/common/testing/NullPointerTester.java
@@ -292,7 +292,7 @@
     for (int i = 0; i < types.length; i++) {
       if (i != indexOfParamToSetToNull) {
         params[i] = defaults.get(types[i]);
-        if (!parameterIsPrimitiveOrNullable(func, indexOfParamToSetToNull)) {
+        if (!parameterIsPrimitiveOrNullable(func, i)) {
           Assert.assertTrue("No default value found for " + types[i].getName(),
               params[i] != null);
         }
