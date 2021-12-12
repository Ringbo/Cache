diff --git a/src/main/java/org/testng/junit/JUnit4TestRunner.java b/src/main/java/org/testng/junit/JUnit4TestRunner.java
index 5c482ed..415a4a5 100644
--- a/src/main/java/org/testng/junit/JUnit4TestRunner.java
+++ b/src/main/java/org/testng/junit/JUnit4TestRunner.java
@@ -121,7 +121,7 @@
                     l.onTestSuccess(tr);
                 }
             }
-            m_parentRunner.addInvokedMethod(new InvokedMethod(tr.getTestClass(), tr.getMethod(), new Object[0], true, false, tr.getStartMillis()));
+            m_parentRunner.addInvokedMethod(new InvokedMethod(tr.getTestClass(), tr.getMethod(), new Object[0], true, false, tr.getStartMillis(), tr));
             m_methods.add(tr.getMethod());
         }
 
@@ -134,7 +134,7 @@
             for (ITestListener l : m_listeners) {
                 l.onTestSkipped(tr);
             }
-            m_parentRunner.addInvokedMethod(new InvokedMethod(tr.getTestClass(), tr.getMethod(), new Object[0], true, false, tr.getStartMillis()));
+            m_parentRunner.addInvokedMethod(new InvokedMethod(tr.getTestClass(), tr.getMethod(), new Object[0], true, false, tr.getStartMillis(), tr));
             m_methods.add(tr.getMethod());
         }
 
