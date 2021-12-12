diff --git a/plugins/ui-designer/testData/ChainedConstructorTest.java b/plugins/ui-designer/testData/ChainedConstructorTest.java
index 7634a4d..86668c7 100644
--- a/plugins/ui-designer/testData/ChainedConstructorTest.java
+++ b/plugins/ui-designer/testData/ChainedConstructorTest.java
@@ -25,7 +25,7 @@
   }
 
   public ChainedConstructorTest(String[] names, boolean mode) {
-    myList = new JBList();
+    myList = new JList();
     myScrollPane.setViewportView(myList);
   }
 }
