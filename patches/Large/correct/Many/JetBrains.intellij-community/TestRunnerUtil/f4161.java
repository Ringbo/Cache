diff --git a/plugins/junit_rt/src/com/intellij/junit3/TestRunnerUtil.java b/plugins/junit_rt/src/com/intellij/junit3/TestRunnerUtil.java
index d4898ee..59eae40 100644
--- a/plugins/junit_rt/src/com/intellij/junit3/TestRunnerUtil.java
+++ b/plugins/junit_rt/src/com/intellij/junit3/TestRunnerUtil.java
@@ -131,7 +131,7 @@
             return new FailedTestCase(testClass, BaseTestRunner.SUITE_METHODNAME, message, e);
           }
         }
-        catch (Exception e) {
+        catch (Throwable e) {
           // try to extract a test suite automatically
           runner.clearStatus();
           test = new TestSuite(testClass);
@@ -155,7 +155,7 @@
       }
       runner.runFailed(MessageFormat.format(ourBundle.getString("junit.class.not.found"), new Object[] {clazz}));
     }
-    catch (Exception e) {
+    catch (Throwable e) {
       runner.runFailed(MessageFormat.format(ourBundle.getString("junit.cannot.instantiate.tests"), new Object[]{e.toString()}));
     }
     return null;
@@ -196,7 +196,7 @@
         return new FailedTestCase(testClass, methodName, message, e1);
       }
     }
-    catch (Exception e) {
+    catch (Throwable e) {
       String message = MessageFormat.format(ourBundle.getString("junit.cannot.instantiate.tests"), new Object[]{e.toString()});
       return new FailedTestCase(testClass, methodName, message, e);
     }
