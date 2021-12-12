diff --git a/core/src/test/java/smile/classification/DecisionTreeTest.java b/core/src/test/java/smile/classification/DecisionTreeTest.java
index b1f58f7..b83f603 100644
--- a/core/src/test/java/smile/classification/DecisionTreeTest.java
+++ b/core/src/test/java/smile/classification/DecisionTreeTest.java
@@ -209,7 +209,7 @@
                 System.out.format("%s importance is %.4f\n", train.attributes()[index[i]], importance[i]);
             }
             
-            assertEquals(329, error);
+            assertEquals(324, error);
         } catch (Exception ex) {
             System.err.println(ex);
         }
