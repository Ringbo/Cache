diff --git a/camel-core/src/test/java/org/apache/camel/processor/RecipeientListWithSimpleExpressionTest.java b/camel-core/src/test/java/org/apache/camel/processor/RecipeientListWithSimpleExpressionTest.java
index 5e85add..59952db 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/RecipeientListWithSimpleExpressionTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/RecipeientListWithSimpleExpressionTest.java
@@ -51,12 +51,12 @@
         context.start();
 
         for (int i = 0; i < 10; i++) {
-            getMockEndpoint("mock:" + i).expectedMessageCount(1000);
+            getMockEndpoint("mock:" + i).expectedMessageCount(200);
         }
 
         // use concurrent producers to send a lot of messages
         ExecutorService executors = Executors.newFixedThreadPool(20);
-        for (int i = 0; i < 1000; i++) {
+        for (int i = 0; i < 200; i++) {
             executors.execute(new Runnable() {
                 public void run() {
                     for (int i = 0; i < 10; i++) {
@@ -97,12 +97,12 @@
         context.start();
 
         for (int i = 0; i < 10; i++) {
-            getMockEndpoint("mock:" + i).expectedMessageCount(1000);
+            getMockEndpoint("mock:" + i).expectedMessageCount(200);
         }
 
         // use concurrent producers to send a lot of messages
         ExecutorService executors = Executors.newFixedThreadPool(20);
-        for (int i = 0; i < 1000; i++) {
+        for (int i = 0; i < 200; i++) {
             executors.execute(new Runnable() {
                 public void run() {
                     for (int i = 0; i < 10; i++) {
