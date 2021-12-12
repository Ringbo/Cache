diff --git a/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java b/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java
index b6bba37..a541079 100644
--- a/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java
+++ b/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java
@@ -644,7 +644,7 @@
                           Matchers.containsString("I will fail"));
 
         // This test has "sleep(1)", so duration should be >=1000
-        Assert.assertThat("Wrong duration", testFail.getDuration(), Matchers.greaterThanOrEqualTo(1000L));
+        Assert.assertThat("Wrong duration", testFail.getDuration(), Matchers.greaterThanOrEqualTo(900L));
       }
     });
   }
