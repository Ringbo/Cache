diff --git a/src/main/org/testng/TestRunner.java b/src/main/org/testng/TestRunner.java
index f595d58..d23b72f 100644
--- a/src/main/org/testng/TestRunner.java
+++ b/src/main/org/testng/TestRunner.java
@@ -261,8 +261,7 @@
                                    m_testName,
                                    testMethodFinder,
                                    m_annotationFinder,
-                                   m_runInfo,
-                                   this);
+                                   m_runInfo);
       m_classMap.put(ic.getRealClass(), tc);
     }
     
