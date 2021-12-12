diff --git a/common/src/test/java/com/thoughtworks/go/domain/builder/pluggableTask/PluggableTaskConsoleTest.java b/common/src/test/java/com/thoughtworks/go/domain/builder/pluggableTask/PluggableTaskConsoleTest.java
index ce6c23d..7196c1b 100644
--- a/common/src/test/java/com/thoughtworks/go/domain/builder/pluggableTask/PluggableTaskConsoleTest.java
+++ b/common/src/test/java/com/thoughtworks/go/domain/builder/pluggableTask/PluggableTaskConsoleTest.java
@@ -105,10 +105,10 @@
                 + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui \n"
                 + "officia deserunt mollit anim id est laborum.");
 
-        doNothing().when(safeOutputStreamConsumer).stdOutput(anyString());
+        doNothing().when(safeOutputStreamConsumer).errOutput(anyString());
         console.readErrorOf(in);
         Thread.sleep(100);// may become flaky!! Fingers crossed
-        verify(safeOutputStreamConsumer, times(7)).stdOutput(anyString());
+        verify(safeOutputStreamConsumer, times(7)).errOutput(anyString());
     }
 
 }
