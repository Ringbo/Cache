diff --git a/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java b/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java
index 4e9a7c2..e6c6657 100644
--- a/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java
+++ b/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java
@@ -814,7 +814,7 @@
             catch (IgniteFutureCancelledCheckedException e) {
                 resFut.onCancelled();
             }
-            catch (IgniteCheckedException e) {
+            catch (Throwable e) {
                 resFut.onDone(e);
             }
         });
