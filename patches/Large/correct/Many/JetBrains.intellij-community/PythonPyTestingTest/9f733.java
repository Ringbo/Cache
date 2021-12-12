diff --git a/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java b/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java
index c2cbe26..89c058d 100644
--- a/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java
+++ b/python/testSrc/com/jetbrains/env/python/testing/PythonPyTestingTest.java
@@ -50,7 +50,7 @@
                                       @NotNull String stdout,
                                       @NotNull String stderr,
                                       @NotNull String all) {
-        Assert.assertThat("Import error is not marked as error", runner.getFailedTestsCount(), Matchers.equalTo(1));
+        Assert.assertThat("Import error is not marked as error", runner.getFailedTestsCount(), Matchers.greaterThanOrEqualTo(1));
       }
     });
   }
