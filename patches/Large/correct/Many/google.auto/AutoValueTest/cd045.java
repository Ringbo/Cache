diff --git a/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java b/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java
index 333e6ec..94d2e9e 100644
--- a/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java
+++ b/value/src/it/functional/src/test/java/com/google/auto/value/AutoValueTest.java
@@ -1032,7 +1032,7 @@
       for (int j = 0; j < versions.length; j++) {
         int actual = Integer.signum(versions[i].compareTo(versions[j]));
         int expected = Integer.signum(i - j);
-        assertEquals(actual, expected);
+        assertEquals(expected, actual);
       }
     }
   }
