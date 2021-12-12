diff --git a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
index 6d5d73a..c79ff48 100755
--- a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
+++ b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
@@ -12,7 +12,7 @@
 import java.util.Arrays;
 
 public class DRFTest extends TestUtil {
-  @BeforeClass public static void stall() { stall_till_cloudsize(1); }
+  @BeforeClass public static void stall() { stall_till_cloudsize(5); }
 
   abstract static class PrepData { abstract int prep(Frame fr); }
 
@@ -256,10 +256,10 @@
               }
             },
             7,
-            a(a(4051, 15612), //for 5-node
-              a(1397, 20322)),
-//            a(a(4396, 15269), //for 1-node
-//              a(1740, 19993)),
+            a(a(7958, 11707), //1-node
+              a(2709, 19024)),
+//          a(a(7841, 11822), //5-node
+//            a(2666, 19053)),
             s("NO", "YES"));
   }
 
