diff --git a/components/camel-spring/src/test/java/org/apache/camel/spring/remoting/MyMultiArgumentServiceInterface.java b/components/camel-spring/src/test/java/org/apache/camel/spring/remoting/MyMultiArgumentServiceInterface.java
index 175b969..49b1129 100644
--- a/components/camel-spring/src/test/java/org/apache/camel/spring/remoting/MyMultiArgumentServiceInterface.java
+++ b/components/camel-spring/src/test/java/org/apache/camel/spring/remoting/MyMultiArgumentServiceInterface.java
@@ -18,6 +18,6 @@
 
 public interface MyMultiArgumentServiceInterface {
 
-    public void doSomething(String arg1, String arg2, Long arg3);
+    void doSomething(String arg1, String arg2, Long arg3);
 
 }
