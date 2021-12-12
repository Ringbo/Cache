diff --git a/modules/activiti-spring/src/main/java/org/activiti/spring/SpringExpressionManager.java b/modules/activiti-spring/src/main/java/org/activiti/spring/SpringExpressionManager.java
index 8923a5f..836a9eb 100644
--- a/modules/activiti-spring/src/main/java/org/activiti/spring/SpringExpressionManager.java
+++ b/modules/activiti-spring/src/main/java/org/activiti/spring/SpringExpressionManager.java
@@ -58,7 +58,7 @@
     
     if(beans != null) {
       // Only expose limited set of beans in expressions
-      compositeElResolver.add(new ReadonlyMapELResolver(beans));
+      compositeElResolver.add(new ReadOnlyMapELResolver(beans));
     } else {
       // Expose full application-context in expressions
       compositeElResolver.add(new ApplicationContextElResolver(applicationContext));
