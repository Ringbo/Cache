diff --git a/tools/common/src/main/java/org/apache/cxf/tools/common/ToolException.java b/tools/common/src/main/java/org/apache/cxf/tools/common/ToolException.java
index e353b23..5fc2cda 100644
--- a/tools/common/src/main/java/org/apache/cxf/tools/common/ToolException.java
+++ b/tools/common/src/main/java/org/apache/cxf/tools/common/ToolException.java
@@ -112,13 +112,13 @@
 
         // Print suppressed exceptions, if any
         for (Throwable se : suppressed) {
-            printThrowable(se, ps, pfx + "/t", "Suppressed: ");
+            printThrowable(se, ps, pfx + "\t", "Suppressed: ");
         }
 
         // Print cause, if any
         Throwable ourCause = getCause();
         if (ourCause != null && (!hasSuppressed || ourCause != suppressed.get(0))) {
-            printThrowable(ourCause, ps, pfx + "/t", "Caused by: ");
+            printThrowable(ourCause, ps, pfx + "\t", "Caused by: ");
         }
     }    
     private void printThrowable(Throwable t, PrintStream ps, String pfx, String cap) {
@@ -143,7 +143,7 @@
             this.getClass().getMethod("addSuppressed", Throwable.class).invoke(this, t);
         } catch (Throwable t2) {
             //java < 1.7
-            suppressed.add(t2);
+            suppressed.add(t);
             if (getCause() == null) {
                 initCause(t);
             }
