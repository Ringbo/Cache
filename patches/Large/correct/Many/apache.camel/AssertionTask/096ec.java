diff --git a/components/camel-mock/src/main/java/org/apache/camel/component/mock/AssertionTask.java b/components/camel-mock/src/main/java/org/apache/camel/component/mock/AssertionTask.java
index 347ba0d..e5022b6 100644
--- a/components/camel-mock/src/main/java/org/apache/camel/component/mock/AssertionTask.java
+++ b/components/camel-mock/src/main/java/org/apache/camel/component/mock/AssertionTask.java
@@ -26,6 +26,6 @@
      *
      * @param index the n'th received message
      */
-    public void assertOnIndex(int index);
+    void assertOnIndex(int index);
 
 }
