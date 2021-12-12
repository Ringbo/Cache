diff --git a/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java b/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java
index 90a5fa7..773ebd1 100644
--- a/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java
+++ b/src/test/org/codehaus/groovy/runtime/InvokeMethodTest.java
@@ -161,7 +161,7 @@
             invoke(null, "mockCallWithNoParams", null);
             fail("Should have thrown an exception");
         }
-        catch (InvokerException e) {
+        catch (NullPointerException e) {
             // worked
         }
     }
