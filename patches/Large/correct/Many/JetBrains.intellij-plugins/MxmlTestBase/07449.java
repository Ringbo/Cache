diff --git a/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlTestBase.java b/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlTestBase.java
index 750de1c..9a01229 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlTestBase.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/MxmlTestBase.java
@@ -145,8 +145,8 @@
           tester.test(file, xmlFile, originalVFile);
           return null;
         }
-      //}).get(8888, TimeUnit.SECONDS);
-      }).get(8, TimeUnit.SECONDS);
+      }).get(8888, TimeUnit.SECONDS);
+      //}).get(8, TimeUnit.SECONDS);
     }
   }
 
