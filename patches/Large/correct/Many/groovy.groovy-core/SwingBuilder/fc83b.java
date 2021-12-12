diff --git a/src/main/groovy/swing/SwingBuilder.java b/src/main/groovy/swing/SwingBuilder.java
index 844a44a..ff4019e 100644
--- a/src/main/groovy/swing/SwingBuilder.java
+++ b/src/main/groovy/swing/SwingBuilder.java
@@ -724,7 +724,7 @@
             BoxLayout answer = new BoxLayout(target, axis);
 
             // now let's try to set the layout property
-            InvokerHelper.setProperty(parent, "layout", answer);
+            InvokerHelper.setProperty(target, "layout", answer);
             return answer;
         } else {
             throw new RuntimeException("Must be nested inside a Container");
